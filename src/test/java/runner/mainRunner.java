package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = {"classpath:features"},
		glue = {"stepDefinitions"},
		tags = "@lufthansaBrowser",
		monochrome = true,
		dryRun = false)

public class mainRunner extends AbstractTestNGCucumberTests{

}
