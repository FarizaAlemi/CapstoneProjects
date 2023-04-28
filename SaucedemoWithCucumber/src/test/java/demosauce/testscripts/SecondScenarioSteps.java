package demosauce.testscripts;

import org.testng.Assert;

import com.saucedemo.pages.InformationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SecondScenarioSteps extends Driver {
	
	@Given("go to the Landing page")
	public void go_to_the_landing_page() {
	    
	
	}

	@When("Enter the usrname locked_out_user")
	public void enter_the_usrname_locked_out_user() {
		
	 
	 landingpage.clickUsername("locked_out_user");
		
	}
	@When("Enter password secret_sauce")
	public void enter_password_secret_sauce() {
	   
		landingpage.clickPasswordtext("secret_sauce");
	}
	@When("Click on the loging button")
	public void click_on_the_loging_button() {
		landingpage.clickLoginButton();
	}
	

	@When("Verify the Error message Epic sadface Sorry this user has been locked out")
	public void verify_the_error_message_epic_sadface_sorry_this_user_has_been_locked_out() {
		
		InformationPage informationpage= new InformationPage(driver);
		String expectedTitle= "Epic sadface: Sorry, this user has been locked out.";
		String actualTitle= informationpage.verifyNameError();
		Assert.assertEquals(actualTitle,expectedTitle);
	}

	@Then("close browser")
	public void close_browser() {
	    
	}

}
