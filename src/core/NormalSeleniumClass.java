package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NormalSeleniumClass {

	public static void main(String[] args) {
		
		String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
		
		System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		System.out.println("Browser Launched");
		driver.manage().window().maximize();
		System.out.println("My browser is maximized");
		
		WebElement userName =  driver.findElement(By.id("txtUsername"));
		userName.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.name("txtPassword"));
		password.sendKeys("admin123");
		
		WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
		loginButton.click();
		
	}

}
