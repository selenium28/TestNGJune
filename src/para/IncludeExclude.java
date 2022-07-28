package para;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class IncludeExclude {
	
  @Test (groups = {"smoke"})
  public void login() {
	  System.out.println("Login Method - smoke");
  }
  
  @Test (groups = {"smoke"})
  public void admin() {
	  System.out.println("admin Method - smoke ");
  }
  
  @Test (groups = {"Regression"})
  public void pIM() {
	  System.out.println("pIM Method - Regression");
  }
  
  @Test (groups = {"smoke","Regression"})
  public void dashboard() {
	  System.out.println("dashboard Method - smoke and Regression");
  }
  
  @Test (groups = {"smoke"})
  public void display() {
	  System.out.println("display Method - smoke");
  }
  
  @Test (groups = {"Regression"})
  public void force() {
	  System.out.println("force Method - Regression");
  }
  
  @Test (groups = {"Regression"})
  public void logout() {
	  System.out.println("logout Method - Regression");
  }
  
  @Test (groups = {"smoke", "Regression"})
  public void signin() {
	  System.out.println("signin Method - smoke and Regression");
  }
  
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

}
