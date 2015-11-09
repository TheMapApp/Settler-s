import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class Hexagon extends JPanel implements MouseListener {

	// the posistion of each hexagon
	int _posx;
	int _posy;
	boolean itson = false;
	Color _color = new Color(0, 100, 0);
	Color _color2 = new Color(0, 0, 0);

	// arrays filled with x and y vaules of the hexagon points
	int[] shapex = new int[6];
	int[] shapey = new int[6];

	int r = 57;
	Middlepoint[] middlearray = new Middlepoint[6];

	Hexagon(int posx, int posy) {

		_posy = posy;
		_posx = posx;

		// filles in the posisition of the points
		for (int i = 0; i < 6; i++) {
			shapex[i] = ((int) (_posy + r * Math.cos(i * 2 * Math.PI / 6)));
			shapey[i] = (int) (_posx + r * Math.sin(i * 2 * Math.PI / 6));
		}
	}

	@Override
	public void paint(Graphics g) {

		// draws the hexagon
		g.setColor(_color2);
		g.drawPolygon(shapex, shapey, 6);

		if (itson == true) {
			g.setColor(_color);
			g.fillPolygon(shapex, shapey, 6);

		}

		for (int b = 0; b < 6; b++) {
			middlearray[b] = new Middlepoint(shapex[b] - 5, shapey[b] - 5);
			middlearray[b].paint(g);

			if (Grid.hus[1] != null) {
				Grid.hus[1].paint(g);
			}
			if (Grid.vej[1] != null) {
				Grid.vej[1].paint(g);
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		

		int mx = e.getX();
		int my = e.getY();


		for (int l = 0; l < 6; l++) {
			if (20 >= Math.sqrt((mx - shapex[l]) * (mx - shapex[l]) + (my - shapey[l]) * (my - shapey[l]))) {
				middlearray[l] = new Middlepoint(shapex[l] - 5, shapey[l] - 5);
				itson = true;

				if (Grid.hus[1] == null) {
					Grid.hus[1] = new House(mx, my);
				}

				if (dist(mx, Grid.hus[1]._xpos, my, Grid.hus[1]._ypos) <= 70)
					Grid.vej[1] = new Road(mx, my);

				System.out.println(dist(mx, Grid.hus[1]._xpos, my, Grid.hus[1]._ypos));
			
			}
		}
				
		Grid.updater = true;
		// System.out.println("hey"+Grid.updater);
						
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	public double dist(int x1, int x2, int y1, int y2) {
		double dist;
		float xdif;
		float ydif;

		if (x1 > x2)
			xdif = x1 - x2;
		else
			xdif = x2 - x1;
		if (y1 > y2)
			ydif = y1 - y2;
		else
			ydif = y2 - y1;

		dist = Math.sqrt(xdif * xdif + ydif * ydif);

		return dist;
	}

}
