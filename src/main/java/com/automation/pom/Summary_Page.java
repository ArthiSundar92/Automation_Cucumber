package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Summary_Page {
	
	public static WebDriver driver;
	
	@FindBy(xpath = "//span[text()='Proceed to checkout']")
	private WebElement 	summary_Proceed;
	
	
	@FindBy(xpath = "//a[@title='Add']")
	private WebElement add;
	
	@FindBy(xpath = "//a[@title='Subtract']")
	private WebElement sub;
	
	@FindBy(xpath = "//a[@title='Delete']")
	private WebElement delete;
	

	public WebElement getAdd() {
		return add;
	}

	public void setAdd(WebElement add) {
		this.add = add;
	}

	public WebElement getSub() {
		return sub;
	}

	public void setSub(WebElement sub) {
		this.sub = sub;
	}

	public WebElement getDelete() {
		return delete;
	}

	public void setDelete(WebElement delete) {
		this.delete = delete;
	}

	public static WebDriver getDriver() {
		return driver;
	}

	public Summary_Page(WebDriver driver2) {
		
		
		this.driver = driver2;
		
		PageFactory.initElements(driver, this);
	}

	public WebElement getSummary_Proceed() {
		return summary_Proceed;
	}
	
	

}
