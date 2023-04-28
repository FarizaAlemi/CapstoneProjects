package demosauce.testscripts;

import org.testng.Assert;

import com.saucedemo.pages.CheckoutPage;

import com.saucedemo.pages.ProductsPage;
import com.saucedemo.pages.VerifySuccMessage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FifthScenarioSteps extends Driver{


	@Given("first go to landingpage")
	public void first_go_to_landingpage() {

	   
	}

	@When("inter her username standard_user")
	public void inter_her_username_standard_user() {
		
		landingpage.clickUsername("standard_user");

	}

	@When("inter her password  secret_sauce")
	public void inter_her_password_secret_sauce() {
		landingpage.clickPasswordtext("secret_sauce");
	}

	@When("you click on the loging button")
	public void you_click_on_the_loging_button() {
		landingpage.clickLoginButton();
	}

	@When("first and third product to the carts")
	public void first_and_third_product_to_the_carts() {
		
		productpage.addFistP();
		productpage.addthirdP();
	}

	@When("remove first product from cart")
	public void remove_first_product_from_cart() {
		productpage.removeP();
	}

	@When("click on cart icon")
	public void click_on_cart_icon() {
		productpage.conrnerIconButton();
	}

	@When("you or she can verify the text Your Cart is displayed at the top left corner of the page")
	public void you_or_she_can_verify_the_text_your_cart_is_displayed_at_the_top_left_corner_of_the_page() {
		
		String expectedsuccessmsg= "Your Cart";
		String actualsuccessmsg= cheackoutbutton.yourCartB();
		Assert.assertEquals(actualsuccessmsg, expectedsuccessmsg);
		
	}

	@When("you or she can click Continue Shopping button")
	public void you_or_she_can_click_continue_shopping_button() {	
		cheackoutbutton.shopingButton();	
	}

	@When("you or her can Sort the prices from high to low")
	public void you_or_her_can_sort_the_prices_from_high_to_low() {
		productpage.sortHighTolow();
	}

	@When("add Add the most expensive item to the cart")
	public void add_add_the_most_expensive_item_to_the_cart() {
		productpage.highestPP();
	}

	@When("you or her can click on the cart icon then")
	public void you_or_her_can_click_on_the_cart_icon_then() {
		productpage.conrnerIconButton();
	}

	@When("you or her can click on the chekout button")
	public void you_or_her_can_click_on_the_chekout_button() {
		cheackoutbutton.clickCheckOutButton();
	}

	@When("you and she can enter the first name in the first name textbox then")
	public void you_and_she_can_enter_the_first_name_in_the_first_name_textbox_then() {
		 informationpage.enterFirstName("Fariza");
	}

	@When("you or she can enter last name in Last Name textbox")
	public void you_or_she_can_enter_last_name_in_last_name_textbox() {
		informationpage.enterLastName("Alimi");
	}

	@When("you or she can Enter Postal Code in Postal Code textbox")
	public void you_or_she_can_enter_postal_code_in_postal_code_textbox() {
		informationpage.enterPostalCode("123e");
	}

	@When("you or she can click on the continue icon")
	public void you_or_she_can_click_on_the_continue_icon() {
		informationpage.clickContinueButton();
	}

	@When("you or she can click on the finished button")
	public void you_or_she_can_click_on_the_finished_button() {
		finishedbutton.clickFinishedButton();
	}

	@When("you or she can Verify the success message Thank you for your order! is displayed to the user")
	public void you_or_she_can_verify_the_success_message_thank_you_for_your_order_is_displayed_to_the_user() {	 
	 	 String expectedsuccessmsg= "Thank you for your order!";
	String actualsuccessmsg = verifysuccmessage.verifyThankYouMsg();
		Assert.assertEquals(actualsuccessmsg, expectedsuccessmsg);
	}

	@Then("finally you can close the browser")
	public void finally_you_can_close_the_browser() {
	    
	}
}
