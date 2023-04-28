package demosauce.testscripts;

import org.testng.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FourthScenarioSteps extends Driver {

	@Given("Go into the landing Page")
	public void go_into_the_landing_page() {

	}

	@When("Enter the user name")
	public void enter_the_user_name() {
		landingpage.clickUsername("standard_user");
	}

	@When("Enter the password")
	public void enter_the_password() {
		landingpage.clickPasswordtext("secret_sauce");
	}

	@When("Hit on the loging button")
	public void hit_on_the_loging_button() {
		landingpage.clickLoginButton();
	}

	@When("Sort the price from low to high")
	public void sort_the_price_from_low_to_high() {
		productpage.sortProuducts("Price (low to high)");
	}

	@When("Add firstt item to the cart")
	public void add_firstt_item_to_the_cart() {
		productpage.addthirdP();

	}

	@When("Hit the cart icon at the top right coner")
	public void hit_the_cart_icon_at_the_top_right_coner() {
		productpage.conrnerIconButton();
	}

	@When("Hit on the checkout button")
	public void hit_on_the_checkout_button() {
		cheackoutbutton.clickCheckOutButton();

	}

	@When("Enten the First Name")
	public void enten_the_first_name() {
		informationpage.enterFirstName("fariza");

	}

	@When("Enter the Last Name")
	public void enter_the_last_name() {
		informationpage.enterLastName("alimi");
	}

	@When("Enter her postal code")
	public void enter_her_postal_code() {
		informationpage.enterPostalCode("123d");
	}

	@When("Hit the Continue button")
	public void hit_the_continue_button() {
		informationpage.clickContinueButton();
	}

	@When("Hit the finish button")
	public void hit_the_finish_button() {
		finishedbutton.clickFinishedButton();

	}

	@When("varify your Thank you message")
	public void varify_your_thank_you_message() {
		String expectedsuccessmsg = "Thank you for your order!";
		String actualsuccessmsg = verifysuccmessage.verifyThankYouMsg();
		Assert.assertEquals(actualsuccessmsg, expectedsuccessmsg);
	}

	@Then("shut the browser")
	public void shut_the_browser() {
		

	}

}
