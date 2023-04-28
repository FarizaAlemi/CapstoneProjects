package demosauce.testscripts;



import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import com.saucedemo.pages.*;

public class Driver extends Tools{
//	protected static WebDriver driver;
	protected static LandingPage landingpage;
	protected static ProductsPage productpage;
	protected static CheckoutPage cheackoutbutton;
	protected static InformationPage informationpage;
	protected static FinishedButton finishedbutton;
	protected static VerifySuccMessage verifysuccmessage;
	
	
	public static void init() {
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--remote-allow-origins=*");
		System.setProperty("webdriver.chrome.driver", "resources//chromedriver.exe");
		driver= new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		
		
		
		landingpage= new LandingPage(driver);
		 productpage= new ProductsPage(driver);
		cheackoutbutton = new CheckoutPage(driver);
		informationpage= new InformationPage(driver);
		finishedbutton= new FinishedButton(driver);
		
		verifysuccmessage= new VerifySuccMessage(driver);
		
		
	
		
	}
	

}
