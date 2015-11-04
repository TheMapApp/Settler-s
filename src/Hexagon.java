import java.awt.Graphics;

public class Hexagon {
	
	//svennebanan
	int _posx;
	int _posy;
	
	Hexagon(int posx, int posy){
		
		System.out.println(posx+"+"+posy);
		
		_posy = posy;
		_posx = posx;
		
	
	}
	
	
	 public void paint(Graphics g) {
	int[] shapex = new int[6];
	int[] shapey = new int[6];
		 
		 int r = 30;
		 
		for(int i=0; i<6; i++) {
			shapex[i]=((int)(_posy + r*Math.cos(i*2*Math.PI/6)));
			shapey[i]=(int)(_posx + r*Math.sin(i*2*Math.PI/6));
			}
		g.drawPolygon(shapex, shapey, 6);
		
		
	}
	}


