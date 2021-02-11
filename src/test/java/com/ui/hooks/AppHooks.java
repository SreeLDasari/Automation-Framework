package com.ui.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.gherkin.model.Scenario;
import com.ui.managers.BrowserManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AppHooks {
	private WebDriver driver;
	private BrowserManager browserManager=new BrowserManager();

	@Before
	public void launchBrowser() {
		  System.out.println("3");
		  driver=  browserManager.getBrowserDriver();
		  System.out.println("4");

	}

	@After
	public void quitBrowser() {
		browserManager.closeBrowser(driver);
	}


}
