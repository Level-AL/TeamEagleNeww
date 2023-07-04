package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utilities.driverClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DogCategoryPresenceTest {

	@Given("User is on the petco.com Home page")
	public void user_is_on_the_petco_com_home_page() {
		driverClass.getDriver();

	}

	@When("User locates the navigation menue and clicks on it")
	public void user_locates_the_navigation_menue_and_clicks_on_it() throws InterruptedException {
		WebElement navigationMenue = driverClass.getDriver()
				.findElement(By.xpath("//*[@id=\"topcontent\"]/div[2]/button"));
		navigationMenue.click();
		Thread.sleep(3000)
;	}

	@Then("Dog Category should be displayed in the navigation menue")
	public void dog_category_should_be_displayed_in_the_navigation_menue() {
		WebElement DogElement = driverClass.getDriver().findElement(By.xpath("//span[text()='DOG']"));
		
		if (DogElement.isDisplayed()) {
			System.out.println("Test passed: DOG category is displayed in the navigation menu.");
		} else {
			System.out.println("Test failed: DOG category is not displayed in the navigation menu.");
		}

	}

}
