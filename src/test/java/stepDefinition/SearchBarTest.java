package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utilities.cM;
import Utilities.driverClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SearchBarTest extends cM {

	@Given("User is on the Home page")
	public void user_is_on_the_home_page() {
		driverClass.getDriver();

	}

	@When("User enters a vlid dog product keyword")
	public void user_enters_a_vlid_dog_product_keyword() {
		// driverClass.getDriver().findElement(By.xpath("//*[@id=\"header-search\"]"));

		WebElement searchBar = driverClass.getDriver().findElement(By.xpath("//*[@id=\"header-search\"]"));
		searchBar.sendKeys("Dog Food");
	}

	@When("clicks on the search button")
	public void clicks_on_the_search_button() throws InterruptedException {
		WebElement searchBtn = driverClass.getDriver().findElement(By.xpath("//button[@aria-label='Search']"));
		searchBtn.click();

	}

	@Then("user should navigate to the desired product page")
	public void user_should_navigate_to_the_desired_product_page() {

		driverClass.getDriver().getTitle();
		String actualTitle = driverClass.getDriver().getTitle();
		String expectedTitle = "Dog Food | Petco";
		Assert.assertEquals(expectedTitle, actualTitle);

	}

}
