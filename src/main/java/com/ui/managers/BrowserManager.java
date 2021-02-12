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
		browserFactory=new BrowserFactory();
		prop = ConfigReader.getInstance().initProp();
		browserName = prop.getProperty("browser");
		driver=browserFactory.getBrowserName(browserName);
		
		return driver;
	}
	public static void closeBrowser(WebDriver driver) {
		driver.quit();
		
	}
	public static WebDriver getDriver() {
		return driver;
	}

}
