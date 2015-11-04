import java.awt.*;


public class Grid {
	
	
	int _i;
	int _k;
	Color bob = new Color(255,0,0);
	
	public Hexagon[][] hexarray = new Hexagon[5][5];
	


	
	Grid(int i, int k){
		
		_i=i;
		_k = k;
		
		
		
		
	}
	
	

		public void fill(){
		 
		 for(int r =0; r <3; r++){
		    hexarray[0][r]=new Hexagon(r*50+200,204);}
		 for(int r =0; r <4; r++){
			 hexarray[1][r]=new Hexagon (r*50+175,250);  }
		 for(int r =0; r <5; r++){
			 hexarray[2][r]=new Hexagon (r*50+150,300);  }
		 for(int r =0; r <4; r++){
			 hexarray[3][r]=new Hexagon (r*50+175,350);  }
		 for(int r =0; r <3; r++){
			 hexarray[4][r]=new Hexagon (r*50+200,400);  }
				 
		}	 
				 
			 
			
		}
		 
	 
	
	


