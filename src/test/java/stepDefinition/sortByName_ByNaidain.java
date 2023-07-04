package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import Utilities.cM;
import Utilities.driverClass;
import io.cucumber.java.en.Then;

public class sortByName_ByNaidain extends cM {
	
	@Then("click on Top Deals")
	public void click_on_top_deals() {
		WebElement weeklyAd = driverClass.getDriver().findElement(By.xpath("//*[@id=\"petco-header-render-node\"]/header/div[3]//div[2]/ul/li[3]//div/ul/li[2]/a"));
		wait(2);
		jsClick(weeklyAd);
	}
	@Then("click on Sort By tab")
	public void click_on_sort_by_tab() {
		wait(2);
		WebElement sortBy = driverClass.getDriver().findElement(By.xpath("//*[@class='sort-by__FloatSelectBox-sc-d53b5e0-2 jUPIHI']"));
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
