package para;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

public class Paramatrization {
	
	WebDriver driver;
  	String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
  	String browser = "firefox";
	
  @Test
  public void login() {
	   
		if(browser.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browser.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "Resources/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		
		driver.get(url);
		
		
		
  }
  

}
