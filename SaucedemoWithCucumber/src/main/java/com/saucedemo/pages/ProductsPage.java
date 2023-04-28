package com.saucedemo.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductsPage {
	
	
	@FindBy(id= "add-to-cart-sauce-labs-backpack")
	private WebElement addFirstPToCart;
	
	@FindBy(id="add-to-cart-sauce-labs-bolt-t-shirt")
	private WebElement addsecondPToCart;
	
	@FindBy(id="add-to-cart-sauce-labs-onesie")
	private WebElement addthirdPToCart;
	
	@FindBy(xpath= "//a[contains(@class, 'shopping_cart_link')]")
	private WebElement cornerIcon;
	
	@FindBy(xpath= "//select[contains(@class,'product_sort_container')]")
	private WebElement sortProduct;
	
	@FindBy(id= "remove-sauce-labs-backpack")
	private WebElement removeProduct;
	
	@FindBy(xpath="//select[contains(@class, 'product_sort_container')]")
	private WebElement highToLow;
	
	@FindBy(id="add-to-cart-sauce-labs-fleece-jacket")
	private WebElement highPriceP;
	

	public ProductsPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	public void addFistP() {
		addFirstPToCart.click();
	}
	

	public void addsecondP() {
		addsecondPToCart.click();
		
	}
	public void conrnerIconButton() {
		cornerIcon.click();
	}
	public void sortProuducts(String dropDwon) {
		sortProduct.sendKeys(dropDwon);
	}
	public void addthirdP() {
		addthirdPToCart.click();
		
	} public void removeP() {
		removeProduct.click();
	}
	public void sortHighTolow() {
		highToLow.click();
		
	}
	public void highestPP() {
		highPriceP.click();
	}
	
		
	}
	
	
