package stepDefinition;

import Utilities.cM;
import org.junit.Assert;
import Utilities.driverClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NurbiyesStepDefinitions extends cM {
	//First test case: reptileCategoryNavigation
	@Given("the user is on the home page")
	public void the_user_is_on_the_home_page() {
		 String pageTitle = driverClass.getDriver().getTitle();
		 System.out.println(pageTitle);
		 Assert.assertEquals("Petco: Pet Supplies, Pet Food, & Pet Products", pageTitle);
	 
	}

	@When("clicks on the menu")
	public void clicks_on_the_menu() {
		wait(10);
		nf.menu.click();
	}
	

	@When("hover over reptile tob and click on the Reptile")
	public void hover_over_reptile_tob_and_click_on_the_reptile() {
		wait(5);
		nf.reptilebar.click();
		nf.reptiletab.click();
	   
	}

	@When("verify that the page URL changes to the Reptile category page")
	public void verify_that_the_page_url_changes_to_the_reptile_category_page() {
		String expectedUrl ="https://www.petco.com/shop/en/petcostore/category/reptile";
		String currentUrl = driverClass.getDriver().getCurrentUrl();
		Assert.assertEquals(expectedUrl, currentUrl);
	   
	}

	@When("confirm that the Reptile category page displays relevant reptile products and information")
	public void confirm_that_the_reptile_category_page_displays_relevant_reptile_products_and_information() {
		nf.reptileProductInfo.isDisplayed();
	 
	}
		
	
	//Second test case: reptileProductDetailsVerificationSteps
	@When("the user is on the reptile page")
	public void the_user_is_on_the_reptile_page() {
		wait(10);
		String pageTitle = driverClass.getDriver().getTitle();
		Assert.assertEquals("Reptile Store & Supplies: Accessories & Products | Petco", pageTitle);
	}

	@When("Click on Frogshop on page")
	public void click_on_frogshop_on_page() {
		wait(5);
		nf.menu2.click();
		nf.reptilebar2.click();
		nf.frogtab.click();
		
	}
	
	@When("user is on the frogshop page")
	public void user_is_on_the_frogshop_page() {
		wait(10);
		String pageTitle = driverClass.getDriver().getTitle();
		Assert.assertEquals("Frog Shop: Pet Frog Supplies | Petco", pageTitle);
		
	   
	}

	@When("click on Zilla Bertical Tropical Kit product")
	public void click_on_zilla_bertical_tropical_kit_product() {
		//cM.waitForClickability(nf.product);
		nf.product.click();
		wait(30);
	
	}

	@When("verify the dimensions of the product")
	public void verify_the_dimensions_of_the_product() {
		    nf.productDimension.isDisplayed();
		    wait(5);
		    System.out.println("The dimensions are 13.88 IN L X 13.5 IN W X 20 IN H");
	
		}
		

	//Third test case: reptileProductProcessOfCheckout
	@When("the user is on the product page")
	public void the_user_is_on_the_product_page() {
		String pageTitle = driverClass.getDriver().getTitle();
		Assert.assertEquals("Zilla Vertical Tropical Kit, 12x12x18 | Petco", pageTitle);
		wait(3);
	    
		} 
	
		@When("click on Add To Cart")
		public void click_on_add_to_cart() {
		cM.waitForClickability(nf.addToCart);	
		nf.addToCart.click();
		wait(10);
	   
		}

		@When("navigate to cart page")
		public void navigate_to_cart_page() {
			String pageTitle = driverClass.getDriver().getTitle();
			Assert.assertEquals("Shopping Cart", pageTitle);
			wait(3);
		   
		}

		@When("click on Proceed To Checkout button")
		public void click_on_proceed_to_checkout_button() {
		    nf.checkout.click();
		    wait(10);
		    
		    nf.email.sendKeys("nurbiye725@gmail.com");
		    wait(3);
		    nf.password.sendKeys("Nurbiye725");
		    wait(3);  
		    nf.submit.click();   
		    wait(10);
  
		}

		@Then("verify that add credit card button is visible")
		public void verify_that_add_credit_card_button_is_visible() {
			nf.saveAndContinue.click();
			wait(3); 
			nf.creditCard.isDisplayed();
			wait(3); 
		}
}
