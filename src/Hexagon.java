import java.awt.Graphics;
import java.awt.event.*;

import javax.swing.JPanel;

public class Hexagon extends JPanel {
	
	// the posistion of each hexagon
	int _posx;
	int _posy;
	
	Hexagon(int posx, int posy){
		
		
		
		_posy = posy;
		_posx = posx;
		
		
		 addMouseListener(new MouseAdapter() { 
	          public void mousePressed(MouseEvent g) { 
	            System.out.println("me"); 
	          } 
	        });
		
	
	}





	public void paint(Graphics g) {
		 
		 Middlepoint[] middlearray = new Middlepoint[6];
		 
		 //arrays filled with x and y vaules of the hexagon points
	int[] shapex = new int[6];
	int[] shapey = new int[6];
		 
		 int r = 57;
		 
		 //filles in the posisition of the points
		for(int i=0; i<6; i++) {
			shapex[i]=((int)(_posy + r*Math.cos(i*2*Math.PI/6)));
			shapey[i]=(int)(_posx + r*Math.sin(i*2*Math.PI/6));
			}
		
		
		// draws the hexagon
		g.drawPolygon(shapex, shapey, 6);
		
		for(int b=0; b<6;b++){
		middlearray[b]=new Middlepoint(shapex[b]-5, shapey[b]-5);
		middlearray[b].paint(g);
		}
	}
	}


