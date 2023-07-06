package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utilities.cM;
import Utilities.driverClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HamadStepDefinition extends cM {

	
	@Given("the user is on the login page")
	public void the_user_is_on_the_logi_page() {
	   String pageTitle = driverClass.getDriver().getTitle();
	    System.out.println(pageTitle);
	    Assert.assertEquals("Sign in", pageTitle);
	}
	
	
	
	
	  @When("I log in with valid username and password")
	    public void loginWithValidCredentials()  {
	        // Implement login steps using valid username and password
		  WebElement emailBox = driverClass.getDriver().findElement(By.xpath("//*[@id='WC_AccountDisplay_FormInput_logonId_In_Logon_1']"));
		  emailBox.sendKeys("idk59182@gmail.com");
			
			WebElement passwordBox = driverClass.getDriver().findElement(By.xpath("//*[@id='WC_AccountDisplay_FormInput_logonPassword_In_Logon_1']"));
			passwordBox.sendKeys("Durrani$123");
			
			wait(3);
//			    click(loginButton);
			 WebElement loginButton = driverClass.getDriver().findElement(By.xpath("//*[@id='WC_AccountDisplay_links_2']"));
			 	loginButton.click();
			 	wait(3);
	    }

	    @And("I select a product from the website")
	    public void selectProductFromWebsite() {
	        // Implement steps to select a product
	        WebElement searchBar = driverClass.getDriver().findElement(By.xpath("//input[@id=\"header-search\"]"));
	        		searchBar.sendKeys("cat food");
				 	wait(3);

	        WebElement searchButton =  driverClass.getDriver().findElement(By.xpath("//button[@class=\"Search__SearchButton-sc-ztrrc9-1 bQTuVQ\"]"));
	        searchButton.click();
	        
		  wait(3);
//			click on the first product after searching
	        WebElement firstProduct =  driverClass.getDriver().findElement(By.xpath("//div[@class='sc-dkzDqf gNublD rec rec-slider-container']/div/div/div[1]/div/div/div/a"));
	        firstProduct.click();
	        
			  wait(3);
	     // clicking on "add to the cart"
	        WebElement addingProduct =  driverClass.getDriver().findElement(By.xpath("//button[@class=\"add-to-cart-row-styled__AddToCartButton-sc-4a84804-0 fbJWBa\"]"));
	        addingProduct.click();		
      
		 	wait(3);

	        
	    }

	    @And("I click on the \"Add to Cart\" button")
	    public void clickAddToCartButton() {
	        WebElement addToCartButton =driverClass.getDriver().findElement(By.xpath("//a[@class=\"Shared__SecondaryNavigationButton-sc-ed57a588-1 foAVkh\"]"));

	        addToCartButton.click();
		 	wait(3);

	    }

	    @Then("the item should be added to the cart successfully")
	    public void verifyItemAddedToCartSuccessfully() {
//		    verfying that item is added to the cart 
			String expectedText = "(1 item)";
			String actualText = driverClass.getDriver().findElement(By.xpath("//div[@id='cart-heading']/span")).getText();
			
			Assert.assertEquals(expectedText, actualText);
			System.out.println(actualText);
			wait(3);
	    }

	    @And("I go to the Checkout page")
	    public void goToCheckoutPage() {
	        WebElement checkoutButton = driverClass.getDriver().findElement(By.xpath("//a[@id=\"continueReviewPage\"]"));
	        checkoutButton.click();
		 	wait(3);

//	        clicking on the add to credit card
	        WebElement addToCard = driverClass.getDriver().findElement(By.xpath("//div[@class=\"AddCreditCard-styled__ButtonContainer-sc-cb788d4e-4 bQaeXc\"]"));
	        addToCard.click();
		 	wait(3);

	    }

	   

	    @And("I fill up the card details with valid information")
	    public void fillCardDetails() {
	        // Implement steps to fill up card details with valid information
	        WebElement cardNumberField = driverClass.getDriver().findElement(By.id("AccountNumber"));
	        cardNumberField.sendKeys("1234567890123456");

	        WebElement cardNameField = driverClass.getDriver().findElement(By.id("FullName"));
	        cardNameField.sendKeys("John Doe");

//	        WebElement expirationField = driver.findElement(By.id("expiration-date"));
//	        expirationField.sendKeys("12/24");
//
//	        WebElement cvvField = driver.findElement(By.id("cvv"));
//	        cvvField.sendKeys("123");
	    }

	    @And("I complete the checkout process")
	    public void completeCheckoutProcess() {
	        // Implement steps to complete the checkout process
	        WebElement placeOrderButton = driverClass.getDriver().findElement(By.xpath("//input[@id=\"SaveButton\"]"));
	        placeOrderButton.click();
	    
	}

	
	
	    
	    
//	    Scenario 2 starts here
	    
	
	
		@When("the user enters valid credentials")
		public void the_user_enters_valid_credentials() {
			WebElement emailBox = driverClass.getDriver().findElement(By.xpath("//*[@id='WC_AccountDisplay_FormInput_logonId_In_Logon_1']"));
			sendKey("durranihammad1@gmail.com",emailBox);
			wait(3);
			
			WebElement passwordBox = driverClass.getDriver().findElement(By.xpath("//*[@id='WC_AccountDisplay_FormInput_logonPassword_In_Logon_1']"));
			sendKey("Durrani$123", passwordBox);
			wait(3);
		}

		@And("clicks on the login button")
		public void clicks_on_the_login_button() {
		    WebElement loginButton = driverClass.getDriver().findElement(By.xpath("//*[@id='WC_AccountDisplay_links_2']"));
		    click(loginButton);
			wait(3);
		}

		@Then("the user should be logged in successfully")
		public void the_user_should_be_logged_in_successfully() {
		    String accountTitle = driverClass.getDriver().getTitle();
		    String expectedTitle = "Petco: Pet Supplies, Pet Food, & Pet Products";
		    Assert.assertEquals(expectedTitle, accountTitle);
		}

		@Then("User should search iteam in the search bar")
		public void user_should_search_iteam_in_the_search_bar()  {
//			sending key to the search bar
	     driverClass.getDriver().findElement(By.xpath("//input[@id=\"header-search\"]")).sendKeys("cat food");
		
//	     click on the search
	     driverClass.getDriver().findElement(By.xpath("//button[@type=\"submit\"]")).click();
	     wait(3); 
	     
	     }

		@Then("Click on  any iteam")
		public void click_on_any_iteam() {
			
//			click on the first product after searching
	 driverClass.getDriver().findElement(By.xpath("//div[@class='sc-dkzDqf gNublD rec rec-slider-container']/div/div/div[1]/div/div/div/a")).click();
	 wait(3);

	// clicking on "add to the cart"
	 driverClass.getDriver().findElement(By.xpath("//button[@class=\"add-to-cart-row-styled__AddToCartButton-sc-4a84804-0 fbJWBa\"]")).click();		
	 wait(3);

		}

		@Then("Click on the cart")
		public void click_on_the_cart() {
//		    clicking on the cart button
			driverClass.getDriver().findElement(By.xpath("//a[@class=\"Shared__SecondaryNavigationButton-sc-ed57a588-1 foAVkh\"]")).click();
			
			wait(3);
		}

		@Then("Iteam should be available")
		public void iteam_should_be_available() {
//		    verfying that item is added to the cart 
			String expectedText = "( items)";
			String actualText = driverClass.getDriver().findElement(By.xpath("//div[@id='cart-heading']/span")).getText();
			
			Assert.assertEquals(expectedText, actualText);
			System.out.println(actualText);
			wait(3);
			
	}

		

		
		
//		Scenario three (3)   starts here
	


		    @And("I remove all items from the cart")
		    public void removeAllItemsFromCart() {
		        // Implement steps to remove all items from the cart
		        WebElement removeAllItemsButton = driverClass.getDriver().findElement(By.xpath("//a[@id=\"WC_OrderItemDetailsf_links_3_1\"]"));
		        removeAllItemsButton.click();
		    }

		    @Then("I should see an empty cart")
		    public void verifyEmptyCart() {
		        // Implement steps to verify the cart is empty
		        WebElement emptyCart = driverClass.getDriver().findElement(By.xpath("//h1[contains(text(), \"Your Cart Is Empty\")]"));
//		        emptyCart.getText();
		        
		        String emptyCartMessage = emptyCart.getText();

		        Assert.assertEquals("Your Cart Is Empty", emptyCartMessage);

		        // Close the browser
		        driverClass.getDriver().quit();
		    }
		
	
	
	
	
	
	
	
	
	
}
