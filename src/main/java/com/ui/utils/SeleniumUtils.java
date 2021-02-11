package com.ui.utils;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumUtils {

	public static void wait(int timeinseconds,WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(timeinseconds, TimeUnit.SECONDS);
	}

	public static WebElement waitForElement(By locator, int timeout,WebDriver driver) {
		WebElement element = null;
		WebDriverWait wait = new WebDriverWait(driver, 3);
		element = wait.until(
				ExpectedConditions.visibilityOfElementLocated(locator));
		System.out.println("Element appeared on the web page");	
		return element;
	}
	
	public static boolean isElementPresent(WebElement webElement) { 
		boolean isPresent = webElement.isDisplayed();
         return isPresent;
	}
}
