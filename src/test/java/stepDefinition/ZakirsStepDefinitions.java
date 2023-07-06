package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.cM;
import Utilities.driverClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ZakirsFactory;

public class ZakirsStepDefinitions extends cM {

	// Test Case 01 --> Dog Category presence

	@Given("User is on the petco.com Home page")
	public void user_is_on_the_petco_com_home_page() {
		driverClass.getDriver();

	}

	@When("User locates the navigation menue and clicks on it")
	public void user_locates_the_navigation_menue_and_clicks_on_it() {
		// WebElement navigationMenue = driverClass.getDriver()
		// .findElement(By.xpath("//*[@id=\"topcontent\"]/div[2]/button"));
		zakirsfactory.navigationMenue.click();
		wait(3);
	}

	@Then("Dog Category should be displayed in the navigation menue")
	public void dog_category_should_be_displayed_in_the_navigation_menue() {
		// WebElement DogElement =
		// driverClass.getDriver().findElement(By.xpath("//span[text()='DOG']"));

		if (zakirsfactory.DogElement.isDisplayed()) {
			System.out.println("Test passed: DOG category is displayed in the navigation menu.");
		} else {
			System.out.println("Test failed: DOG category is not displayed in the navigation menu.");
		}

	}

//Test Case 02  ---> Dog page loading 
	
	  @Given("User is on petco.com home page") public void
	  user_is_on_petco_com_home_page() { driverClass.getDriver(); }
	 

	@When("User locates navigation menu and clicks on it")
	public void user_locates_navigation_menu_and_clicks_on_it() {
		WebElement navigationMenue = driverClass.getDriver()
				.findElement(By.xpath("//*[@id=\"topcontent\"]/div[2]/button"));
		navigationMenue.click();
	}

	@When("User locates DOG page button and hover over it")
	public void user_locates_dog_page_button_and_hover_over_it() throws InterruptedException {
		WebElement DogBtn = driverClass.getDriver().findElement(By.xpath("//span[text()='DOG']"));

		Actions action = new Actions(driverClass.getDriver());
		action.moveToElement(DogBtn).build().perform();
		Thread.sleep(3000);
	}

	@When("User locates DOG page Headings and clicks on it")
	public void user_locates_dog_page_headings_and_clicks_on_it() {
		WebElement DogPageHeading = driverClass.getDriver()
				.findElement(By.xpath("//*[@id=\"topcontent\"]/div[2]/div/div/ul/li[4]/div[2]/ul/section/h2/a"));
		Actions action = new Actions(driverClass.getDriver());
		action.moveToElement(DogPageHeading).click().build().perform();

	}

	@Then("user should navigate to DOG page successfully")
	public void user_should_navigate_to_dog_page_successfully() {

		String ActualpageTitle = driverClass.getDriver().getTitle();
		String expectedTitle = "Puppy & Dog Supplies: Dog Food, Beds, Kennels & More | Petco";
		System.out.println(ActualpageTitle);
		if (ActualpageTitle.contentEquals(expectedTitle)) {
			System.out.println("Test is passed");
		} else {
			System.out.println("Test is failed");
		}

	}

	// Test Case 03 --> Search menue Test
	
	  @Given("User is on the Home page") public void user_is_on_the_home_page() {
	  driverClass.getDriver();
	  }

	@When("User enters a vlid dog product keyword")
	public void user_enters_a_vlid_dog_product_keyword() {
		// driverClass.getDriver().findElement(By.xpath("//*[@id=\"header-search\"]"));

		WebElement searchBar = driverClass.getDriver().findElement(By.xpath("//*[@id=\"header-search\"]"));
		searchBar.sendKeys("Dog Food");
	}

	@When("clicks on the search button")
	public void clicks_on_the_search_button() throws InterruptedException {
		WebElement searchBtn = driverClass.getDriver().findElement(By.xpath("//button[@aria-label='Search']"));
		searchBtn.click();

	}

	@Then("user should navigate to the desired product page")
	public void user_should_navigate_to_the_desired_product_page() {

		driverClass.getDriver().getTitle();
		String actualTitle = driverClass.getDriver().getTitle();
		String expectedTitle = "Dog Food | Petco";
		Assert.assertEquals(expectedTitle, actualTitle);

	}
}
//Test Case 04 --->  Login Functionality

/*
 * @Given("the user is on the login page") public void
 * the_user_is_on_the_logi_page() { String pageTitle =
 * driverClass.getDriver().getTitle(); System.out.println(pageTitle);
 * Assert.assertEquals("Sign in", pageTitle); }
 * 
 * @When("the user enters valid credentials") public void
 * the_user_enters_valid_credentials() { WebElement emailBox =
 * driverClass.getDriver() .findElement(By.xpath(
 * "//*[@id='WC_AccountDisplay_FormInput_logonId_In_Logon_1']"));
 * sendKey("teamEagle91210@gmail.com", emailBox); wait(3);
 * 
 * WebElement passwordBox = driverClass.getDriver() .findElement(By.xpath(
 * "//*[@id='WC_AccountDisplay_FormInput_logonPassword_In_Logon_1']"));
 * sendKey("Teameagle123321", passwordBox); wait(3); }
 * 
 * @When("clicks on the login button") public void clicks_on_the_login_button()
 * { WebElement loginButton = driverClass.getDriver().findElement(By.xpath(
 * "//*[@id='WC_AccountDisplay_links_2']")); click(loginButton); wait(3); }
 * 
 * @Then("the user should be logged in successfully") public void
 * the_user_should_be_logged_in_successfully() { String accountTitle =
 * driverClass.getDriver().getTitle(); String expectedTitle =
 * "Petco: Pet Supplies, Pet Food, & Pet Products";
 * Assert.assertEquals(expectedTitle, accountTitle); } }
 */
