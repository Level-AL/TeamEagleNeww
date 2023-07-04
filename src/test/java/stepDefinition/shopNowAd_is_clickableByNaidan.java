package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utilities.cM;
import Utilities.driverClass;
import io.cucumber.java.en.Then;

public class shopNowAd_is_clickableByNaidan extends cM {
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
}
