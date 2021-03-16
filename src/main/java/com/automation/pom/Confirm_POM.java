package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm_POM {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//span[text()='I confirm my order']")
	private WebElement confirm;
	
	@FindBy(xpath = "//div[@class='box']")
	private WebElement box;

	public Confirm_POM(WebDriver driver2) {
		
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public WebElement getConfirm() {
		return confirm;
	}

	public WebElement getBox() {
		return box;
	}

	
	

}
