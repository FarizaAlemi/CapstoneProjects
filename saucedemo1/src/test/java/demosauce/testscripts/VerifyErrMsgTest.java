package demosauce.testscripts;

import org.testng.Assert;
import org.testng.annotations.Test;


import demosauce.pages.LandingPage;


public class VerifyErrMsgTest extends BaseTest {
	
	@Test 
	public void verifyErrMsg() {
		
		LandingPage landingpage= new LandingPage(driver);

		landingpage.clickUsername("locked_out_user");
		landingpage.clickPasswordtext("secret_sauce");
		landingpage.clickLoginButton();
		
		String expectedErrmsg= "Epic sadface: Sorry, this user has been locked out.";
		String actualErrmsg= landingpage.getErrMsg();
		Assert.assertEquals(actualErrmsg, expectedErrmsg);
	
	}
}
