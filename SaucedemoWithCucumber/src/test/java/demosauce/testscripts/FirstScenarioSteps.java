package demosauce.testscripts;

import org.testng.Assert;
import com.saucedemo.pages.VerifySuccMessage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FirstScenarioSteps extends Driver{
	
	
	
	@Given("go to Landing page")
	public void go_to_landing_page() {
	
	    
	}

	@When("Enter the usrname standard_user")
	public void enter_the_usrname_standard_user() {
	   
		landingpage.clickUsername("standard_user");
		
		
	}

	@When("Enter the password secret_sauce")
	public void enter_the_password_secret_sauce() {
		landingpage.clickPasswordtext("secret_sauce");
	    
	}

	@When("Click on loging button")
	public void click_on_loging_button() {
		landingpage.clickLoginButton();
	}

	@When("Add the first two items to the cart")
	public void add_the_first_two_items_to_the_cart() {
	    
		
		productpage.addFistP();
		productpage.addsecondP();
	}

	@When("Click on the cart icon at the top right coner")
	public void click_on_the_cart_icon_at_the_top_right_coner() {
		productpage.conrnerIconButton();
	
	}

	@When("Click on checkout button")
	public void click_on_checkout_button() {
		
		cheackoutbutton.clickCheckOutButton();
	
	}

	@When("Enter your first name in the First Name textbox")
	public void enter_your_first_name_in_the_first_name_textbox() {
		
		 informationpage.enterFirstName("Fariza");
		
	}

	@When("Enter your last name in the Last Name textbox")
	public void enter_your_last_name_in_the_last_name_textbox() {
		informationpage.enterLastName("Alimi");
	}

	@When("Entern postel code in Postel Code textbox")
	public void entern_postel_code_in_postel_code_textbox() {
		informationpage.enterPostalCode("123e");
	}

	@When("Click on continue button")
	public void click_on_continue_button() {
		informationpage.clickContinueButton();
	}

	@When("Click on finished button on the next page")
	public void click_on_finished_button_on_the_next_page() {
		
		finishedbutton.clickFinishedButton();
		
	}

	@When("Verify the success message Your order has been dispatched, and will arrive just as fast as the pony can get there")
	public void verify_the_success_message_your_order_has_been_dispatched_and_will_arrive_just_as_fast_as_the_pony_can_get_there() {
		VerifySuccMessage verifysussMsg= new VerifySuccMessage(driver);
		String expectedTitle= "Your order has been dispatched, and will arrive just as fast as the pony can get there!";
		String actualTitle= verifysussMsg.verifyMsg();
		Assert.assertEquals(actualTitle, expectedTitle);
	}

	@Then("close the browser")
	public void close_the_browser() {
	    
	}


}
