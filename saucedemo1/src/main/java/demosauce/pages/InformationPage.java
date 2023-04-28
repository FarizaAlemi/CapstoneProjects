package demosauce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InformationPage {
	
	@FindBy(id= "first-name")
	private WebElement firstname;
	
	@FindBy(id= "last-name")
	private WebElement lastName;
	
	@FindBy(id= "postal-code")
	private WebElement postalCode;
	
	@FindBy(id = "continue")
	private WebElement continuButton;
	
	@FindBy(xpath= "//h3[contains(@data-test,'error')]")
	private WebElement erreMasg;
	
	@FindBy(xpath="//h3[contains(@ data-test,'error')]")
	private WebElement errorMsgOfName;
	
	
	
	
	public InformationPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	

}
	public void enterFirstName(String Firstname ) {
		firstname.sendKeys(Firstname );
		
	}
	public void enterLastName(String lastname) {
		lastName.sendKeys(lastname);
		
	
	}
	public void enterPostalCode(String code) {
		postalCode.sendKeys(code);
		
	}
	public void clickContinueButton() {
		continuButton.click();
	}
	public String verifyNameError() {
		String namemessage= errorMsgOfName.getText();
		return namemessage;
	}
	
	}

