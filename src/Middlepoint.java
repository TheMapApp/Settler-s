import java.awt.Color;
import java.awt.Graphics;

public class Middlepoint {

	int _posx;
	int _posy;
	Color _color= new Color(0,0,0);
	
	Middlepoint(int posx, int posy){

		_posy = posy;
		_posx = posx;
	}
	
	 public boolean mousecheck(){
         return true;
	 }

	public void paint(Graphics g) {
		// draws the ellipse
		g.setColor(_color);
		g.drawRect(_posx,_posy,15,15	);
	}
}