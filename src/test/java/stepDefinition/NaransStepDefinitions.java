package stepDefinition;

import Utilities.cM;
import org.junit.Assert;
import org.openqa.selenium.By;

import Utilities.driverClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;


public class NaransStepDefinitions extends cM {
	

		@Given("you are on the petco.com website")
		public void you_are_on_the_petco_com_website() {
			driverClass.getDriver();
		}

		@Given("I Click on navigation menu bar on the page")
		public void i_click_on_navigation_menu_bar_on_the_page() {
			naransfactory.navigationMenu.click();
		}

		@Then("I Click on the cat option in the navigation menu.")
		public void i_click_on_the_cat_option_in_the_navigation_menu() {
		    naransfactory.CatOption.click();
		}
		
		//------------------------Test2----------------

		@Then("I Verify that the correct page loads")
		public void i_verify_that_the_correct_page_loads() {
			Assert.assertEquals("CAT",
					naransfactory.CorrectPage.getText());
		}

		@Then("Select a specific cat product and click on it")
		public void select_a_specific_cat_product_and_click_on_it() {
					naransfactory.SpecificCatProduct.click();
		}
		
		//------------------------Test3----------------

		@Then("Verify that the product details page loads successfully")
		public void verify_that_the_product_details_page_loads_successfully() {
			Assert.assertEquals("https://www.petco.com/shop/en/petcostore/category/cat/cat-treats/cat-crunchy-treats",
					naransfactory.ProductDetailsPage.getText());
		}

		@Then("Select Clothes & Accessories  under Supplies Category and click it")
		public void select_clothes_accessories_under_supplies_category_and_click_it() {
			naransfactory.ClothesAccessoriesUnderSuppliesCategory.click();
		}

		@Then("Select Color filter and click it")
		public void select_color_filter_and_click_it() {
		        naransfactory.ColorFilter.click();
		
		}
		@Then("Click_on_the_color_Black")
		public void Click_on_the_color_Black() {
			naransfactory.BlackColor.click();
			
		}
}
