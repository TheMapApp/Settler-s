import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

	public class Buying extends JPanel implements MouseListener{

		Image image;
		   
	public void paint(Graphics g) {
				
			    g.setColor(Color.WHITE);
			    g.fillOval(WIDTH - 100, HEIGHT - 120, 70, 70);
			    g.setColor(Color.WHITE);
			    g.fillOval(WIDTH - 100, HEIGHT - 200, 70, 70);
			    g.setColor(Color.WHITE);
			    g.fillOval(WIDTH - 100, HEIGHT - 280, 70, 70);

			    ImageIcon road = new ImageIcon("images/Road.png");
			    image = road.getImage();
			    g.drawImage(image, WIDTH - 100, HEIGHT - 120 , null);
			    
			    ImageIcon house = new ImageIcon("images/House.png");
			    image = house.getImage();
			    g.drawImage(image, WIDTH - 100, HEIGHT - 200 , null);
			    
			    ImageIcon town = new ImageIcon("images/Town.png");
			    image = town.getImage();
			    g.drawImage(image, WIDTH - 100, HEIGHT - 280 , null);
			    
			    //this.paint(g);
			    addMouseListener(this);
                }

	 
	public double dist(int x1, int x2, int y1, int y2 ){
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

		@Override
		public void mouseClicked(MouseEvent e) {

			int mx = e.getX();
			int my = e.getY();
			
			if (mx > 800 - 100 && mx < 800 && my > 600 - 120 && my < 600) {
				System.out.println("3");
			}
			if (mx > 800 - 100 && mx < 800 && my > 600 - 200 && my < 600 - 120) {
				System.out.println("2");
			}
			if (mx > 800 - 100 && mx < 800 && my > 600 - 280 && my < 600 - 200) {
				System.out.println("1");
			}
		}

		public void mousePressed(MouseEvent e) {
		}

		public void mouseReleased(MouseEvent e) {
		}

		public void mouseEntered(MouseEvent e) {
		}

		public void mouseExited(MouseEvent e) {
		}
	}