package demosauce.testscripts;



import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class BeforeAfter extends Tools{
//	WebDriver driver;
	@Before
	public void setUp(Scenario scenario) {
		Driver.init();
		
	}
	
	
	
	@After
	public void tearDown() {
		
		 driver.quit();
	}

}

