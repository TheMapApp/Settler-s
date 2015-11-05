import java.awt.Graphics;

public class Middlepoint {
	
	
	int _posx;
	int _posy;
	
	
	Middlepoint(int posx, int posy){
		
		System.out.println(posx+"+"+posy);
		
		_posy = posy;
		_posx = posx;
		
	
	}
	
	
	
	public void paint(Graphics g) {
		
		// draws the ellipse
		g.drawRect(_posx,_posy,15,15	);
		
		
	}

}
