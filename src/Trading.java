
public class Trading {
	
	int [] resources = new int [6]; // an array for storying resources and the number of resources
	
	// initializing the first line with the name of the resources
		public  Trading(int [] resource){
			for(int i=0; i< 6; i++)
			{
				resources[i]=resource[i];
			}
			
		}
	    
	    public void BuyARoad(){
		 
		 if(resources[0]>= 1 && resources[1]>=1) { resources[0]=- 1;
		                                           resources[1]=- 1;
		 // checks if the player has enough resources for buying the road and updates the resources                                                           }
	 }
	 }
	 
	 
	 public void BuySettlement() {
		 if(resources[1]>= 1 && resources[4]>= 1 && resources[2]>=1)
		 {
			 resources[1]=- 1;
			 resources[4]=- 1;
			 resources[2]=- 1;
			 resources[5]=+ 1;
			 // checks if the player has enough resources for buying the settlements and updates the resources
		 }
	 }
	 
	 public void BuyCity() {
		 
		 if(resources[4]> 1 && resources[3]>2)
		 {
			 resources[4]=- 2;
			 resources[4]=- 3;
			 resources[5]=+ 1;
			// checks if the player has enough resources for buying the city and updates the resources
		 }
		 
	 }
	 
	 public void UpdateResources(int [] resource) {
	    for(int i=0; i<6; i++)
	    	
	    	{
	    		resource[i]= resources[i];
	    	}
	 }
	 
}
	 
	 
	  
	    

