package com.automation.helper;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

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

public class Page_Object_Manager {

	public WebDriver driver;

	private HomePage h;

	private Login_Page l;

	private Women_Page w;

	private Eve_Dress e;

	private Summary_Page s;

	private Address_POM a;

	private Shipping_POM sp;

	private Payment_POM p;

	private Confirm_POM c;

	private Signout_POM si;

	public Page_Object_Manager(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver, this);

	}

	public HomePage get_InstanceHome() {

		h = new HomePage(driver);

		return h;

	}

	public Login_Page get_InstanceLogin() {

		l = new Login_Page(driver);

		return l;

	}

	public Women_Page get_InstanceWomen() {

		w = new Women_Page(driver);

		return w;

	}

	public Eve_Dress get_InstanceEveningDress() {

		e = new Eve_Dress(driver);

		return e;

	}

	public Summary_Page get_InstanceSummary() {

		s = new Summary_Page(driver);

		return s;

	}

	public Address_POM get_InstanceAddress() {

		a = new Address_POM(driver);

		return a;
	}

	public Shipping_POM get_InstanceShipping() {

		sp = new Shipping_POM(driver);

		return sp;

	}

	public Payment_POM get_InstancePayment() {

		p = new Payment_POM(driver);

		return p;

	}

	public Confirm_POM get_InstanceConfirm() {

		c = new Confirm_POM(driver);

		return c;

	}

	public Signout_POM get_InstanceSignOut() {

		si = new Signout_POM(driver);

		return si;

	}

}
