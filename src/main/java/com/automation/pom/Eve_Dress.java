package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Eve_Dress {
	
	public static WebDriver driver;

	@FindBy(xpath = "//div[@class='product-image-container']")
	private WebElement eve_Img;

	@FindBy(xpath = "//span[text()='Quick view']")
	private WebElement quickView_Btn;

	@FindBy(xpath = "//i[@class='icon-plus']")
	private WebElement qty;
	
	@FindBy(name = "group_1")
	private WebElement size;
	
	@FindBy(name = "Pink")
	private WebElement color;
	
	@FindBy(name = "Submit")
	private WebElement addToCart;

	@FindBy(xpath = "//a[@title='Proceed to checkout']")
	private WebElement proceed1;

	public Eve_Dress(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getEve_Img() {
		return eve_Img;
	}

	public WebElement getQuickView_Btn() {
		return quickView_Btn;
	}

	public WebElement getQty() {
		return qty;
	}

	public WebElement getSize() {
		return size;
	}

	public WebElement getColor() {
		return color;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

public WebElement getproceed1() {
		return proceed1;
	}
	
	
}

