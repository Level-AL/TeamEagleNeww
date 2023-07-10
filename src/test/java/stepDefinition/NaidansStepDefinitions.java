package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import Utilities.cM;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NaidansStepDefinitions extends cM {

	JavascriptExecutor js = (JavascriptExecutor) getDriver();

	@Given("Run Petco Login Steps")
	public void run_petco_login_steps() {
		//getDriver();
	}

	@Then("click on Deal tab")
	public void click_on_deal_tab() {
		jsClick(nf.dealMenu);
//		nf.dealMenu.click();
	}

	@Then("click Weekly ad")
	public void click_weekly_ad() {
		cM.explicitWait();
		jsClick(nf.weeklyAd);
	}

	@Then("user can see the weekly ad page")
	public void user_can_see_the_weekly_ad_page() {
		Assert.assertEquals(nf.weeklyAdPageHeader.getText(), "Weekly Ad");
	}

	@Then("scroll the page downwards")
	public void scroll_the_page_downwards() {
		js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
	}

	@Then("Verify that weekly ads page is scrollable")
	public void verify_that_weekly_ads_page_is_scrollable() {
		wait(2);
		Assert.assertEquals(nf.weeklyAdHeader.getText(), "Frequently Asked Questions");
	}

	@Then("click on Shop Now")
	public void click_on_shop_now() {
		jsClick(nf.shopNow);
	}

	@Then("Verify that user is able to click on Shop Now")
	public void verify_that_user_is_able_to_click_on_shop_now() {
		wait(2);
		Assert.assertEquals(nf.weeklyAdPageHeader.getText(), "Weekly Ad");
	}

	@Then("click on Top Deals")
	public void click_on_top_deals() {
		wait(2);
		jsClick(nf.topDeals);
	}

	@Then("click on Sort By tab")
	public void click_on_sort_by_tab() {
		wait(2);
		jsClick(nf.sortBy);
	}

	@Then("click on Name A to Z option")
	public void click_on_name_a_to_z_option() {
		wait(2);
		cM.selectDropDownIndex(nf.sortBy, 3);
	}

	@Then("Verify sorting from A to Z")
	public void verify_sorting_from_a_to_z() {
		wait(2);
		Assert.assertEquals(nf.nameAtoZ.getText(), "Name A-Z");
	}

}
