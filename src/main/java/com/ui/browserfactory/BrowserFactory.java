package com.ui.browserfactory;

import java.util.Properties;
import org.openqa.selenium.WebDriver;
import com.ui.drivers.ChromeBrowser;
import com.ui.drivers.FirefoxBrowser;
import com.ui.managers.WebDriverManager;

public class BrowserFactory {

	public WebDriver driver;
	public WebDriver getBrowserName(String browser) {

		if(browser==null || browser.equals("chrome")) {
			driver=new ChromeBrowser().getBrowser();
			return driver;
		}else if(browser.equals("firefox")){
			driver=new FirefoxBrowser().getBrowser();
			return driver;
		}
		else throw new RuntimeException("Browser Name Key value in Configuration.properties is not matched : " + browser);
	}

}
