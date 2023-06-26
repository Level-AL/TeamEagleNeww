package stepDefinition;

import org.junit.Assert; 

import Utilities.cM;
import Utilities.driverClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class brandNavigationSyed extends cM {
	@Given("the user is on Home Page")
	public void the_user_is_on_home_page() {
		String pageTitle = driverClass.getDriver().getTitle();
	    System.out.println("Home Page Title:");
		System.out.println(pageTitle);
	}
	@When("the user clicks on Shop Menu")
	public void the_user_clicks_on_shop_menu() {
		bn.shopMenu.click();
	    wait(3);
	}
	@When("the user clicks on Shop By Brand menu")
	public void the_user_clicks_on_shop_by_brand_menu() {
		bn.shopByBrand.click();
	    wait(3);
	}
	@When("the user clicks on brand Whole Hearted")
	public void the_user_clicks_on_brand_whole_hearted() {
		bn.wholeHearted.click();
	    wait(3);
	}
	@Then("the user should be able to navigate to the Whole Hearted page")
	public void the_user_should_be_able_to_navigate_to_the_whole_hearted_page() {
		String actualTitle = driverClass.getDriver().getTitle();
		   String expectedTitle = "Wholehearted | Petco";
		   Assert.assertEquals(expectedTitle, actualTitle);
		   System.out.println("Brand Page Title:");
		   System.out.println(actualTitle);
	}
}
