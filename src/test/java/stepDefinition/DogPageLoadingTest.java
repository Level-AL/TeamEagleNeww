package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Utilities.cM;
import Utilities.driverClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DogPageLoadingTest extends cM {

	@Given("User is on petco.com home page")
	public void user_is_on_petco_com_home_page() {
		driverClass.getDriver();
	}

	@When("User locates navigation menue and clicks on it")
	public void user_locates_navigation_menue_and_clicks_on_it() {
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
	    WebElement DogPageHeading =driverClass.getDriver().
	    		findElement(By.xpath("//*[@id=\"topcontent\"]/div[2]/div/div/ul/li[4]/div[2]/ul/section/h2/a"));
	    Actions action = new Actions(driverClass.getDriver());
		action.moveToElement(DogPageHeading).click().build().perform();
	
	}
	@Then("user should navigate to DOG page successfully")
	public void user_should_navigate_to_dog_page_successfully() {
		
		String ActualpageTitle = driverClass.getDriver().getTitle();
		String expectedTitle="Puppy & Dog Supplies: Dog Food, Beds, Kennels & More | Petco";
		System.out.println(ActualpageTitle);
		if(ActualpageTitle.contentEquals(expectedTitle)) 
		{
			System.out.println("Test is passed");
		}else {
			System.out.println("Test is failed");
		}
			
	}
}
