package com.automation.stepdefinition;

import java.io.File;

import org.openqa.selenium.WebDriver;

import com.automation.baseclass.Base_Class;
import com.automation.helper.Page_Object_Manager;
import com.automation.pom.Address_POM;
import com.automation.pom.Confirm_POM;
import com.automation.pom.Eve_Dress;
import com.automation.pom.HomePage;
import com.automation.pom.Login_Page;
import com.automation.pom.Payment_POM;
import com.automation.pom.Shipping_POM;
import com.automation.pom.Signout_POM;
import com.automation.pom.Summary_Page;
import com.automation.pom.Women_Page;
import com.automation.runner.Runner;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition extends Base_Class {

	public static WebDriver driver = Runner.driver;

	Page_Object_Manager pom = new Page_Object_Manager(driver);

	@Given("^user Launch The Application$")
	public void user_Launch_The_Application() throws Throwable {

		getUrl("http://automationpractice.com/index.php");

		// String url = FileReaderManager.getInstance().getInstanceCR().getUrl();

		//String url = com.automation.helper.FileReaderManager.getInstance().getInstanceCR().getUrl();

		//getUrl(url);

		Thread.sleep(2000);

	}

	@Then("^user Click On The SignIn Button And It Navigates To The Login Page$")
	public void user_Click_On_The_SignIn_Button_And_It_Navigates_To_The_Login_Page() throws Throwable {

		//clickOnElement(h.getSignin_Btn());
		
		clickOnElement(pom.get_InstanceHome().getSignin_Btn());

		wait(200);

	}

	@When("^user Enter The Username In The Username Field$")
	public void user_Enter_The_Username_In_The_Username_Field() throws Throwable {

		//inputValueElement(l.getEmail(), "arthisundar192@gmail.com");
		
		inputValueElement(pom.get_InstanceLogin().getEmail(), "arthisundar192@gmail.com");
	}

	@When("^user Enter The Password In The Password Field$")
	public void user_Enter_The_Password_In_The_Password_Field() throws Throwable {

		//inputValueElement(l.getPassword(), "123456");
		
		inputValueElement(pom.get_InstanceLogin().getPassword(), "123456");
	}

	@Then("^user Click On The SignIn Button And It Navigates To The Purchase Page$")
	public void user_Click_On_The_SignIn_Button_And_It_Navigates_To_The_Purchase_Page() throws Throwable {

		//clickOnElement(l.getSignin_Btn());
		
		clickOnElement(pom.get_InstanceLogin().getSignin_Btn());

		wait(200);
	}

	@When("^user Move The Cursor To The Women$")
	public void user_Move_The_Cursor_To_The_Women() throws Throwable {

		//mouseOver(w.getWomen_Click(), "move");
		
		mouseOver(pom.get_InstanceWomen().getWomen_Click(), "move");

		wait(300);
	}

	@Then("^user Click The Evening Dress And It Navigates To The Evening Dress Page$")
	public void user_Click_The_Evening_Dress_And_It_Navigates_To_The_Evening_Dress_Page() throws Throwable {

		//mouseOver(w.getEve_Dress(), "click");
		
		mouseOver(pom.get_InstanceWomen().getEve_Dress(), "click");

	}

	@When("^user Move The Cursor To The Image$")
	public void user_Move_The_Cursor_To_The_Image() throws Throwable {

		//mouseOver(e.getEve_Img(), "move");
		
		mouseOver(pom.get_InstanceEveningDress().getEve_Img(), "move");

	}

	@When("^user Click On The Quick View Button And It Navigates To The Frame$")
	public void user_Click_On_The_Quick_View_Button_And_It_Navigates_To_The_Frame() throws Throwable {

		//clickOnElement(e.getQuickView_Btn());
		
		clickOnElement(pom.get_InstanceEveningDress().getQuickView_Btn());
	}

	@When("^user Will Switch To The Frame$")
	public void user_Will_Switch_To_The_Frame() throws Throwable {

		driver.switchTo().frame(0);

		wait(200);

	}

	@When("^user Click On The Quantity Button$")
	public void user_Click_On_The_Quantity_Button() throws Throwable {

		//clickOnElement(e.getQty());
		
		clickOnElement(pom.get_InstanceEveningDress().getQty());

	}

	@When("^user Click On The Size Button$")
	public void user_Click_On_The_Size_Button() throws Throwable {

		//dropDown(e.getSize(), "value", "2");
		
		dropDown(pom.get_InstanceEveningDress().getSize(), "value", "2");
	}

	@When("^user Click On The Color Button$")
	public void user_Click_On_The_Color_Button() throws Throwable {

		//clickOnElement(e.getColor());
		
		clickOnElement(pom.get_InstanceEveningDress().getColor());
	}

	@When("^user Click On The Add To Cart Button$")
	public void user_Click_On_The_Add_To_Cart_Button() throws Throwable {

		//clickOnElement(e.getAddToCart());
		
		clickOnElement(pom.get_InstanceEveningDress().getAddToCart());

		Thread.sleep(4000);

		// wait(200);
	}

	@Then("^user Click On The Proceed To Checkout Button And It Navigates To The Summary Page$")
	public void user_Click_On_The_Proceed_To_Checkout_Button_And_It_Navigates_To_The_Summary_Page() throws Throwable {

		//clickOnElement(e.getproceed1());
		
		clickOnElement(pom.get_InstanceEveningDress().getproceed1());

	}

	@When("^user Click On The Proceed To Checkout Button And It Navigates To The Address Page$")
	public void user_Click_On_The_Proceed_To_Checkout_Button_And_It_Navigates_To_The_Address_Page() throws Throwable {

		//clickOnElement(s.getSummary_Proceed());
		
		clickOnElement(pom.get_InstanceSummary().getSummary_Proceed());

	}

	@When("^user Click On The Proceed To Checkout Button And It Navigates To The Shipping Page$")
	public void user_Click_On_The_Proceed_To_Checkout_Button_And_It_Navigates_To_The_Shipping_Page() throws Throwable {

		//clickOnElement(a.getAddress_Proceed());
		
		clickOnElement(pom.get_InstanceAddress().getAddress_Proceed());

	}

	@When("^user Click On The Radio Button$")
	public void user_Click_On_The_Radio_Button() throws Throwable {

		//clickOnElement(sp.getCheckbox());
		
		clickOnElement(pom.get_InstanceShipping().getCheckbox());
	}

	@Then("^user Click On The Proceed To Checkout Button And It Navigates To The Payment Page$")
	public void user_Click_On_The_Proceed_To_Checkout_Button_And_It_Navigates_To_The_Payment_Page() throws Throwable {

		//clickOnElement(sp.getShipping_Proceed());
		
		clickOnElement(pom.get_InstanceShipping().getShipping_Proceed());

	}

	@When("^user Click On The Pay By Bank Wire And It Navigates To The Confirm Order Page$")
	public void user_Click_On_The_Pay_By_Bank_Wire_And_It_Navigates_To_The_Confirm_Order_Page() throws Throwable {

		//clickOnElement(p.getBankWire());
		
		clear(pom.get_InstancePayment().getBankWire());

	}

	@When("^user Click On The Confirm Order$")
	public void user_Click_On_The_Confirm_Order() throws Throwable {

		//clickOnElement(c.getConfirm());
		
		clickOnElement(pom.get_InstanceConfirm().getConfirm());
	}

	@Then("^user View The WebTable And It Navigates To The Payment Signout Page$")
	public void user_View_The_WebTable_And_It_Navigates_To_The_Payment_Signout_Page() throws Throwable {

		//scroll(c.getBox(), "view");
		
		scroll(pom.get_InstanceConfirm().getBox(), "view");
		
		screenShot("C:\\Users\\USER\\eclipse-workspace\\AutomationPractice_Cucumber\\Snapshot\\Webtable.png");
		
	}

	@When("^user Click On The SignOut Button$")
	public void user_Click_On_The_SignOut_Button() throws Throwable {

		//clickOnElement(si.getSignOut());
		
		clickOnElement(pom.get_InstanceSignOut().getSignOut());
	}

}
