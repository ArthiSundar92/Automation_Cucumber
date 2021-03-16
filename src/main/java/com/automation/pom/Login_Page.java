package com.automation.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public static WebDriver driver;

	@FindBy(name = "email")
	private WebElement email;

	@FindBy(name = "passwd")
	private WebElement password;

	@FindBy(xpath = "//i[@class='icon-lock left']")
	private WebElement signin_Btn;
	
	
	public Login_Page(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver, this);

	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSignin_Btn() {
		return signin_Btn;
	}

	

}
