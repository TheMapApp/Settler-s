import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;
import javax.swing.ImageIcon;


	public class Buying extends JPanel implements MouseListener{

	
		Image image;
		
	
		   
	public void paint(Graphics g) { //method used for painting the ovals defining the buttons
				     	
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
				    
				    //this.paint(g);
				    addMouseListener(this);
	}

		  

		@Override
		public void mouseClicked(MouseEvent arg0) {
			int x = arg0.getX();
			int y = arg0.getY();
			
			
			
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
	}


