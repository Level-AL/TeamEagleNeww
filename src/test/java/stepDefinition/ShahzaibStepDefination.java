package stepDefinition;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import Utilities.Cms;
import Utilities.cM;
import Utilities.driverClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ShahzaibStepDefination extends cM{

	@Given("User logged in and can see the homepage")
	public void user_can_see_the_homepage() {
		
	//Login	
		driverClass.getDriver();
		WebElement emailBox = driverClass.getDriver().findElement(By.xpath("//*[@id='WC_AccountDisplay_FormInput_logonId_In_Logon_1']"));
		sendKey("teamEagle91210@gmail.com",emailBox);
		wait(3);
		WebElement passwordBox = driverClass.getDriver().findElement(By.xpath("//*[@id='WC_AccountDisplay_FormInput_logonPassword_In_Logon_1']"));
		sendKey("Teameagle123321", passwordBox);
		wait(3);
		WebElement loginButton = driverClass.getDriver().findElement(By.xpath("//*[@id='WC_AccountDisplay_links_2']"));
		click(loginButton);
		wait(3);
		
		
	//Homepage verification	
    String actual=	 driverClass.getDriver().findElement(By.xpath("//*[text()='Team']")).getText();
	String expected ="Team";

	Assert.assertEquals(actual, expected);
	
	}
	//---------------------
	@When("User navigate to the bird category")
	public void user_navigate_to_the_bird_category() {
		cM.click(driverClass.getDriver().findElement(By.xpath("//*[@aria-label='Menu']")));
	    cM.wait(2);
		cM.clickSpecificElementInListByText(driverClass.getDriver().findElements(By.xpath("//div/ul/li[@role='listitem']")),"BIRD");
	    cM.click(driverClass.getDriver().findElement(By.xpath("//div/ul/li/a[text()='Cages & Cage Covers']")));
	    cM.wait(2);
	}
	@When("User add a bird product to the cart")
	public void user_add_a_bird_product_to_the_cart() {
		click(driverClass.getDriver().findElement(By.xpath("//*[@data-cnstrc-item-id='5010613']")));
	    cM.wait(2);
	    Cms.scrollPage();
		cM.click(driverClass.getDriver().findElement(By.xpath("//*[@data-testid='add-to-cart-button']")));

	}
	
	@When("Verify User on the Checkout page")
	public void verify_user_on_the_checkout_page() {
		System.out.println("1");
	}
	@Then("User Fillup the required Detail for Checkout")
	public void user_fillup_the_required_detail_for_checkout() {
		System.out.println("1");
	}


//-----------------------------------2----------------------------------//
	
	@When("Go to the Bird Category and Click on Cages & Cage covers")
	public void go_to_the_bird_category_and_click_on_cages_cage_covers() {

		cM.click(driverClass.getDriver().findElement(By.xpath("//*[@aria-label='Menu']")));
	    cM.wait(2);
		cM.clickSpecificElementInListByText(driverClass.getDriver().findElements(By.xpath("//div/ul/li[@role='listitem']")),"BIRD");
	    cM.click(driverClass.getDriver().findElement(By.xpath("//div/ul/li/a[text()='Cages & Cage Covers']")));
	    cM.wait(2);
	}

	
	@When("Sort by price ,color and other criteria")
	public void sort_by_price_color_and_other_criteria() {
		// Select  Brand
     cM.click(driverClass.getDriver().findElement(By.xpath("//*[@id='brand-header']")));
     cM.wait(2);                  
     cM.clickSpecificElementInListByText(driverClass.getDriver().findElements(By.xpath("//div[contains(@class, 'BrandsFacet-styled__StyledFilterItem')]")), "A&E Cage Company (123)");
     cM.wait(2);
     cM.click(driverClass.getDriver().findElement(By.id("brand-header")));// close the Brand section
     cM.wait(2);
     
     // --> Sort Price    
     Cms.scrollPage();
     cM.wait(3);
     cM.clickSpecificElementInListByText(driverClass.getDriver().findElements(By.xpath("//div[contains(@class,'ExpandableFilter-styled__C')]")), "Price");
     cM.wait(1);
     cM.clickSpecificElementInListByText(driverClass.getDriver().findElements(By.xpath("//*[contains(@class,'DefaultFacet-styled__FilterI')]")), "$100 to $200 (11)");
	
     
	}
	

	@Then("User Can See the Result of the Items")
	public void user_can_see_the_result_of_the_items() {
		
    String actualResult = driverClass.getDriver().findElement(By.xpath("//*[@data-testid='active-filters-button___clear']")).getText();
	String expected = "Clear All Filters";
	Assert.assertEquals(expected, actualResult);
	}

	
	@When("Select the item,Change Quantity,Size")
	public void select_the_item_change_quantity_size() {
	//click on item	
		cM.wait(3);
	cM.click(driverClass.getDriver().findElement(By.xpath("//*[@data-track-product-id='5001130']")));
	
	cM.wait(2);
	Cms.scrollPage();
 //   Change the Quantity
	cM.click(driverClass.getDriver().findElement(By.xpath("//*[@id='pdp-quantity-select']")));
    cM.click(driverClass.getDriver().findElement(By.xpath("//option[@value='7']")));
	
	}

	
	@When("Add to the shopping Cart")
	public void add_to_the_shopping_cart() {
	 wait(2);
     cM.click(driverClass.getDriver().findElement(By.xpath("//*[@data-testid='add-to-cart-button']")));
	}

	@Then("View the Cart and checkout page")
	public void view_the_cart_and_checkout_page() {
    //  Verify user on the Cart page by clicking Checkout. 
		System.out.println("1");
		
	//cM.click(driverClass.getDriver().findElement(By.xpath("//*[@class='petco-checkout']")));
	System.out.println("2");
		
		
	}
	
//------------------------------------Scenario 3 ------------------------------------//
	
	@When("the user enter in the search bar")
	public void the_user_enter_in_the_search_bar() {
		cM.sendKey(driverClass.getDriver().findElement(By.xpath("//*[@id='header-search']")),"bird cage"); 
		
	}
	
	@When("click on the search button")
	public void click_on_the_search_button() {
		click(driverClass.getDriver().findElement(By.xpath("//button[@data-track-location='search']")));
	    wait(2);
	}
	
	
	@Then("the user should see search results")
	public void the_user_should_see_search_results() {
		WebElement element= driverClass.getDriver().findElement(By.xpath("//*[@id='__next']"));
		Assert.assertTrue(element.isDisplayed());
	}
	
	
	@Then("user sort the items")
	public void user_sort_the_items() {
		//sort 
		click(driverClass.getDriver().findElement(By.xpath("//div/select")));
		List<WebElement>list=driverClass.getDriver().findElements(By.xpath("//select/option"));
		clickSpecificElementInListByText(list, "Top Rated");
	}
	
	
	@When("User finalize & click on item")
	public void user_finalize_click_on_item() {
		Cms.scrollPage();
		wait(2);
		WebElement item=driverClass.getDriver().findElement(By.xpath("//*[@data-cnstrc-item-id='5163181']"));
		click(item);
	}
	
	
	@Then("user can see the detail-description")
	public void user_can_see_the_detail_description() {
		wait(2);
		Cms.scrollPage();
		WebElement detail=driverClass.getDriver().findElement(By.xpath("//*[@data-testid='tab-content-tab-1']"));
        Assert.assertTrue(detail.isDisplayed());
	}
	
	@Then("Add item to the cart")
	public void add_item_to_the_cart() {
		wait(2);
	   cM.click(driverClass.getDriver().findElement(By.xpath("//*[@data-testid='add-to-cart-button']")));
	   wait(2);
	   WebElement cart=driverClass.getDriver().findElement(By.xpath("//section[@id='cart-left-section']"));
       Assert.assertTrue(cart.isDisplayed());
	}



	
	
	
	
	
	
	
	
	
}
