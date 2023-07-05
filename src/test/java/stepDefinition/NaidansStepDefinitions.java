package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import Utilities.cM;
import Utilities.driverClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NaidansStepDefinitions extends cM{
	JavascriptExecutor js = (JavascriptExecutor) driverClass.getDriver();
	@Given("Run Petco Login Steps")
	public void run_petco_login_steps() {
	System.out.println("testing");
	}

	@When("click on Deal tab")
	public void click_on_deal_tab() {
		WebElement dealMenu = driverClass.getDriver().findElement(By.xpath("//span[contains(text(),'Deals')]"));
		jsClick(dealMenu);
		
		
	}

	@Then("click Weekly ad")
	public void click_weekly_ad() {
		WebElement weeklyAd = driverClass.getDriver().findElement(By.xpath("//*[@id=\"petco-header-render-node\"]/header/div[3]//div[2]/ul/li[3]//div/ul/li[1]/a"));
		wait(2);
		jsClick(weeklyAd);
	}

	@Then("user can see the weekly ad page")
	public void user_can_see_the_weekly_ad_page() {
		WebElement weeklyAdHeader = driverClass.getDriver().findElement(By.xpath("//*[contains(text(),'Weekly Ad')]"));
		Assert.assertEquals(weeklyAdHeader.getText(), "Weekly Ad");
	}

	@Then("scroll the page downwards")
	public void scroll_the_page_downwards() {
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}

	@Then("Verify that weekly ads page is scrollable")
	public void verify_that_weekly_ads_page_is_scrollable() {
		wait(2);
		WebElement weeklyAdHeader = driverClass.getDriver().findElement(By.xpath("//*[contains(text(),'Frequently Asked Questions')]"));
		Assert.assertEquals(weeklyAdHeader.getText(), "Frequently Asked Questions");
	}


}
