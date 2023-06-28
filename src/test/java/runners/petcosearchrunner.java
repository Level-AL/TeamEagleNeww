package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;


public class petcosearchrunner {

	
	@RunWith(Cucumber.class)
	@CucumberOptions(features = "path/to/petco_search.feature",
	                 glue = "path.to.step.definitions.package")
	public class PetcoSearchTestRunner {
	}

}
