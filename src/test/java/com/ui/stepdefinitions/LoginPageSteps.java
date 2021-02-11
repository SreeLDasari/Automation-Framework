package com.ui.stepdefinitions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.ui.managers.BrowserManager;
import com.ui.pages.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	 WebDriver driver;
	 BrowserManager bm=new BrowserManager();
	private LoginPage loginpage=new LoginPage(bm.getDriver());
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		  System.out.println("1");
		  BrowserManager.getDriver().get("https://letskodeit.teachable.com/");
	  System.out.println("2");
	}

	@When("User Navigate to Login Page")
	public void user_navigate_to_login_page() {
		loginpage.clickOnLogin();
		  System.out.println("user is on login page");

	}

	@When("User enters {string} and {string}")
	public void user_enters_and(String un, String pwd) {
		  System.out.println("befor login");
		 // loginpage.enterUsername("sree");
		    loginpage.doLogin(un, pwd);
		  System.out.println("user is on Account page page");

	    
	}

		
}
