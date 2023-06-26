package stepDefinition;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import Utilities.cM;
import Utilities.driverClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class sortByRelevanceSyed extends cM {
	JavascriptExecutor js = (JavascriptExecutor) driverClass.getDriver();
	Actions action = new Actions(driverClass.getDriver());
	@Given("the user is at the Home Page")
	public void the_user_is_at_the_home_page() {
		String pageTitle = driverClass.getDriver().getTitle();
	    System.out.println("Home Page Title:");
		System.out.println(pageTitle);
	}
	@When("the user clicks on Shop Menu at the Home Page")
	public void the_user_clicks_on_shop_menu_at_the_home_page() {
		sbr.shopMenu.click();
		wait(3);
	}
	@When("then clicks on the Shop By Brand")
	public void then_clicks_on_the_shop_by_brand() {
		sbr.shopByBrand.click();
		wait(3);
	}
	@When("then clicks on the brand Whole Hearted")
	public void then_clicks_on_the_brand_whole_hearted() {
		sbr.wholeHearted.click();
		wait(3);
	}
	@When("then adjusts the filter by setting the category as Dog")
	public void then_adjusts_the_filter_by_setting_the_category_as_dog() {
		js.executeScript("window.scrollBy(0, 550)", "");
		wait(3);
		sbr.dogFilter.click();
	}
	@When("then selects the Same Day Delivery under the Get It Today section")
	public void then_selects_the_same_day_delivery_under_the_get_it_today_section() {
		js.executeScript("window.scrollBy(0, 550)", "");
		wait(3);
		sbr.sameDayDelivery.click();
	}
	@When("then sets the Price Filter")
	public void then_sets_the_price_filter() {
		js.executeScript("window.scrollBy(0, 500)", "");
		wait(3);
		sbr.priceMenu.click();
		wait(3);
		sbr.priceFilter.click();
		wait(3);
		String filteredProducts = sbr.allProducts.getText();
	    System.out.println("--------------------------------------------------");
		System.out.println("FILTERED PRODUCTS:");
	    System.out.println("--------------------------------------------------");
		System.out.println(filteredProducts);
	}
	@When("then clicks on Sort By Relevance")
	public void then_clicks_on_sort_by_relevance() {
		action.sendKeys(Keys.PAGE_UP).perform();
		wait(3);
		cM.selectDropDownByVisibleText(sbr.relevanceFilter, "Relevance");
		wait(3);
	}
	@Then("the user can see the relevant products")
	public void the_user_can_see_the_relevant_products() {
	    System.out.println("--------------------------------------------------");
	    System.out.println("RELEVANT PRODUCTS:");
	    System.out.println("--------------------------------------------------");
	    String allProducts = sbr.allProducts.getText();
		System.out.println(allProducts);
	}
}
