package com.ui.stepdefinitions;

import org.openqa.selenium.WebDriver;

import com.ui.managers.BrowserManager;
import com.ui.managers.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PractisePageSteps {

	BrowserManager browsermanager=new BrowserManager();
	WebDriver driver;
	PageObjectManager pageobjects=new PageObjectManager(browsermanager.getDriver());
	
	@Given("User should be on Practise page")
	public void user_should_be_on_practise_page() {
		System.out.println("in given-1");
		browsermanager.getDriver().get("https://letskodeit.teachable.com/");
		System.out.println("in given-2");
		pageobjects.getPractisePage().clickPractiselink();
		System.out.println("in given-3");

	}

	@When("click all the checkboxes")
	public void click_all_the_checkboxes() {

		pageobjects.getPractisePage().clickCheckboxes();

	}

	@When("click on open window link")
	public void click_on_open_window_link() {

		pageobjects.getPractisePage().clickWindow();
	}

	@When("click radiobuttons available in Practise page")
	public void radiobuttons_available_in_practise_page() {
		pageobjects.getPractisePage().clickRadiobtns();
	}

	@Then("user should be able to new window opened")
	public void user_should_be_able_to_new_window_opened() {
		pageobjects.getPractisePage().clickWindow();
	}
	
}
