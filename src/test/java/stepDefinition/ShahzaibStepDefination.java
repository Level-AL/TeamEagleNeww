package stepDefinition;

import java.util.List;


import org.junit.Assert;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Wait;

import Utilities.Cms;
import Utilities.ConfigurationReader;
import Utilities.cM;
import Utilities.driverClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShahzaibStepDefination extends cM{
	//-----------------------------------1----------------------------------//

	@Given("User logged in and can see the homepage")
	public void user_can_see_the_homepage() {
		
	//Login	
		driverClass.getDriver();
		WebElement emailBox = shahzaibsfactory.emailBox;
		sendKey(ConfigurationReader.getProperty("petcoEmail"),emailBox);
		wait(3);
		WebElement passwordBox = shahzaibsfactory.passwordBox;
		sendKey(ConfigurationReader.getProperty("petcoPassword"), passwordBox);
		wait(3);
		shahzaibsfactory.signInButton.click();
		wait(3);
		
		
	//Homepage verification	
    String actual=shahzaibsfactory.homePages.getText();
	String expected ="Team";
	Assert.assertEquals(actual, expected);
	}
	
	//---------------------
	@When("User navigate to the bird category")
	public void user_navigate_to_the_bird_category() {
		shahzaibsfactory.menuButton.click();
		 cM.wait(2);
		cM.clickSpecificElementInListByText(shahzaibsfactory.listForBirds,"BIRD");
	    shahzaibsfactory.CagesCover.click();
	    cM.wait(2);
	}
	
	@When("User add a bird product to the cart")
	public void user_add_a_bird_product_to_the_cart() {
        shahzaibsfactory.itemToAdd.click();
	    cM.wait(2);
	    Cms.scrollPage();
		shahzaibsfactory.addToCart.click();
    }
	
	@When("User are able increase the quantity")
	public void verify_user_on_the_checkout_page() {
    shahzaibsfactory.increaseQuantity.click();
	}
	
	@Then("Verify user can save the item for later")
	public void user_fillup_the_required_detail_for_checkout() {
		shahzaibsfactory.saveLaterButton.click();
		WebElement saveForLater=shahzaibsfactory.saveLaterVerify;
		waitForClickability(saveForLater);
	    Assert.assertTrue(saveForLater.isDisplayed());
	}


//-----------------------------------2----------------------------------//
	
	@When("Go to the Bird Category and Click on Cages & Cage covers")
	public void go_to_the_bird_category_and_click_on_cages_cage_covers() {
        shahzaibsfactory.menuButton.click();
	    cM.wait(2);
		cM.clickSpecificElementInListByText(shahzaibsfactory.listForBirds,"BIRD");
		shahzaibsfactory.CagesCover.click();
	    cM.wait(2);
	}

	
	@When("Sort by price ,color and other criteria")
	public void sort_by_price_color_and_other_criteria() {
		// Select  Brand
     shahzaibsfactory.brandClicked.click();
     cM.wait(2);                  
     cM.clickSpecificElementInListByText(shahzaibsfactory.brandsList, "A&E Cage Company (123)");
     cM.wait(2);
     shahzaibsfactory.brandCloseButton.click();// close the Brand section
     cM.wait(2);
     
     // --> Sort Price    
     Cms.scrollPage();
     cM.wait(3);
     cM.clickSpecificElementInListByText(shahzaibsfactory.priceButtonList, "Price");
     cM.wait(1);
     cM.clickSpecificElementInListByText(shahzaibsfactory.listInPrice, "$100 to $200 (11)");
	
     
	}
	

	@Then("User Can See the Result of the Items")
	public void user_can_see_the_result_of_the_items() {
		
    String actualResult =shahzaibsfactory.filterResults.getText();
	String expected = "Clear All Filters";
	Assert.assertEquals(expected, actualResult);
	}

	
	@When("Select the item,Change Quantity,Size")
	public void select_the_item_change_quantity_size() {
	//click on item	
	cM.wait(3);
	shahzaibsfactory.selectItemFiltered.click();
	cM.wait(2);
	Cms.scrollPage();
 //   Change the Quantity
	shahzaibsfactory.selectQuantity.click();
	shahzaibsfactory.selectedQuantity.click();
	}

	
	@When("Add to the shopping Cart")
	public void add_to_the_shopping_cart() {
	 wait(2);
	 shahzaibsfactory.addToCart.click();
	}

	
	@Then("View the Cart and remove items")
	public void view_the_cart_and_checkout_page() {
    //  Verify user on the Cart page by clicking Checkout. 
	wait(2);
	String priceNow=shahzaibsfactory.priceNowText.getText();
	System.out.println("Price Now: "+priceNow);
	System.out.println("---------------------------------------------");
	String PriceThen=shahzaibsfactory.priceThenText.getText();
	System.out.println("Price was: "+PriceThen);
	wait(3);
	shahzaibsfactory.removeItemButton.click();
	System.out.println("---------------- Items removed-------------------------");
	
	WebElement removedItem = shahzaibsfactory.removedItemVerify;
		Assert.assertTrue(removedItem.isDisplayed());
		
	}
	
//------------------------------------Scenario 3 ------------------------------------//
	  //--------------------------------------------------------------//
	@When("the user enter in the search bar")
	public void the_user_enter_in_the_search_bar() {
		cM.sendKey(shahzaibsfactory.searchBar,"bird cage"); 
		
	}
	
	@When("click on the search button")
	public void click_on_the_search_button() {
		shahzaibsfactory.searchButtonForResults.click();
		wait(2);
	}
	
	
	@Then("the user should see search results")
	public void the_user_should_see_search_results() {
		WebElement element= shahzaibsfactory.searchResults;
		Assert.assertTrue(element.isDisplayed());
	}
	
	
	@Then("user sort the items")
	public void user_sort_the_items() {
		//sort 
		shahzaibsfactory.sortByOptions.click();
		List<WebElement>list=shahzaibsfactory.listSortBy;
		clickSpecificElementInListByText(list, "Top Rated");
	}
	
	
	@When("User finalize & click on item")
	public void user_finalize_click_on_item() {
		Cms.scrollPage();
		wait(2);
		WebElement item=shahzaibsfactory.selectitemBySort;
		click(item);
	}
	
	
	@Then("user can see the detail-description")
	public void user_can_see_the_detail_description() {
		Cms.scrollPage();
		wait(2);
		// Description section displayed
		String ActualR=shahzaibsfactory.detailDisplayed.getText();
		String expectedR="Description";
		Assert.assertEquals(expectedR,  ActualR);
		System.out.println(ActualR + " Dispalyed below...");
		wait(3);
	}
	

	
}
