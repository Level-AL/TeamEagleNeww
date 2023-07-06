package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import Utilities.ConfigurationReader;
import Utilities.cM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TrooksStepDefinitions extends cM {

	@Given("I am on the Petco website")
	public void navigateToPetcoWebsite() {
		getDriver();
	}

	@When("I search for {string}")
	public void searchFor(String searchItem) {
		tf.searchBar.sendKeys(searchItem);
		tf.searchButton.click();
	}

	@Then("I should see search results related to {string}")
	public void verifySearchResults(String searchResult) {
		Assert.assertTrue(ConfigurationReader.getProperty("DisplayErrorMessage"),
				getDriver().getTitle().contains(searchResult));
	}

	@Then("I click on same day delivery tab under Category")
	public void i_click_on_same_day_delivery_tab_under_category() {
		tf.sameDayButtonUnderCategoryTab.click();
	}

	@Then("I should see search results related to {string} under same day delivery category")
	public void i_should_see_search_results_related_to_under_same_day_delivery_category(String string) {
		Assert.assertTrue(ConfigurationReader.getProperty("DisplayErrorMessage"),
				getDriver().getTitle().contains(string));
	}

	@Then("I should scroll down")
	public void i_should_scroll_down() {
		// Scroll down to the bottom of the page
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");

		// Wait for a brief moment after scrolling
		try {
			TimeUnit.SECONDS.sleep(5);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Then("I should see the other items while scrolling down related to {string}")
	public void i_should_see_the_other_items_while_scrolling_down_related_to(String string) {
		Assert.assertTrue(ConfigurationReader.getProperty("DisplayErrorMessage"),
				getDriver().getTitle().contains(string));
	}

	@When("I open triple bar icon")
	public void i_open_triple_bar_icon() {
		tf.triplebarbutton.click();
	}

	@Then("I click on small pet tab")
	public void i_click_on_small_pet_tab() {
		tf.shopSmallPetButtonInsideTripleBar.click();
	}

	@Then("I should see the sub page related to small pet")
	public void i_should_see_the_sub_page_related_to_small_pet() {
		Assert.assertTrue(ConfigurationReader.getProperty("DisplayErrorMessage"),
				tf.smallPetSubPageTitle.isDisplayed());
	}

}
