
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


public class Main extends JPanel {
	
	
	
//<<<<<<< Updated upstream
	 //Initializes the grid
	 Grid gamemap = new Grid(100,100);
	 static boolean updater = false;
	

	DiceRoller dice = new DiceRoller();
//=======
	//denisa is trying to figure it out
//>>>>>>> Stashed changes
	

	
	 Main(int width, int height) {
//<<<<<<< Updated upstream

		 gamemap.fill();
			
		 for(int k =0; k<5;k++){
			 for(int l =0; l<5;l++){		 
		 // some of the places in the array are empty because of the 3,4,5,4,3 structure of the game map
		if(gamemap.hexarray[k][l]!=null){
			 this.addMouseListener(gamemap.hexarray[k][l]);
		}
	 }
		 }
		 
		
		 dice.Roll();
//=======
	       
		 Grid gamemap = new Grid(200,200);
//>>>>>>> Stashed changes
		 
		 
	
	 }
	 public void update(){
		
		 
		if(Grid.updater==true){
	this.repaint();
	Grid.updater=false;
		}
	 }
	 
	 
	
	    public void paint(Graphics g) {
		 
	
		 // this for loop draws each hexagon
		 for(int k =0; k<5;k++){
			 for(int l =0; l<5;l++){		 
		 // some of the places in the array are empty because of the 3,4,5,4,3 structure of the game map
		if(gamemap.hexarray[k][l]!=null){
			 this.addMouseListener(gamemap.hexarray[k][l]);
		 gamemap.hexarray[k][l].paint(g);
		 
		
				 }
			 }
		 }
		 
		 
		 
		 
	    }
	


	 public static void main(String[] args) { 
//sizing of the gamemap
	        int width = 800;
	        int height = 600;

	       
	        JFrame frame = new JFrame("Settler's"); //create a new window and set title on window
	        frame.setSize(width, height); //set size of window
	        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //set the window to close when the cross in the corner is pressed

	       
	        Main m = new Main(width,height-22);
	        frame.add(m);
	        frame.setVisible(true); //make the window visible

	        while (true) { //keep running a loop
	            //each time the loop is run do
	        	  m.update();
	            try {
	                Thread.sleep(30); //stops this part of the program for 10 milliseconds to avoid the loop locking everything. Now the screen has time to update content etc.
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	        

	    }



	
}
