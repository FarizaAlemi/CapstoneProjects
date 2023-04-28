package demosauce.testscripts;


import org.testng.Assert;

import com.saucedemo.pages.CheckoutPage;
import com.saucedemo.pages.InformationPage;

import com.saucedemo.pages.ProductsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ThirdScenarioSteps extends Driver{

	@Given("go landing page")
	
	public void go_landing_page() {
		
	    
	}

	@When("Enter your user name problem_user")
	public void enter_your_user_name_problem_user() {
		 
		 landingpage.clickUsername("problem_user");
	}

	@When("Enter your password secret_sauce")
	public void enter_your_password_secret_sauce() {
		landingpage.clickPasswordtext("secret_sauce");
	   
	}

	@When("click loging button")
	public void click_loging_button() {
		landingpage.clickLoginButton();
	}

	@When("Add the 1st product to the cart")
	public void add_the_1st_product_to_the_cart() {
		 
		productpage.addFistP();
	}
	@When("Click on the cart icon the top right coner")
	public void click_on_the_cart_icon_the_top_right_coner() {
		productpage.conrnerIconButton();
	}

	@When("Click checkout button")
	public void click_checkout_button() {
		
		cheackoutbutton.clickCheckOutButton();
	}

	@When("Enter his first name in the First Name textbox")
	public void enter_his_first_name_in_the_first_name_textbox() {
	 
	 informationpage.enterFirstName("Fariza");
	}

	@When("Enter  his last name in the Last Name textbox")
	public void enter_his_last_name_in_the_last_name_textbox() {
		informationpage.enterLastName("Alimi");
	}

	@When("Entern his postel code in Postel Code textbox")
	public void entern_his_postel_code_in_postel_code_textbox() {
		informationpage.enterPostalCode("123e");
	}

	@When("Click continue button then")
	public void click_continue_button_then() {
		informationpage.clickContinueButton();
	}

	@When("Verify the error message Error: Last Name is required")
	public void verify_the_error_message_error_last_name_is_required() {
	//	InformationPage informationpage = new InformationPage(driver);
		String expectedsuccessmsg= "Error: Last Name is required";
		String actualsuccessmsg= informationpage.verifyNameError();
		Assert.assertEquals(actualsuccessmsg, expectedsuccessmsg);
	}

	@Then("closed browser")
	public void closed_browser() {
	}


}
