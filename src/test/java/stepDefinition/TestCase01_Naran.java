//Step Definition 6/28
package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;

import Utilities.driverClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class TestCase01_Naran {

	@Given("you are on the petco.com website")
	public void you_are_on_the_petco_com_website() {
		driverClass.getDriver();
	}

	@Given("I Click on navigation menu bar on the page")
	public void i_click_on_navigation_menu_bar_on_the_page() {
		driverClass.getDriver().findElement(By.xpath("//button[@aria-label='Menu']")).click();
	}

	@Then("I Click on the cat option in the navigation menu.")
	public void i_click_on_the_cat_option_in_the_navigation_menu() {
		driverClass.getDriver().findElement(By.xpath("//button[@aria-label='Shop CAT']")).click();
	}

	@Then("I Verify that the correct page loads")
	public void i_verify_that_the_correct_page_loads() {
		Assert.assertEquals("CAT",
				driverClass.getDriver().findElement(By.xpath("//li[@role='listitem']//section/h2/a")).getText());
	}

	@Then("Select a specific cat product and click on it")
	public void select_a_specific_cat_product_and_click_on_it() {
		driverClass.getDriver()
				.findElement(By.xpath("//a[@href='/shop/en/petcostore/category/cat/cat-treats/cat-crunchy-treats']"))
				.click();
	}

	@Then("Verify that the product details page loads successfully")
	public void verify_that_the_product_details_page_loads_successfully() {
		Assert.assertEquals("https://www.petco.com/shop/en/petcostore/category/cat/cat-treats/cat-crunchy-treats",
				driverClass.getDriver().getCurrentUrl());
	}

	@Then("Select Clothes & Accessories  under Supplies Category and click it")
	public void select_clothes_accessories_under_supplies_category_and_click_it() {
		driverClass.getDriver().findElement(By.xpath("//a[@href='/shop/en/petcostore/category/cat/cat-apparel']")).click();
	}

	@Then("Select Color filter and click it")
	public void select_color_filter_and_click_it() {
	        driverClass.getDriver().findElement(By.xpath("//button[@='aria-controls=\"color-panel\']")).click();
	
	}
	@Then("Click_on_the_color_Black")
	public void Click_on_the_color_Black() {
		driverClass.getDriver().findElement(By.xpath("//tag[@class='subcategory-styled__SubcategoryLayoutAside-sc-c765fdcf-2 iSBqWt']")).click();
		
	}
}
