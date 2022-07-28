package core;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class IncludeExclude {
	
  @Test(enabled = true)
  public void firstmethod() {
	  System.out.println("firstmethod");
  }
  
  @Test(enabled = true)
  public void secondmethod() {
	  System.out.println("secondmethod");
  }
  
  @Test(enabled = false)
  public void thirdmethod() {
	  System.out.println("thirdmethod");
  }
  
  @Test(enabled = true)
  public void fourthmethod() {
	  System.out.println("fourthmethod");
  }
  
  @Test(enabled = false)
  public void fifthmethod() {
	  System.out.println("fifthmethod");
  }
  
  @Test(enabled = true)
  public void sixthmethod() {
	  System.out.println("sixthmethod");
  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");
  }

}
