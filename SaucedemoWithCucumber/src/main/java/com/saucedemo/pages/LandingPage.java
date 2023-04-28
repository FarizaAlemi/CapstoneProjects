package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	@FindBy(id= "user-name")
	private WebElement username;
	
	@FindBy(id= "password")
	private WebElement passwordText;
	
	@FindBy(id= "login-button")
	private WebElement loginButton;
	
	@FindBy(xpath= "//h3[contains(@data-test,'error')]")
	private WebElement erreMasg;

	
	
	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}
	
	public void clickUsername(String user) {
		username.sendKeys(user);
	}
	public void clickPasswordtext(String password) {
		passwordText.sendKeys(password);
	}
	public void clickLoginButton() {
		loginButton.click();
	}
	public String getErrMsg() {
		String message= erreMasg.getText();
				return message;
	
}
	
	}
