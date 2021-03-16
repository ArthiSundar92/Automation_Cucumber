package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shipping_POM {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "(//button[@type='submit'])[2]")
	private WebElement shipping_Proceed;

	@FindBy(name = "cgv")
	private WebElement checkbox;

	public Shipping_POM(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getShipping_Proceed() {
		return shipping_Proceed;
	}

	public WebElement getCheckbox() {
		return checkbox;
	}
	
	
	
	
	
	
}
