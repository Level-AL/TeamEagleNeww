package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utilities.cM; 
import Utilities.driverClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class teslaLoginSteps extends cM{
	@Given("the user is on the logi page")
	public void the_user_is_on_the_logi_page() {
	   String pageTitle = driverClass.getDriver().getTitle();
	    System.out.println(pageTitle);
	    Assert.assertEquals("Tesla SSO - Sign In", pageTitle);
	}

	@When("the user enters valid credentials")
	public void the_user_enters_valid_credentials() {
		WebElement emailBox = driverClass.getDriver().findElement(By.xpath("//*[@id='form-input-identity']"));
		sendKey("teamEagle91210@gmail.com",emailBox);
		WebElement nextButton = driverClass.getDriver().findElement(By.xpath("//*[@id='form-submit-continue']"));
		click(nextButton);
		WebElement passwordBox = driverClass.getDriver().findElement(By.xpath("//*[@id='form-input-credential']"));
		sendKey("Teameagle123321", passwordBox);
	}

	@When("clicks on the login button")
	public void clicks_on_the_login_button() {
	    WebElement loginButton = driverClass.getDriver().findElement(By.xpath("//*[@id='form-submit-continue']"));
	    click(loginButton);
	}

	@Then("the user should be logged in successfully")
	public void the_user_should_be_logged_in_successfully() {
	    String accountTitle = driverClass.getDriver().getTitle();
	    String expectedTitle = "Tesla Account | Tesla";
	    Assert.assertEquals(expectedTitle, accountTitle);
	}
}
