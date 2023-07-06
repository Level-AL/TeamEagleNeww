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

public class NaidansStepDefinitions extends cM {

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
		WebElement weeklyAd = driverClass.getDriver().findElement(
				By.xpath("//*[@id=\"petco-header-render-node\"]/header/div[3]//div[2]/ul/li[3]//div/ul/li[1]/a"));
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
		WebElement weeklyAdHeader = driverClass.getDriver()
				.findElement(By.xpath("//*[contains(text(),'Frequently Asked Questions')]"));
		Assert.assertEquals(weeklyAdHeader.getText(), "Frequently Asked Questions");
	}

	@Then("click on Shop Now")
	public void click_on_shop_now() {
		WebElement shopNow = driverClass.getDriver().findElement(By.xpath("//img[@alt='Weekly Ad']"));
		jsClick(shopNow);
	}

	@Then("Verify that user is able to click on Shop Now")
	public void verify_that_user_is_able_to_click_on_shop_now() {
		wait(2);
		WebElement weeklyAdHeader = driverClass.getDriver().findElement(By.xpath("//*[contains(text(),'Weekly Ad')]"));
		Assert.assertEquals(weeklyAdHeader.getText(), "Weekly Ad");
	}

	@Then("click on Top Deals")
	public void click_on_top_deals() {
		WebElement weeklyAd = driverClass.getDriver().findElement(
				By.xpath("//*[@id=\"petco-header-render-node\"]/header/div[3]//div[2]/ul/li[3]//div/ul/li[2]/a"));
		wait(2);
		jsClick(weeklyAd);
	}

	@Then("click on Sort By tab")
	public void click_on_sort_by_tab() {
		wait(2);
		WebElement sortBy = driverClass.getDriver()
				.findElement(By.xpath("//*[@class='sort-by__FloatSelectBox-sc-d53b5e0-2 jUPIHI']"));
		wait(2);
		jsClick(sortBy);
	}

	@Then("click on Name A to Z option")
	public void click_on_name_a_to_z_option() {
		wait(2);
		WebElement nameAtoZ = driverClass.getDriver().findElement(By.xpath("//*[contains(text(),'Name A-Z')]"));
		wait(2);
		jsClick(nameAtoZ);
	}

	@Then("Verify sorting from A to Z")
	public void verify_sorting_from_a_to_z() {
		wait(2);
		WebElement nameAtoZ = driverClass.getDriver().findElement(By.xpath("//*[contains(text(),'Name A-Z')]"));
		Assert.assertEquals(nameAtoZ.getText(), "Name A-Z");
	}

}
