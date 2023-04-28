package demosauce.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import demosauce.pages.CheckoutPage;
import demosauce.pages.InformationPage;
import demosauce.pages.LandingPage;
import demosauce.pages.ProductsPage;

public class ScenarioThreeTest extends BaseTest{
	
	@Test
	
	public void verifyErrorOfName(){
		 LandingPage landingpage= new LandingPage(driver);
		 landingpage.clickUsername("problem_user");
		 landingpage.clickPasswordtext("secret_sauce");
		 landingpage.clickLoginButton();
		 
		 ProductsPage productspage= new ProductsPage(driver);
		 productspage.addFistP();
		 productspage.conrnerIconButton();
		 
		 
		 CheckoutPage checkoutpage= new CheckoutPage(driver);
		 checkoutpage.clickCheckOutButton();
		 
		 InformationPage informationpage= new InformationPage(driver);
		 informationpage.enterFirstName("Fariza");
		 informationpage.enterLastName("Alimi");
		 informationpage.enterPostalCode("123e");
		 informationpage.clickContinueButton();
		 
		 String expectedsuccessmsg= "Error: Last Name is required";
			String actualsuccessmsg= informationpage.verifyNameError();
			Assert.assertEquals(actualsuccessmsg, expectedsuccessmsg);
		 
		 
		
		 
	}
	
}
	
	
	
	
			
		
			

		
		
		
	
	

	
	
		
		
		
		
		
		
		
		
		
		
	


