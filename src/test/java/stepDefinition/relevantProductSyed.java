package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor; 
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import Utilities.cM;
import Utilities.driverClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class relevantProductSyed extends cM {
	JavascriptExecutor js = (JavascriptExecutor) driverClass.getDriver();
	Actions action = new Actions(driverClass.getDriver());
	@Given("the user is at Home Page")
	public void the_user_is_at_home_page() {
		String pageTitle = driverClass.getDriver().getTitle();
	    System.out.println("Home Page Title:");
		System.out.println(pageTitle);
	}
	@When("user clicks on Shop Menu at the Home Page")
	public void user_clicks_on_shop_menu_at_the_home_page() {
		syedsfactory.shopMenu.click();
		wait(3);
	}
	@When("clicks on the Shop By Brand")
	public void clicks_on_the_shop_by_brand() {
		syedsfactory.shopByBrand.click();
		wait(3);
	}
	@When("clicks on the brand Whole Hearted")
	public void clicks_on_the_brand_whole_hearted() {
		syedsfactory.wholeHearted.click();
		wait(3);
	}
	@When("adjusts the filter by setting the category as Dog")
	public void adjusts_the_filter_by_setting_the_category_as_dog() {
		js.executeScript("window.scrollBy(0, 550)", "");
		wait(3);
		syedsfactory.dogFilter.click();
	}
	@When("selects the Same Day Delivery under the Get It Today section")
	public void selects_the_same_day_delivery_under_the_get_it_today_section() {
		js.executeScript("window.scrollBy(0, 550)", "");
		wait(3);
		syedsfactory.sameDayDelivery.click();
	}
	@When("sets the Price Filter")
	public void sets_the_price_filter() {
		js.executeScript("window.scrollBy(0, 500)", "");
		wait(3);
		syedsfactory.priceMenu.click();
		driverClass.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		wait(3);
		syedsfactory.priceFilter.click();
		driverClass.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		wait(3);
		String filteredProducts = syedsfactory.allProducts.getText();
	    System.out.println("--------------------------------------------------");
		System.out.println("FILTERED PRODUCTS:");
	    System.out.println("--------------------------------------------------");
		System.out.println(filteredProducts);
	}
	@When("clicks on Sort By Relevance and can see the relevant products")
	public void clicks_on_sort_by_relevance_and_can_see_the_relevant_products() {
		action.sendKeys(Keys.PAGE_UP).perform();
		wait(3);
		cM.selectDropDownByVisibleText(syedsfactory.relevanceFilter, "Relevance");
		wait(3);
		System.out.println("--------------------------------------------------");
		System.out.println("RELEVANT PRODUCTS:");
		System.out.println("--------------------------------------------------");
		String allProducts = syedsfactory.allProducts.getText();
        System.out.println(allProducts);
	}
	@When("clicks on the first product in the list pf products")
	public void clicks_on_the_first_product_in_the_list_pf_products() {
		js.executeScript("window.scrollBy(0, 550)", "");
		syedsfactory.firstRelevantProduct.click();
	}
	@Then("the user should be able to see the name price and description of the selected product")
	public void the_user_should_be_able_to_see_the_name_price_and_description_of_the_selected_product() {
	    String productPageTitle = syedsfactory.productPageTitle.getText();
	    String productTitle = syedsfactory.relevantProductTitle.getText();
	    String productPrice = syedsfactory.relevantProductPrice.getText();
	    String productDescriptionType = syedsfactory.relevantProductDescriptionType.getText();
	    String productDescriptionValue = syedsfactory.relevantProductDescriptionValue.getText();
		System.out.println("--------------------------------------------------");
        System.out.println("DESIRED PRODUCT DETAILS:");
		System.out.println("--------------------------------------------------");
        System.out.println(productPageTitle);
	    System.out.println(productTitle);
	    System.out.println(productPrice);
	    System.out.println(productDescriptionType + " "  + productDescriptionValue);
	}
}
