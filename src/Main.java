import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JPanel implements MouseListener {

	// CLIENT - SERVER STUFF START

	public static boolean houseSend = false;
	public static int tempX;
	public static int tempY;

	public static String ipconnect;
	public static int tcpPort = 54555, udpPort = 54555;

	// CLIENT - SERVER STUFF END

	// LOBBY STUFF START

	public static boolean lobby = true;
	public static boolean gameStart = false;
	Scanner reader = new Scanner(System.in);

	// LOBBY STUFF END

	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;

	Grid gamemap = new Grid(100, 100);
	static boolean updater = false;

	DiceRoller dice = new DiceRoller();
	Buying buy = new Buying();

	static Connecter connect = new Connecter();

	Main(int width, int height) {

		this.addMouseListener(buy);
		gamemap.fill();

		for (int k = 0; k < 5; k++) {
			for (int l = 0; l < 5; l++) {
				// some of the places in the array are empty because of the
				// 3,4,5,4,3 structure of the game map
				if (gamemap.hexarray[k][l] != null) {
					this.addMouseListener(gamemap.hexarray[k][l]);
				}
			}
		}
		dice.Roll();
		Grid gamemap = new Grid(200, 200);
	}

	public void update() {
		if (Grid.updater == true) {
			this.repaint();
			Grid.updater = false;
		}

		while (houseSend && gameStart) {
			System.out.println("Packet sent");
			connect.sendPacket(tempX, tempY);
			houseSend = false;
		}
	}

	@Override
	public void paint(Graphics g) {
		this.addMouseListener(this);

		if (lobby) {
			g.setColor(Color.GREEN);
			g.fillRect(WIDTH / 2 - 100, HEIGHT / 2 - 100, 200, 80);
			g.setColor(Color.RED);
			g.fillRect(WIDTH / 2 - 100, HEIGHT / 2 + 100, 200, 80);

		} else if (gameStart) {
			g.setColor(Color.BLUE);
			g.fillRect(0, 0, WIDTH, HEIGHT);
			// this for loop draws each hexagon
			for (int k = 0; k < 5; k++) {
				for (int l = 0; l < 5; l++) {
					// some of the places in the array are empty because of the
					// 3,4,5,4,3 structure of the game map
					if (gamemap.hexarray[k][l] != null) {
						this.addMouseListener(gamemap.hexarray[k][l]);
						gamemap.hexarray[k][l].paint(g);
					}
				}
			}
			buy.paint(g);// paints the circles for buttons
		}

	}

	public static void main(String[] args) {

		JFrame frame = new JFrame("Settler's"); // create a new window and set
												// title on window
		frame.setSize(WIDTH, HEIGHT); // set size of window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // set the window
																// to close when
																// the cross in
																// the corner is
																// pressed

		Main m = new Main(WIDTH, HEIGHT - 22);
		frame.add(m);
		frame.setVisible(true); // make the window visible

		while (true) { // keep running a loop
			// each time the loop is run do
			m.update();
			try {
				Thread.sleep(30); // stops this part of the program for 10
									// milliseconds to avoid the loop locking
									// everything. Now the screen has time to
									// update content etc.
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		int mx = e.getX();
		int my = e.getY();

		if (mx < WIDTH / 2 + 100 && mx > WIDTH / 2 - 100 && my < HEIGHT / 2 - 20 && my > HEIGHT / 2 - 100 && lobby) {

			e.consume();
			System.out.println("Enter the IP you want to connect to: ");
			ipconnect = reader.nextLine();

			try {
				connect.connect(ipconnect);
				Main.lobby = false;
				Main.gameStart = true;
			} catch (IOException e1) {
				e1.printStackTrace();
			}
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}