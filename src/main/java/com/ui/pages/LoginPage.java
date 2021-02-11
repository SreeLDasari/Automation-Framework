package com.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ui.utils.SeleniumUtils;

public class LoginPage {
	private WebDriver driver;
	
	@FindBy(linkText="Login")
	private WebElement loginLink;
	
	
	@FindBy(id="user_email")
	private WebElement userName;
	
	@FindBy(id="user_password")
	private WebElement password;
	
	@FindBy(name="commit")
	private WebElement loginButton;
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickOnLogin() {
		loginLink.click();
		SeleniumUtils.waitForElement((By.id("user_password")), 2000, driver);
		userName.click();
	}
	public void enterUsername(String un) {
		userName.sendKeys(un);
	}
	public void doLogin(String un,String pwd) {
		userName.sendKeys(un);
		password.sendKeys(pwd);
		loginButton.click();
	}
	

}
