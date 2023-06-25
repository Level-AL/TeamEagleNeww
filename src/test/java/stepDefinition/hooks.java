package stepDefinition;

import Utilities.driverClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	@Before
	public void beforeMethod() {
		driverClass.getDriver();
	}
	
	@After
	public void tearDown() {
		driverClass.tearDown();
	}
}
