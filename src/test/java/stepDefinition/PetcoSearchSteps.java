package stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import Utilities.driverClass;

public class PetcoSearchSteps {

	@Given("I am on the Petco website")
	public void navigateToPetcoWebsite() {
		driverClass.getDriver().get("https://www.petco.com");
	}

	@When("I search for {string}")
	public void searchFor(String searchItem) {
		WebElement searchInput = driverClass.getDriver().findElement(By.id("header-search"));
		searchInput.sendKeys(searchItem);
		WebElement searchButton = driverClass.getDriver().findElement(By.xpath("//button[@aria-label='Search']"));
		searchButton.click();

	}

	@Then("I should see search results related to {string}")
	public void verifySearchResults(String searchResult) {
		String pageTitle = driverClass.getDriver().getTitle();
		Assert.assertTrue("Search results page is not displayed", pageTitle.contains(searchResult));
	}

	@Then("I click on same day delivery tab under Category")
	public void i_click_on_same_day_delivery_tab_under_category() {
		WebElement samedaybutton = driverClass.getDriver().findElement(By.xpath(
				"//*[@href='/shop/en/petcostore/search?query=small%20pet%20food&filters%5Bgroup_id%5D=same-day-delivery-products']"));
		samedaybutton.click();

	}

	@Then("I should see search results related to {string} under same day delivery category")
	public void i_should_see_search_results_related_to_under_same_day_delivery_category(String string) {
		String pageTitle = driverClass.getDriver().getTitle();
		Assert.assertTrue("Search results page is not displayed", pageTitle.contains(string));
	}

	@Then("I should scroll down")
	public void i_should_scroll_down() {
		// Scroll down to the bottom of the page
		JavascriptExecutor js = (JavascriptExecutor) driverClass.getDriver();
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
		String pageTitle = driverClass.getDriver().getTitle();
		Assert.assertTrue("Search results page is not displayed", pageTitle.contains(string));
	}

	@When("I open triple bar icon")
	public void i_open_triple_bar_icon() {
		WebElement triplebarbutton = driverClass.getDriver()
				.findElement(By.xpath("//button[@data-testid='hamburger-menu']"));
		triplebarbutton.click();
	}

	@Then("I click on small pet tab")
	public void i_click_on_small_pet_tab() {
		WebElement shopsmallpetbutton = driverClass.getDriver()
				.findElement(By.xpath("//button[@aria-label='Shop SMALL PET']"));
		shopsmallpetbutton.click();
	}

	@Then("I should see the sub page related to small pet")
	public void i_should_see_the_sub_page_related_to_small_pet() {
		Assert.assertTrue("Search results page is not displayed", driverClass.getDriver().findElement(By.xpath(
				"//li[@role='listitem'][7]//section[@class='flyout-styled__FlyoutContent-sc-317a9e89-1 itkdkh']/h2"))
				.isDisplayed());
	}

}
