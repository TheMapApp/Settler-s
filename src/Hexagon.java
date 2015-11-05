import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class Hexagon extends JPanel implements MouseListener {
	
	// the posistion of each hexagon
	int _posx;
	int _posy;
	boolean itson = false;
	
	
	 //arrays filled with x and y vaules of the hexagon points
int[] shapex = new int[6];
int[] shapey = new int[6];
	 
	 int r = 57;
	 Middlepoint[] middlearray = new Middlepoint[6];

	
	
	Hexagon(int posx, int posy){
		
		
		_posy = posy;
		_posx = posx;
		
		
		 //filles in the posisition of the points
		for(int i=0; i<6; i++) {
			shapex[i]=((int)(_posy + r*Math.cos(i*2*Math.PI/6)));
			shapey[i]=(int)(_posx + r*Math.sin(i*2*Math.PI/6));
			}
	}




	public void paint(Graphics g) {
		 
		
		
		// draws the hexagon
		g.drawPolygon(shapex, shapey, 6);
		
		if(itson==true){
			 g.fillPolygon(shapex, shapey, 6);
			
		
		}
		
		for(int b=0; b<6;b++){
		middlearray[b]=new Middlepoint(shapex[b]-5, shapey[b]-5);
		middlearray[b].paint(g);
		}
	}




	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		int mx = e.getX();
		int my = e.getY();
		
			for(int b=0; b<6;b++){
				if(20>=Math.sqrt((mx-shapex[b])*(mx-shapex[b]) + (my-shapey[b])*(my-shapey[b]))){
				middlearray[b]=new Middlepoint(shapex[b]-5, shapey[b]-5);
				itson =true;
				
			
				
				}
	}
			Grid.updater = true;
			System.out.println("hey"+Grid.updater);
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


