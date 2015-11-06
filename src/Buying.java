import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Buying extends JFrame implements MouseListener{

	private JFrame frame;
	private JPanel p;
	private JButton buyRoad;
	private JLabel Road;
	
	
	/*public Buying(){
		createObjects();
		
	}
	
	
	public void createObjects(){
		frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p = new JPanel();
		p.setBackground(Color.YELLOW);
		
		buyRoad = new JButton("ROAD");
		Road = new JLabel("Road");
		
		p.add(buyRoad);
		p.add(Road);
		
		frame.add(p);
		
		
		
	}
	**/
	
	int width = 800;
	int height = 600;
	

	public void paint(Graphics g) { //method used for painting the ovals defining the buttons
			     			    
			     g.setColor(Color.GREEN);
			     g.fillOval(width - 100, height - 120, 70, 70);
			     g.setColor(Color.RED);
			     g.fillOval(width - 100, height - 200, 70, 70);
			     g.setColor(Color.BLUE);
			     g.fillOval(width - 100, height - 280, 70, 70);
			     
			  }

	
	/*public double dist(int x1, int x2, int y1, int y2 ){
		double dist;
		float xdif;
		float ydif;
		
			if(x1 > x2)
				xdif = x1 - x2;
			else 
				xdif = x2 - x1;
			if(y1 > y2)
				ydif = y1 - y2;
			else
				ydif = y2 - y1;
			
			dist = Math.sqrt(xdif*xdif+ydif*ydif);
			
		return dist;
		}
		*/
	
	
	@Override
	public void mouseClicked(MouseEvent arg0) {
		int nx = arg0.getX();
		int ny = arg0.getY();
		System.out.println("jjj");
		
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
