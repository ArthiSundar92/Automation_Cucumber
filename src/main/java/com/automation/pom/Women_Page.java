package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Women_Page {

	public static WebDriver driver;

	@FindBy(xpath = "//a[text()='Women']")
	private WebElement women_Click;

	@FindBy(xpath = "(//a[@title='Evening Dresses'])[1]")
	private WebElement eve_Dress;

	public Women_Page(WebDriver driver2) {
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
		
		
	}

	public WebElement getWomen_Click() {
		return women_Click;
	}

	public WebElement getEve_Dress() {
		return eve_Dress;
	}


	
	
}
