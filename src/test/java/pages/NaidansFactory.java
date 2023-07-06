package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.driverClass;

public class NaidansFactory {
	public NaidansFactory() {
		 PageFactory.initElements(driverClass.getDriver(), this);
	 }
	
	@FindBy(xpath = "//span[contains(text(),'Deals')]")
	public WebElement dealMenu;
	
	@FindBy(xpath = "//*[@id=\\\"petco-header-render-node\\\"]/header/div[3]//div[2]/ul/li[3]//div/ul/li[1]/a")
	public WebElement weeklyAd;
	
	@FindBy(xpath = "//*[contains(text(),'Weekly Ad')]")
	public WebElement weeklyAdPageHeader;
	
	@FindBy(xpath = "//*[contains(text(),'Frequently Asked Questions')]")
	public WebElement weeklyAdHeader;
	
	@FindBy(xpath = "//img[@alt='Weekly Ad']")
	public WebElement shopNow;
	
	@FindBy(xpath = "//*[@class='sort-by__FloatSelectBox-sc-d53b5e0-2 jUPIHI']")
	public WebElement sortBy;
	
	@FindBy(xpath = "//*[contains(text(),'Name A-Z')]")
	public WebElement nameAtoZ;
	
	
	
}
