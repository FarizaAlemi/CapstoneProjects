package demosauce.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import demosauce.pages.CheckoutPage;
import demosauce.pages.FinishedButton;
import demosauce.pages.InformationPage;
import demosauce.pages.LandingPage;
import demosauce.pages.ProductsPage;
import demosauce.pages.VerifySuccMessage;


public class BuyproductTest extends BaseTest {
	

	@Test
	public void buyProduts() {

		
		LandingPage landingpage= new LandingPage(driver);
		landingpage.clickUsername("standard_user");
		landingpage.clickPasswordtext("secret_sauce");
		landingpage.clickLoginButton();
		

		ProductsPage productspage= new ProductsPage(driver);
		productspage.addFistP();
		productspage.addsecondP();
		
		productspage.conrnerIconButton();
		
		CheckoutPage checkoutbutton= new CheckoutPage(driver);
		checkoutbutton.clickCheckOutButton();
		
		InformationPage informationpage= new InformationPage(driver);
		informationpage.enterFirstName("fariza");
		informationpage.enterLastName("Alimi");
		informationpage.enterPostalCode("1234f");
		informationpage.clickContinueButton();
	
		FinishedButton finishedbutton= new FinishedButton(driver);
		finishedbutton.clickFinishedButton();
		
		VerifySuccMessage verifysuccmessage= new VerifySuccMessage(driver);
		
		String expectedsuccessmsg= "Your order has been dispatched, and will arrive just as fast as the pony can get there!";
		String actualsuccessmsg= verifysuccmessage.verifyMsg();
		Assert.assertEquals(actualsuccessmsg, expectedsuccessmsg);
		
	}
	
	
	
	
	
	
	

	


	
	

}

