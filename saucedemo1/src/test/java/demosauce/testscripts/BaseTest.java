package demosauce.testscripts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

import org.testng.annotations.BeforeClass;



public class BaseTest {

	WebDriver driver;
	
	@BeforeClass
	
public void buyProduct() {
		
		// 1.open the browser
		System.setProperty("webdriver.chrome.driver", "resources//chromedriver.exe");
		driver = new ChromeDriver();
		
		// 2.maximize it 
		driver.manage().window().maximize();
		
		// 3. navigate to application 
		driver.get("https://www.saucedemo.com/");
		
	}
	@AfterClass
	public void closeBrowser() {
		driver.quit();
		
	}

}
