package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGTestAnnotation {

		WebDriver driver;

		@BeforeTest
		public void beforeMethod() {
			String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
			System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			System.out.println("Browser Launched");
			driver.manage().window().maximize();
			System.out.println("My browser is maximized");
		}

		@AfterTest
		public void afterMethod() {
			driver.quit();
		}

		@Test
		public void display() {

			WebElement userName =  driver.findElement(By.id("txtUsername"));
			userName.sendKeys("Admin");

			WebElement password = driver.findElement(By.name("txtPassword"));
			password.sendKeys("admin123");

			WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
			loginButton.click();

			System.out.println("Login Successfully with valid username & Pass");

		}

		@Test
		public void homePage() {

			String title = driver.getTitle();
			String url = driver.getCurrentUrl();
			System.out.println(title);
			System.out.println(url);

		}

	}

