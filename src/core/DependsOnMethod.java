package core;

import org.testng.annotations.Test;

public class DependsOnMethod {

	
	  @Test 
	  public void firstmethod() {
		  System.out.println("Browser Launch");
	  }
	  
	  @Test (dependsOnMethods= {"firstmethod"})
	  public void secondmethod() {
		  System.out.println("Landing Page");
	  }
	  
	  @Test (dependsOnMethods= {"fourthmethod"})
	  public void thirdmethod() {
		  System.out.println("Personal Details");
	  }
	  
	  @Test (dependsOnMethods= {"secondmethod"})
	  public void fourthmethod() {
		  System.out.println("Login");
	  }
	  
	  @Test (dependsOnMethods= {"thirdmethod"})
	  public void fifthmethod() {
		  System.out.println("Home Page");
	  }
	  
	  @Test (dependsOnMethods= {"fifthmethod"})
	  public void sixthmethod() {
		  System.out.println("Shopping Page");
	  }
	 


}
