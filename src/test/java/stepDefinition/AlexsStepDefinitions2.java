package stepDefinition;



import Utilities.cM;
import Utilities.driverClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class AlexsStepDefinitions2 extends cM {

	
	
	
	@Given("User is on the login page")
	public void user_is_on_the_login_page() {
		driverClass.getDriver();
		cM.waitForClickability(af.accountButton);
		af.accountButton.click();
		cM.waitForVisibilty(af.signInButton);
		af.signInButton.click();
	}

	@And("user fills in valid email and password")
	public void user_fills_in_valid_email_and_password() {
	 cM.explicitWait();
		af.loginEmailInput.sendKeys("teamEagle91210@gmail.com");
	   cM.explicitWait();
		af.loginPasswordInput.sendKeys("Teameagle123321");
	}

	@And("user clicks button sign in")
	public void user_clicks_button_sign_in() {
		cM.waitForVisibilty(af.signInButtonLogin);
		af.signInButtonLogin.click();
	}

	@Then("verify that homePage is showing")
	public void verify_that_home_page_is_showing() {
		if (af.homeButtonHomePage.isDisplayed()) {
            System.out.println("Login Completed");
        } else {
            System.out.println("Login FAILED!!");
        }
	}
}
