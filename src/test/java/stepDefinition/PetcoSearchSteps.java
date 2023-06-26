package stepDefinition;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Assert;

import Utilities.driverClass;


public class PetcoSearchSteps {
	

	    @Given("I am on the Petco website")
	    public void navigateToPetcoWebsite() {
	    	driverClass.getDriver().get("https://www.petco.com");
	    }

	    @When("I search for {string}")
	    public void searchFor(String smallpet) {
	        WebElement searchInput = driverClass.getDriver().findElement(By.id("header-search"));
	        searchInput.sendKeys(smallpet);
	        WebElement searchButton = driverClass.getDriver().findElement(By.xpath("//button[@aria-label='Search']"));
	        searchButton.click();
	    }

	    @Then("I should see search results related to {string}")
	    public void verifySearchResults(String smallpet) {
	        String pageTitle = driverClass.getDriver().getTitle();
	        Assert.assertTrue("Search results page is displayed", pageTitle.contains(smallpet));
//	        driverClass.getDriver().quit();
	    }
	}

	



