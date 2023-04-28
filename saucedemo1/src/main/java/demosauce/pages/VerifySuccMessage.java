package demosauce.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VerifySuccMessage {
	
	@FindBy(xpath= "//div[contains(@class,'complete-text')]")
	private WebElement successMsg;
	
	@FindBy(xpath="//h2[contains(@class,'complete-header')]")
	private WebElement thanksYouMsg;
	
	
	public VerifySuccMessage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	

}
	public String verifyMsg() {
		String message = successMsg.getText();
		return message;
		
	}
	public String verifyThankYouMsg() {
	String message= thanksYouMsg.getText();
	return message;
		
		
	}
	}

