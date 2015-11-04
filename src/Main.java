
import javax.swing.*;
import java.awt.*;


public class Main extends JPanel {
	
	Grid gamemap = new Grid(300,200);
	
	
	
	
	
	 Main(int width, int height) {
	       
		 Grid gamemap = new Grid(200,200);
		 
	 }
	 
	 @Override
	    public void paint(Graphics g) {
		 gamemap.fill();
		 
		 for(int k =0; k<5;k++){
			 for(int l =0; l<5;l++){
				 
				 if(gamemap.hexarray[k][l]!=null){
		
		 gamemap.hexarray[k][l].paint(g);
				 }
			 }
		 }
	    }


	 public static void main(String[] args) {

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
	        	  //m.update();
	            try {
	                Thread.sleep(10); //stops this part of the program for 10 milliseconds to avoid the loop locking everything. Now the screen has time to update content etc.
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
	        

	    }
	    
	


	
}
