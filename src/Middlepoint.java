import java.awt.Color;
import java.awt.Graphics;

public class Middlepoint {

	int _posx;
	int _posy;
	boolean _lamp = false;
	Color _color= new Color(0,0,0);
	
	Middlepoint(int posx, int posy){

		_posy = posy;
		_posx = posx;
<<<<<<< HEAD
	}
	
	 public boolean mousecheck(){
         return true;
	 }

=======
		
		
	
	}
	
	 public boolean mousecheck(){
		 
		 
	 return true;
	 }
	
	
	 public boolean setlamp(boolean lamper){
		 _lamp=lamper;
		 return _lamp;
		 
	 }
	
>>>>>>> origin/master
	public void paint(Graphics g) {
		// draws the ellipse
		g.setColor(_color);
	
		g.drawRect(_posx,_posy,15,15	);
<<<<<<< HEAD
=======
		
		if(_lamp==true){
			g.setColor(new Color(255,255,255));	
		g.fillRect(_posx,_posy,15,15);
		
		}
		
		
>>>>>>> origin/master
	}
}