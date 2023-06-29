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
<<<<<<< HEAD:src/test/java/runners/petcoLoginRunner.java
		dryRun = false
		
=======
		dryRun = false,
		tags = "@testCase04"
>>>>>>> 0e0c73887371164d4c99d7de60cdc8cc398ddceb:src/test/java/runners/SyedsRunner.java
		)
public class SyedsRunner {
	
}
