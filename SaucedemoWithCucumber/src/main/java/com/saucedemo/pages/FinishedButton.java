package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FinishedButton {
	
	@FindBy(id= "finish")
	private WebElement finishedButton;
	
	public FinishedButton(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
		
	}
	public void clickFinishedButton() {
		finishedButton.click();
	}
}
