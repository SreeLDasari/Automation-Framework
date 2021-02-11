package com.ui.managers;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import com.ui.browserfactory.BrowserFactory;
import com.ui.dataproviders.ConfigReader;


public class BrowserManager {
	public static WebDriver driver;
	public BrowserFactory browserFactory;
	public Properties prop;
	public String browserName;
	public WebDriver getBrowserDriver() {
		System.out.println("BM-1");
		browserFactory=new BrowserFactory();
		System.out.println("BM-2");

		prop = ConfigReader.getInstance().initProp();
		System.out.println("prop"+prop);

		browserName = prop.getProperty("browser");
		System.out.println(browserName);
		driver=browserFactory.getBrowserName(browserName);
		System.out.println(browserName);

		
		return driver;
	}
	public static void closeBrowser(WebDriver driver) {
		driver.quit();
		
	}
	public static WebDriver getDriver() {
		return driver;
	}
	
	
	
}
