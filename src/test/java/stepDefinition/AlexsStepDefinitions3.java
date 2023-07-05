package stepDefinition;

import Utilities.cM;
import Utilities.driverClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AlexsStepDefinitions3 extends cM {
	
	@Given("User is on the homePage")
	public void user_is_on_the_homepage() {
	    driverClass.getDriver();
	}

	@And("clicks on search bar")
	public void clicks_on_search_bar() {
	    cM.waitForVisibilty(af.searchBar);
		af.searchBar.click();
	}

	@And("user enter valid search term dog food")
	public void user_enter_valid_search_term_dog_food() {
	   af.searchBar.sendKeys("dog food");
	}

	@And("user clicks yellow search button on bar")
	public void user_clicks_yellow_search_button_on_bar() {
	   cM.waitForVisibilty(af.dogFoodLink);
		af.dogFoodLink.click();
	}

	@Then("verify landing on dog food page")
	public void verify_landing_on_dog_food_page() {
		if (af.searchDogFoodValidation.isDisplayed()) {
            System.out.println("Search Success");
        } else {
            System.out.println("Search FAILED!!");
        }
	}
	
}
