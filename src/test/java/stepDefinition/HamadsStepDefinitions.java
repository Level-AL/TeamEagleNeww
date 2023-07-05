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

public class HamadsStepDefinitions extends cM {
	@Given("the user is on the login page")
	public void the_user_is_on_the_logi_page() {
		String loginPage = "https://www.petco.com/shop/LogonForm";
		driverClass.getDriver().navigate().to(loginPage);
		String pageTitle = driverClass.getDriver().getTitle();
		System.out.println(pageTitle);
		Assert.assertEquals("Sign in", pageTitle);
	}

	@When("I log in with valid username and password")
	public void loginWithValidCredentials() {
		// Implement login steps using valid username and password
		hamadsfactory.userName.sendKeys("Durranihammad1@gmail.com");

		hamadsfactory.password.sendKeys("Durrani$123");

		wait(3);
//			    click(loginButton);
		hamadsfactory.loginButton.click();
		wait(5);
	}

	@And("I select a product from the website")
	public void selectProductFromWebsite() {
		// Implement steps to select a product

		hamadsfactory.searchBar.sendKeys("dogs food");
		wait(5);

		hamadsfactory.searchButton.click();

		wait(3);
//			click on the first product after searching
		hamadsfactory.firstProduct.click();

		wait(3);

		scrollPage();
		wait(3);
		// clicking on "add to the cart"
		hamadsfactory.addingProduct.click();
		System.out.println("Hamad");
		wait(5);

	}

	@And("I click on the \"Add to Cart\" button")
	public void clickAddToCartButton() {
		hamadsfactory.addToCartButton.click();
		wait(3);

	}

	@Then("the item should be added to the cart successfully")
	public void verifyItemAddedToCartSuccessfully() {
//		    verfying that item is added to the cart 
		String expectedText = "(1 item)";
		String actualText = hamadsfactory.actualTextCart.getText();
		wait(3);
		Assert.assertEquals(expectedText, actualText);
		System.out.println(actualText);
		wait(3);
	}

	@And("I go to the Checkout page")
	public void goToCheckoutPage() {
		wait(5);
		hamadsfactory.checkoutButton.click();
		wait(3);
//		hamadsfactory.SaveandContinue.click();
//
//		wait(3);
////	        clicking on the add to credit card
//		hamadsfactory.addToCard.click();
//		wait(3);
		
		if (hamadsfactory.SaveandContinue.isDisplayed()) {
		    hamadsfactory.SaveandContinue.click();
		    wait(3);
		    hamadsfactory.SaveandContinue.click();

		    wait(3);
		    System.out.println("11111111");
		    hamadsfactory.addToCard.click();
		    wait(3);
		} else {
		    hamadsfactory.addToCard.click();
		    wait(3);
		}

	}

	@And("I fill up the card details with valid information")
	public void fillCardDetails() {
		// Implement steps to fill up card details with valid information
		hamadsfactory.cardNumberField.sendKeys("1234567890123456");
		wait(3);
		hamadsfactory.cardNameField.sendKeys("John Doe");

//	        WebElement expirationField = driver.findElement(By.id("expiration-date"));
//	        expirationField.sendKeys("12/24");
//
//	        WebElement cvvField = driver.findElement(By.id("cvv"));
//	        cvvField.sendKeys("123");
	}

	@And("I complete the checkout process")
	public void completeCheckoutProcess() {
		// Implement steps to complete the checkout process
		hamadsfactory.placeOrderButton.click();
		wait(3);
	}

//	    Scenario 2 starts here

	@Then("the user should be logged in successfully")
	public void the_user_should_be_logged_in_successfully() {
		String accountTitle = driverClass.getDriver().getTitle();
		wait(3);
		String expectedTitle = "Petco: Pet Supplies, Pet Food, & Pet Products";
		Assert.assertEquals(expectedTitle, accountTitle);
	}

//		Scenario three (3)   starts here

	@And("I remove all items from the cart")
	public void removeAllItemsFromCart() {
		// Implement steps to remove all items from the car
		hamadsfactory.removeAllItemsButton.click();
		wait(3);
		System.out.println("Durrani");
	}

	@Then("I should see an empty cart")
	public void verifyEmptyCart() {
		// Implement steps to verify the cart is empty
//		WebElement emptyCart = hamadsfactory.emptyCart;
//		wait(3);
////		        emptyCart.getText();
//		String emptyCartMessage = emptyCart.getText();
//
//		Assert.assertEquals("Your Cart Is Empty", emptyCartMessage);

//		String emptyCartMessage = "\n"
//				+ "Your Cart Is Empty[\n"
//				+ "]";
		WebElement emptyCart = hamadsfactory.emptyCart;
		wait(3);
		//System.out.println(emptyCart);
		Assert.assertTrue(emptyCart.isDisplayed());

		System.out.println(emptyCart.getText());
		
		
		// Close the browser
//		driverClass.getDriver().quit();
	}



}
