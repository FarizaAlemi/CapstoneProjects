package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
	
	@FindBy(id= "checkout")
	private WebElement checkOutButton;
	
	
	
	@FindBy(xpath="//span[contains(@class,'shopping_cart_badge')]")
	private WebElement artIcone;
	
	@FindBy(xpath="//span[contains(@class,'title')]")
	private WebElement yourCarButt;
	
	@FindBy(id="continue-shopping")
	private WebElement continueButt;
	
	@FindBy(id="continue-shopping")
	private WebElement continueShopping;
	
	
	
	 
	
	public CheckoutPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	
			
}
	public void clickCheckOutButton() {
		checkOutButton.click();
	}
	
	public void checkcart() {
		artIcone.click();
	}
	public String yourCartB() {
		String message= yourCarButt.getText();
		return message;
				
	}
	public void continueButt() {
		continueButt.click();
	}
	public void shopingButton() {
		continueShopping.click();
	}
	
	}
