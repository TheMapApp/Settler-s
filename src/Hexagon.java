import java.awt.Graphics;

public class Hexagon {
	
	// the posistion of each hexagon
	int _posx;
	int _posy;
	
	Hexagon(int posx, int posy){
		
		System.out.println(posx+"+"+posy);
		
		_posy = posy;
		_posx = posx;
		
	
	}
	
	
	 public void paint(Graphics g) {
		 
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
		
		
	}
	}


