package com.ui.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.ui.managers.BrowserManager;
import com.ui.managers.PageObjectManager;
import com.ui.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	BrowserManager browsermanager=new BrowserManager();
	WebDriver driver;
	 PageObjectManager pageobjects=new PageObjectManager(browsermanager.getDriver());
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		  BrowserManager.getDriver().get("https://letskodeit.teachable.com/");
	}

	@When("User Navigate to Login Page")
	public void user_navigate_to_login_page() {
		pageobjects.getLoginPage().clickOnLogin();
	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String un, String pwd) {
		pageobjects.getLoginPage().doLogin(un, pwd);

	}

		
}
