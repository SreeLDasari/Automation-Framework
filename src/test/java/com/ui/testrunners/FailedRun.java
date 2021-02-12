package com.ui.testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
@CucumberOptions(
		
		monochrome=true,
		glue= {"com.ui.stepdefinitions","com.ui.hooks"},
		plugin=  {"pretty",
					"rerun:target/failedrerun.txt"},
		features = {"@target/failedrerun.txt"}
		)
public class FailedRun extends AbstractTestNGCucumberTests{

}
