package para;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDataProvider {
	@Test(dataProvider = "dataprovider", dataProviderClass = DataProviderDemo.class)
	public void loginTest(String userName, String password) {
		String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";

		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		System.out.println("Browser Launched");
		driver.manage().window().maximize();
		System.out.println("My browser is maximized");

		WebElement user =  driver.findElement(By.id("txtUsername"));
		user.sendKeys(userName);

		WebElement pass = driver.findElement(By.name("txtPassword"));
		pass.sendKeys(password);

		WebElement loginButton = driver.findElement(By.xpath("//input[@type='submit']"));
		loginButton.click();

		driver.quit();
		
	}

}

