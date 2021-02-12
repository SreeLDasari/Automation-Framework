package com.ui.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.ui.managers.BrowserManager;
import com.ui.managers.WebDriverManager;

public class ChromeBrowser extends WebDriverManager{
	
	private static final String CHROME_DRIVER_PROPERTY = "webdriver.chrome.driver";
	public WebDriver driver=null;
	
	@Override
	public WebDriver getBrowser() {
		System.setProperty(CHROME_DRIVER_PROPERTY, "D:\\SriluJava\\chromedriver.exe");
		driver=new ChromeDriver();
		System.out.println("chrome browswe class");
		driver.manage().window().maximize();
		return driver;
	}
	
	




		

}
