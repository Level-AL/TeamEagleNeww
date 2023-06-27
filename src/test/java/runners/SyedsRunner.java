package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

// Validate the functionality of filtering by category, Get it today, price.
@RunWith (Cucumber.class)
@CucumberOptions(
		plugin = {"pretty", "html:target/cucumber-report.html", "json:target/cucumber.json"},
		features = "src/test/resources/features/SyedsFeatures.feature",
		glue = "stepDefinition",
		dryRun = false,
		tags = ""
		)
public class SyedsRunner {
	
}
