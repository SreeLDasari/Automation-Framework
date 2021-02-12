package com.ui.managers;

import org.openqa.selenium.WebDriver;

import com.ui.pages.LoginPage;
import com.ui.pages.PractisePage;

public class PageObjectManager {

	private WebDriver driver;
	private LoginPage loginPage;
	private PractisePage practisePage;
	public PageObjectManager(WebDriver driver) {
		this.driver = driver;
	}

	public LoginPage getLoginPage(){
		return (loginPage == null) ? loginPage = new LoginPage(driver) : loginPage;
	}
	public PractisePage getPractisePage(){
		return (practisePage == null) ? practisePage = new PractisePage(driver) : practisePage;
	}
	
	
}
