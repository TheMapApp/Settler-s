import java.awt.Color;
	import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
	import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

	public class Buying extends JPanel implements MouseListener{

		
		Image image;
		
	
		   
	public void paint(Graphics g) { 
		
		int width = 800;
		int height = 600;
		
				
			    g.setColor(Color.WHITE);
			    g.fillOval(width - 100, height - 120, 70, 70);
			    g.setColor(Color.WHITE);
			    g.fillOval(width - 100, height - 200, 70, 70);
			    g.setColor(Color.WHITE);
			    g.fillOval(width - 100, height - 280, 70, 70);
			    
			   		
			    ImageIcon road = new ImageIcon("images/Road.png");
			    image = road.getImage();
			    g.drawImage(image, width - 100, height - 120 , null);
			    
			    ImageIcon house = new ImageIcon("images/House.png");
			    image = house.getImage();
			    g.drawImage(image, width - 100, height - 200 , null);
			    
			    ImageIcon town = new ImageIcon("images/Town.png");
			    image = town.getImage();
			    g.drawImage(image, width - 100, height - 280 , null);
			    
		
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
				 //create a confirmation window
			    JFrame frame = new JFrame("Yes/No"); 
		        frame.setSize(400, 200); //set size of window
		        frame.setVisible(true); //make the window visible
		        frame.setResizable(false);
		        frame.setLocation(200, 200);

			}
			
			
			if (mx > 800 - 100 && mx < 800 && my > 600 - 200 && my < 600 - 120) {
				System.out.println("2");
				 //create a confirmation window
			    JFrame frame = new JFrame("Yes/No"); 
		        frame.setSize(400, 200); //set size of window
		        frame.setVisible(true); //make the window visible
		        frame.setResizable(false);
		        frame.setLocation(200, 200);
		        
			}
			
			
			if (mx > 800 - 100 && mx < 800 && my > 600 - 280 && my < 600 - 200) {
				System.out.println("1");
				 //create a confirmation window
			    JFrame frame = new JFrame("Yes/No"); 
		        frame.setSize(200, 200); //set size of window
		        frame.setVisible(true); //make the window visible
		        frame.setResizable(false);
		        frame.setLocation(300, 200);
		        
			}
							
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

		
	}



