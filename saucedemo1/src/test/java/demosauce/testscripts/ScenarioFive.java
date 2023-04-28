package demosauce.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;

import demosauce.pages.CheckoutPage;
import demosauce.pages.FinishedButton;
import demosauce.pages.InformationPage;
import demosauce.pages.LandingPage;
import demosauce.pages.ProductsPage;
import demosauce.pages.VerifySuccMessage;

public class ScenarioFive extends BaseTest{
	
	@Test
	public void lastTestCase() {
		
		LandingPage landingpage= new LandingPage(driver);
		landingpage.clickUsername("standard_user");
		landingpage.clickPasswordtext("secret_sauce");
		landingpage.clickLoginButton();
		
		ProductsPage productpage= new ProductsPage(driver);
		productpage.addFistP();
		productpage.addthirdP();
	    productpage.removeP();
	    productpage.conrnerIconButton();
	   
		CheckoutPage checkoutpage= new CheckoutPage(driver);
		
		 String expectedsuccessmsg= "Your Cart";
			String actualsuccessmsg= checkoutpage.yourCartB();
			Assert.assertEquals(actualsuccessmsg, expectedsuccessmsg);
			
			checkoutpage.shopingButton();
			
			 productpage.sortHighTolow();
			 productpage.highestPP();
			 productpage.conrnerIconButton();
			 checkoutpage.clickCheckOutButton();
			 
			 InformationPage informationpage= new InformationPage(driver);
			 informationpage.enterFirstName("fariza");
			 informationpage.enterLastName("alimi");
			 informationpage.enterPostalCode("1234d");
			 informationpage.clickContinueButton();
			 
			 
			 FinishedButton finishedpage= new FinishedButton(driver);
			 
			 finishedpage.clickFinishedButton();
			 VerifySuccMessage verifysussMsg= new VerifySuccMessage(driver);
			 verifysussMsg.verifyThankYouMsg();
			 
		
			
			
			
		
		
	}
	
	

}
