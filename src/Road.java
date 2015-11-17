import java.awt.Color;
import java.awt.Graphics;

public class Road {
	
	int _xpos;
	int _ypos;
	Color _color = new Color(0,0,0);
	
	Road(int xpos, int ypos){
		
		
		_xpos = xpos;
		_ypos = ypos;
	
	}

public void paint(Graphics g) {
		 
		
		
		// draws the hexagon
	
	 g.setColor(_color);
	 
		g.drawLine(_xpos, _ypos,Grid.hus[1]._xpos,Grid.hus[1]._ypos);
		
		
			
		
		}

}
