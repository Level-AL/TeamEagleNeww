package stepDefinition;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.Highlighter;
import Utilities.cM;
import Utilities.driverClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SyedsStepDefinitions extends cM {
	
JavascriptExecutor js = (JavascriptExecutor) driverClass.getDriver();
	Actions action = new Actions(driverClass.getDriver());
	    // Test Case 1
		@Given("The user is on the Home Page")
		public void the_user_is_on_the_home_page() {
			String pageTitle = driverClass.getDriver().getTitle();
		    System.out.println("Home Page Title:");
			System.out.println(pageTitle);
		}

		@When("the user clicks on the Shop Menu")
		public void the_user_clicks_on_the_shop_menu() {
		        Highlighter.highlightElement(driverClass.getDriver(), syedsfactory.shopMenu);
		        syedsfactory.shopMenu.click();
		        wait(3);
		}

		@When("the user clicks on Shop By Brand")
		public void the_user_clicks_on_shop_by_brand() {
	        Highlighter.highlightElement(driverClass.getDriver(), syedsfactory.shopByBrand);
	        syedsfactory.shopByBrand.click();
	        wait(3);
		}

		@When("the user clicks on the brand Whole Hearted")
		public void the_user_clicks_on_the_brand_whole_hearted() {
	        Highlighter.highlightElement(driverClass.getDriver(), syedsfactory.wholeHearted);
	        syedsfactory.wholeHearted.click();
	        wait(3);
		}

		@When("the user selects the Dog filter")
		public void the_user_selects_the_dog_filter() {
			js.executeScript("window.scrollBy(0, 550)", "");
	        wait(3);
	        Highlighter.highlightElement(driverClass.getDriver(), syedsfactory.dogFilter);
	        syedsfactory.dogFilter.click();
	        wait(3);
		}

		@When("the user clicks on the Same Day Delivery filter")
		public void the_user_clicks_on_the_same_day_delivery_filter() {
			js.executeScript("window.scrollBy(0, 550)", "");
	        wait(3);
	        Highlighter.highlightElement(driverClass.getDriver(), syedsfactory.sameDayDelivery);
	        syedsfactory.sameDayDelivery.click();
	        wait(3);
		}

		@When("the user selects the Price Range")
		public void the_user_selects_the_price_range() {
			js.executeScript("window.scrollBy(0, 500)", "");
	        wait(3);
	        Highlighter.highlightElement(driverClass.getDriver(), syedsfactory.priceMenu);
	        syedsfactory.priceMenu.click();
	        wait(3);
	        Highlighter.highlightElement(driverClass.getDriver(), syedsfactory.priceFilter);
	        syedsfactory.priceFilter.click();
	        wait(3);
		}

		@Then("the user should see the accurate results")
		public void the_user_should_see_the_accurate_results() {
			String filteredProducts = syedsfactory.allProducts.getText();
			System.out.println("--------------------------------------------------");
			System.out.println("FILTERED PRODUCTS:");
		    System.out.println("--------------------------------------------------");
			System.out.println(filteredProducts);
		}
		
		// Test Case 02
		@Given("the user is on Home Page")
		public void the_user_is_on_home_page() {
			String pageTitle = driverClass.getDriver().getTitle();
		    System.out.println("Home Page Title:");
			System.out.println(pageTitle);
		}
		@When("the user clicks on Shop Menu")
		public void the_user_clicks_on_shop_menu() {
	        Highlighter.highlightElement(driverClass.getDriver(), syedsfactory.shopMenu);
	        syedsfactory.shopMenu.click();
	        wait(3);
		}
		@When("the user clicks on Shop By Brand menu")
		public void the_user_clicks_on_shop_by_brand_menu() {
	        Highlighter.highlightElement(driverClass.getDriver(), syedsfactory.shopByBrand);
	        syedsfactory.shopByBrand.click();
	        wait(3);
		}
		@When("the user clicks on brand Whole Hearted")
		public void the_user_clicks_on_brand_whole_hearted() {
	        Highlighter.highlightElement(driverClass.getDriver(), syedsfactory.wholeHearted);
	        syedsfactory.wholeHearted.click();
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
		
		// Test Case 03
		@Given("the user is at the Home Page")
		public void the_user_is_at_the_home_page() {
			String pageTitle = driverClass.getDriver().getTitle();
		    System.out.println("Home Page Title:");
			System.out.println(pageTitle);
		}
		@When("the user clicks on Shop Menu at the Home Page")
		public void the_user_clicks_on_shop_menu_at_the_home_page() {
	        Highlighter.highlightElement(driverClass.getDriver(), syedsfactory.shopMenu);
	        syedsfactory.shopMenu.click();
	        wait(3);
		}
		@When("then clicks on the Shop By Brand")
		public void then_clicks_on_the_shop_by_brand() {
		        Highlighter.highlightElement(driverClass.getDriver(), syedsfactory.shopByBrand);
		        syedsfactory.shopByBrand.click();
		        wait(3);
		}
		@When("then clicks on the brand Whole Hearted")
		public void then_clicks_on_the_brand_whole_hearted() {
	        Highlighter.highlightElement(driverClass.getDriver(), syedsfactory.wholeHearted);
	        syedsfactory.wholeHearted.click();
	        wait(3);
		}
		@When("then adjusts the filter by setting the category as Dog")
		public void then_adjusts_the_filter_by_setting_the_category_as_dog() {
			js.executeScript("window.scrollBy(0, 550)", "");
	        wait(3);
	        Highlighter.highlightElement(driverClass.getDriver(), syedsfactory.dogFilter);
	        syedsfactory.dogFilter.click();
	        wait(3);
		}
		@When("then selects the Same Day Delivery under the Get It Today section")
		public void then_selects_the_same_day_delivery_under_the_get_it_today_section() {
			js.executeScript("window.scrollBy(0, 550)", "");
	        wait(3);
	        Highlighter.highlightElement(driverClass.getDriver(), syedsfactory.sameDayDelivery);
	        syedsfactory.sameDayDelivery.click();
	        wait(3);
		}
		@When("then sets the Price Filter")
		public void then_sets_the_price_filter() {
			js.executeScript("window.scrollBy(0, 500)", "");
	        wait(3);
	        Highlighter.highlightElement(driverClass.getDriver(), syedsfactory.priceMenu);
	        syedsfactory.priceMenu.click();
	        wait(3);
	        Highlighter.highlightElement(driverClass.getDriver(), syedsfactory.priceFilter);
	        syedsfactory.priceFilter.click();
	        wait(3);
	        String filteredProducts = syedsfactory.allProducts.getText();
	        System.out.println("--------------------------------------------------");
	        System.out.println("FILTERED PRODUCTS:");
	        System.out.println("--------------------------------------------------");
	        System.out.println(filteredProducts);
		}
		@When("then clicks on Sort By Relevance")
		public void then_clicks_on_sort_by_relevance() {
			action.sendKeys(Keys.PAGE_UP).perform();
	        wait(3);
	        Highlighter.highlightElement(driverClass.getDriver(), syedsfactory.relevanceFilter);
	        cM.selectDropDownByVisibleText(syedsfactory.relevanceFilter, "Relevance");
	        wait(3);
		}
		@Then("the user can see the relevant products")
		public void the_user_can_see_the_relevant_products() {
		    System.out.println("--------------------------------------------------");
		    System.out.println("RELEVANT PRODUCTS:");
		    System.out.println("--------------------------------------------------");
		    String allProducts = syedsfactory.allProducts.getText();
			System.out.println(allProducts);
		}
		
		// Test Case 04
		@Given("the user is at Home Page")
		public void the_user_is_at_home_page() {
			String pageTitle = driverClass.getDriver().getTitle();
		    System.out.println("Home Page Title:");
			System.out.println(pageTitle);
		}
		@When("user clicks on Shop Menu at the Home Page")
		public void user_clicks_on_shop_menu_at_the_home_page() {
		        Highlighter.highlightElement(driverClass.getDriver(), syedsfactory.shopMenu);
		        syedsfactory.shopMenu.click();
		        wait(3);
		}
		@When("clicks on the Shop By Brand")
		public void clicks_on_the_shop_by_brand() {
		        Highlighter.highlightElement(driverClass.getDriver(), syedsfactory.shopByBrand);
		        syedsfactory.shopByBrand.click();
		        wait(3);
		}
		@When("clicks on the brand Whole Hearted")
		public void clicks_on_the_brand_whole_hearted() {
		        Highlighter.highlightElement(driverClass.getDriver(), syedsfactory.wholeHearted);
		        syedsfactory.wholeHearted.click();
		        wait(3);
		}
		@When("adjusts the filter by setting the category as Dog")
		public void adjusts_the_filter_by_setting_the_category_as_dog() {
			js.executeScript("window.scrollBy(0, 550)", "");
	        wait(3);
	        Highlighter.highlightElement(driverClass.getDriver(), syedsfactory.dogFilter);
	        syedsfactory.dogFilter.click();
	        wait(3);
		}
		@When("selects the Same Day Delivery under the Get It Today section")
		public void selects_the_same_day_delivery_under_the_get_it_today_section() {
			js.executeScript("window.scrollBy(0, 550)", "");
	        wait(3);
	        Highlighter.highlightElement(driverClass.getDriver(), syedsfactory.sameDayDelivery);
	        syedsfactory.sameDayDelivery.click();
	        wait(3);
		}
		@When("sets the Price Filter")
		public void sets_the_price_filter() {
			js.executeScript("window.scrollBy(0, 500)", "");
	        wait(3);
	        Highlighter.highlightElement(driverClass.getDriver(), syedsfactory.priceMenu);
	        syedsfactory.priceMenu.click();
	        driverClass.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        wait(3);
	        Highlighter.highlightElement(driverClass.getDriver(), syedsfactory.priceFilter);
	        syedsfactory.priceFilter.click();
	        driverClass.getDriver().manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        wait(3);
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
	        Highlighter.highlightElement(driverClass.getDriver(), syedsfactory.relevanceFilter);
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
		    wait(3);
		    Highlighter.highlightElement(driverClass.getDriver(), syedsfactory.firstRelevantProduct);
		    syedsfactory.firstRelevantProduct.click();
		}
		@Then("the user should be able to see the name price and description of the selected product")
		public void the_user_should_be_able_to_see_the_name_price_and_description_of_the_selected_product() {
		   
		    Highlighter.highlightElement(driverClass.getDriver(), syedsfactory.relevantProductTitle);
		    Highlighter.highlightElement(driverClass.getDriver(), syedsfactory.relevantProductPrice);
		    Highlighter.highlightElement(driverClass.getDriver(), syedsfactory.relevantProductDescriptionType);
		    Highlighter.highlightElement(driverClass.getDriver(), syedsfactory.relevantProductDescriptionValue);

		    String productTitle = syedsfactory.relevantProductTitle.getText();
		    String productPrice = syedsfactory.relevantProductPrice.getText();
		    String productDescriptionType = syedsfactory.relevantProductDescriptionType.getText();
		    String productDescriptionValue = syedsfactory.relevantProductDescriptionValue.getText();

		    System.out.println("--------------------------------------------------");
		    System.out.println("DESIRED PRODUCT DETAILS:");
		    System.out.println("--------------------------------------------------");
		    System.out.println("Product Title: " + productTitle);
		    System.out.println("Product Price: " + productPrice);
		    System.out.println(productDescriptionType + " "  + productDescriptionValue);
		}

}
