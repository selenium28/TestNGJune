package core;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class Annotations {
 //@Test - testcase
  @Test
  public void login() {
	  System.out.println("Test Case one");
  }
  
  @Test
  public void home() {
	  System.out.println("Test Case Two");
  }
  
  @Test
  public void display() {
	  System.out.println("Test Case Three");
  }
  
  // executed before every@Test
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod");
  }

  //executed after every@Test
  @AfterMethod
  public void afterMethod() {
	  System.out.println("afterMethod");
  }
  // it will executed before every @beforemethod. it will executed only one time through the test case
  @BeforeClass
  public void beforeClass() {
	  System.out.println("beforeClass");
  }
 //it will executed after all test methods in the current class.
  @AfterClass
  public void afterClass() {
	  System.out.println("afterClass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("beforeTest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("afterTest");
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("beforeSuite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("afterSuite");
  }

}
