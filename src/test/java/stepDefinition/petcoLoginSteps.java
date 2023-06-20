package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utilities.cM; 
import Utilities.driverClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class petcoLoginSteps extends cM{
	@Given("the user is on the login page")
	public void the_user_is_on_the_logi_page() {
	   String pageTitle = driverClass.getDriver().getTitle();
	    System.out.println(pageTitle);
	    Assert.assertEquals("Sign in", pageTitle);
	}

	@When("the user enters valid credentials")
	public void the_user_enters_valid_credentials() {
		WebElement emailBox = driverClass.getDriver().findElement(By.xpath("//*[@id='WC_AccountDisplay_FormInput_logonId_In_Logon_1']"));
		sendKey("teamEagle91210@gmail.com",emailBox);
		wait(3);
		
		WebElement passwordBox = driverClass.getDriver().findElement(By.xpath("//*[@id='WC_AccountDisplay_FormInput_logonPassword_In_Logon_1']"));
		sendKey("Teameagle123321", passwordBox);
		wait(3);
	}

	@When("clicks on the login button")
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
}
