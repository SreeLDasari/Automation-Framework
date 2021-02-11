package com.ui.testrunners;

import org.testng.annotations.Test;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features={"src/test/resources/com/ui/features/"},
		monochrome=true,
		glue= {"com.ui.stepdefinitions","com.ui.hooks"},
		plugin= {"pretty"}
		)
public class TestRunner  extends AbstractTestNGCucumberTests{
	@Test
	public void f() {
	}
}

