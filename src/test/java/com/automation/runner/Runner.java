package com.automation.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.automation.baseclass.Base_Class;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)

@CucumberOptions(features = "src//test//java//com//automation//feature", glue = "com\\automation\\stepdefinition")

public class Runner {

	public static WebDriver driver;

	@BeforeClass

	public static void setUp() {
		
		driver =Base_Class.getBrowser("chrome");
		
	}

	@AfterClass

	public static void tearDown() {

		//driver.close();
		
		Base_Class.close();

	}

}
