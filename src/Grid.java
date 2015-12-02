public class Grid {

	int _i;
	int _k;
	static boolean updater = false;
	public static House[] hus = new House[10];
	public static Road[] vej = new Road[10];
<<<<<<< HEAD

=======
	static int housecounter =1;
	
>>>>>>> origin/master
	public Hexagon[][] hexarray = new Hexagon[5][5];

	Grid(int i, int k) {

		_i = i;
		_k = k;

	}

	// makes the pattern and fills the hexagons into the 2d array
<<<<<<< HEAD
		public void fill(){
			
		 
		 for(int r =0; r <3; r++){
		    hexarray[0][r]=new Hexagon((r*50+_i)*2,(_k)*2);}
		 for(int r =0; r <4; r++){
			 hexarray[1][r]=new Hexagon ((r*50+_i-25)*2,(_k+43)*2);  }
		 for(int r =0; r <5; r++){
			 hexarray[2][r]=new Hexagon ((r*50+_i-50)*2,(_k+86)*2);  }
		 for(int r =0; r <4; r++){
			 hexarray[3][r]=new Hexagon ((r*50+_i-25)*2,(_k+129)*2);  }
		 for(int r =0; r <3; r++){
			 hexarray[4][r]=new Hexagon ((r*50+_i)*2,(_k+172)*2);  }
		 
	
				 
=======
	public void fill() {

		for (int r = 0; r < 3; r++) {
			hexarray[0][r] = new Hexagon((r * 50 + _i) * 2, (_k) * 2);
>>>>>>> origin/master
		}
		for (int r = 0; r < 4; r++) {
			hexarray[1][r] = new Hexagon((r * 50 + _i - 25) * 2, (_k + 43) * 2);
		}
		for (int r = 0; r < 5; r++) {
			hexarray[2][r] = new Hexagon((r * 50 + _i - 50) * 2, (_k + 86) * 2);
		}
		for (int r = 0; r < 4; r++) {
			hexarray[3][r] = new Hexagon((r * 50 + _i - 25) * 2, (_k + 129) * 2);
		}
		for (int r = 0; r < 3; r++) {
			hexarray[4][r] = new Hexagon((r * 50 + _i) * 2, (_k + 172) * 2);
		}

	}
}