package stepDefinition;



import Utilities.cM;
import Utilities.driverClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AlexsStepDefinitions extends cM {
	@Given("user is on the homePage")
	public void user_is_on_the_home_page() {
	  driverClass.getDriver();
	}

	@And ("user clicks on the hamburgerMenu button")
	public void user_clicks_on_the_hamburger_menu_button() {
	    cM.waitForClickability(af.hamburgerMenu);
	    af.hamburgerMenu.click();
	}

	@And("user click new\\/trending")
	public void user_click_new_trending() {
	    cM.waitForClickability(af.newTrending);
	    af.newTrending.click();
	}

	@And("user clicks GiftCards")
	public void user_clicks_gift_cards() {
		cM.waitForClickability(af.giftCardLink);
		af.giftCardLink.click();
	}

	@And("user fills in required info")
	public void user_fills_in_required_info() {
		cM.waitForClickability(af.receptientName);
		af.receptientName.sendKeys("The Boss");	
		cM.waitForClickability(af.senderName);
		af.senderName.sendKeys("Daddy");		
	}

	@And("user clicks ContinueWithPurchase")
	public void user_clicks_continue_with_purchase() {
		cM.waitForClickability(af.continueWithPurchase);
		af.continueWithPurchase.click();

	}

//	@And("user fills in their name and your name")
//	public void user_fills_in_their_name_and_your_name() {
//		cM.explicitWait();
//		af.theirNameInput.sendKeys("goat");
//		cM.explicitWait();
//	    af.yourNameInput.sendKeys("shafkat");
//	    cM.explicitWait();
//	}

//	@And("user clicks SendADigitalCard")
//	public void user_clicks_send_a_digital_card() {
//		cM.waitForClickability(af.sendADigitalCard);
//		af.sendADigitalCard.click();
//	}

	@And("user clicks HowMuch")
	public void user_clicks_how_much() {
		cM.waitForVisibilty(af.howMuchButton);
		af.howMuchButton.click();
	}

	@And("user clicks ${int} amount")
	public void user_clicks_$_amount(Integer int1) {
		cM.waitForClickability(af.dollarAmount100);
		af.dollarAmount100.click();
	}

	@And("user clicks Add a message")
	public void user_clicks_add_a_message() {
		cM.waitForClickability(af.addAMessageButton);
		af.addAMessageButton.click();
	}

	@And("user adds personalized message")
	public void user_adds_personalized_message() {
		cM.waitForClickability(af.yourMessageInput);
		af.yourMessageInput.sendKeys("Your so cool you really deserve this"
	    		+ "petco gift card no cap");
	}

	@And("user clicks where is it going")
	public void user_clicks_where_is_it_going() {
		cM.waitForClickability(af.whereIsItGoingButton);
		af.whereIsItGoingButton.click();
	}

	@And("user fills email and confirms email")
	public void user_fills_email_and_confirms_email() {
		cM.waitForClickability(af.emailInput);
	    af.emailInput.sendKeys("teamEagle91210@gmail.com");
	    cM.waitForClickability(af.ConfirmEmailInput);
	    af.ConfirmEmailInput.sendKeys("teamEagle91210@gmail.com");
	}

	@And("user clicks add to cart")
	public void user_clicks_add_to_cart() {
		cM.waitForClickability(af.addToCartButton);
		af.addToCartButton.click();
	}

	@Then("verify that Checkout button is shown on screen")
	public void verify_that_checkout_button_is_shown_on_screen() {
		if (af.checkoutButton.isDisplayed()) {
            System.out.println("Checkout button is visible!");
        } else {
            System.out.println("Checkout button is not visible!,TEST FAILED");
        }
	}

	
	
	
	

	
	
	
	
	
	

	
	
}
