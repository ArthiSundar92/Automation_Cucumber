package com.automation.helper;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Configuration_Reader {
	
	public static Properties p;
	
	public Configuration_Reader() throws Throwable {
		
		File f = new File("C:\\Users\\USER\\eclipse-workspace\\AutomationPractice_Cucumber\\src\\test\\java\\com\\automation\\feature");
		
		FileInputStream fis = new FileInputStream(f);
		
		p = new Properties();
		
		// load
		
		p.load(fis);
		 
	}
	
	public String getBrowser() {
		
		String browser = p.getProperty("browser");
		
		return browser;

	}
	
	public String getUrl() {
		
		String url = p.getProperty("url");
		
		return url;

	}


}
