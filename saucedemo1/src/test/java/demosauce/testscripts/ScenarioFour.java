package demosauce.testscripts;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import demosauce.pages.CheckoutPage;
import demosauce.pages.FinishedButton;
import demosauce.pages.InformationPage;
import demosauce.pages.LandingPage;
import demosauce.pages.ProductsPage;
import demosauce.pages.VerifySuccMessage;

public class ScenarioFour extends BaseTest{
	Select select;
	@Test
	public void varifySccessMsg() {
		
		LandingPage landingpage= new LandingPage(driver);
		landingpage.clickUsername("standard_user");
		landingpage.clickPasswordtext("secret_sauce");
		landingpage.clickLoginButton();
		
		
		 ProductsPage productpage= new  ProductsPage(driver);
		 productpage.sortProuducts("Price(low to high)");
		 productpage.addFistP();
		 productpage.conrnerIconButton();
		 
		 CheckoutPage checout= new CheckoutPage(driver);
			 checout.clickCheckOutButton();
	 
		 InformationPage information= new InformationPage(driver);
		 information.enterFirstName("fariza");
		 information.enterLastName("alimi");
		 information.enterPostalCode("123d");
		 information.clickContinueButton();
		 
		 
	 FinishedButton finishedbutton= new FinishedButton(driver);
  finishedbutton.clickFinishedButton();
 
	 
 VerifySuccMessage verifysuccmessage= new VerifySuccMessage(driver);
 
	 	 String expectedsuccessmsg= "Thank you for your order!";
	String actualsuccessmsg= verifysuccmessage.verifyThankYouMsg();
		Assert.assertEquals(actualsuccessmsg, expectedsuccessmsg);
	
		  
	}
	
	
	
	

}
