package stepDefinition;


import Utilities.driverClass;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooks {
	//By Naidan
	@Before
    public void setUp(){
        System.out.println("I am setting up the test from the Hooks class!!!");
        driverClass.getDriver();
    }
    @After
    public void tearDown(Scenario scenario){
        System.out.println("I am reporting the results");
//        driverClass.tearDown();
    }
}
