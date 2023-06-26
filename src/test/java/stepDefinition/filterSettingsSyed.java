package stepDefinition;


import org.openqa.selenium.JavascriptExecutor;

import Utilities.cM; 
import Utilities.driverClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class filterSettingsSyed extends cM {
	JavascriptExecutor js = (JavascriptExecutor) driverClass.getDriver();
	
    // Test Case 1
	@Given("The user is on the Home Page")
	public void the_user_is_on_the_home_page() {
		String pageTitle = driverClass.getDriver().getTitle();
	    System.out.println("Home Page Title:");
		System.out.println(pageTitle);
	}

	@When("the user clicks on the Shop Menu")
	public void the_user_clicks_on_the_shop_menu() {
		fs.shopMenu.click();
		wait(3);
	}

	@When("the user clicks on Shop By Brand")
	public void the_user_clicks_on_shop_by_brand() {
		fs.shopByBrand.click();
		wait(3);
	}

	@When("the user clicks on the brand Whole Hearted")
	public void the_user_clicks_on_the_brand_whole_hearted() {
		fs.wholeHearted.click();
		wait(3);
	}

	@When("the user selects the Dog filter")
	public void the_user_selects_the_dog_filter() {
		js.executeScript("window.scrollBy(0, 550)", "");
		wait(3);
		fs.dogFilter.click();
	}

	@When("the user clicks on the Same Day Delivery filter")
	public void the_user_clicks_on_the_same_day_delivery_filter() {
		js.executeScript("window.scrollBy(0, 550)", "");
		wait(3);
		fs.sameDayDelivery.click();
	}

	@When("the user selects the Price Range")
	public void the_user_selects_the_price_range() {
		js.executeScript("window.scrollBy(0, 500)", "");
		wait(3);
		fs.priceMenu.click();
		wait(3);
		fs.priceFilter.click();
	}

	@Then("the user should see the accurate results")
	public void the_user_should_see_the_accurate_results() {
		String filteredProducts = fs.allProducts.getText();
		System.out.println("--------------------------------------------------");
		System.out.println("FILTERED PRODUCTS:");
	    System.out.println("--------------------------------------------------");
		System.out.println(filteredProducts);
	}
	
}
