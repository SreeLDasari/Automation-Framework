package com.ui.pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.ui.utils.SeleniumUtils;

public class PractisePage {

	private WebDriver driver;
	
	@FindBy(xpath=("//a[contains(@class,'fedora-navbar-link navbar-link')]"))
	private WebElement practiseLink;
	
	@FindBy(id="bmwcheck")
	private WebElement radioButtons;
	
	@FindBy(id="bmwradio")
	private WebElement checkbox;
	
	@FindBy(id="openwindow")
	private WebElement openWindow;
	
	public PractisePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void clickCheckboxes() {
			SeleniumUtils.wait(2000, driver);
			checkbox.click();
			System.out.println("checkbox-2");

		
	}
	public void clickRadiobtns() {
				
		radioButtons.click();
	
		
	}
	public void clickWindow() {
		openWindow.click();
		String parent=driver.getWindowHandle();
		Set<String> handles=driver.getWindowHandles();
		for(String handle:handles) {
			System.out.println(handle);
			if(!handle.equals(parent)) {
				driver.switchTo().window(handle);
				driver.findElement(By.id("search-courses")).sendKeys("Python");
				driver.findElement(By.id("search-course-button")).click();
				driver.close();
				break;
			}
		}
		driver.switchTo().window(parent);
	}
	public void clickPractiselink() {
		
		practiseLink.click();
		
	}
	
	
}
