package core;

import org.testng.annotations.Test;

public class PriorityClass {
	
	  @Test (priority = 1)
	  public void firstmethod() {
		  System.out.println("firstmethod");
	  }
	  
	  @Test (priority = 3)
	  public void secondmethod() {
		  System.out.println("secondmethod");
	  }
	  
	  @Test (priority = 0)
	  public void thirdmethod() {
		  System.out.println("thirdmethod");
	  }
	  
	  @Test (priority = -2)
	  public void fourthmethod() {
		  System.out.println("fourthmethod");
	  }
	  
	  @Test (priority = 6)
	  public void fifthmethod() {
		  System.out.println("fifthmethod");
	  }
	  
	  @Test (priority = 7)
	  public void sixthmethod() {
		  System.out.println("sixthmethod");
	  }
	 
}
