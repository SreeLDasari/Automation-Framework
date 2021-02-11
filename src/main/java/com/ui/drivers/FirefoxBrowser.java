package com.ui.drivers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ui.managers.WebDriverManager;

public class FirefoxBrowser extends WebDriverManager{
	
	private static final String FIREFOX_DRIVER_PROPERTY = "webdriver.firefox.driver";
	private FirefoxDriver driver;
	@Override
	public FirefoxDriver getBrowser() {
		System.setProperty(FIREFOX_DRIVER_PROPERTY, "D:\\drivers\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		return driver;
	}

}
