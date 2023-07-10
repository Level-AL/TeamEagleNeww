package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.driverClass;

public class NaidansFactory {
	public NaidansFactory() {
		 PageFactory.initElements(driverClass.getDriver(), this);
	 }
	
	@FindBy(xpath = "//button[@aria-haspopup='true']//span[contains(text(),'Deals')]")
	public WebElement dealMenu;
	
	@FindBy(xpath = "//*[@id='petco-header-render-node']/header/div[3]//div[2]/ul/li[3]//div/ul/li[1]/a")
	public WebElement weeklyAd;
	
	@FindBy(xpath = "//div[@class='left_espot']//div[@class='container']/h1")
	public WebElement weeklyAdPageHeader;
	
	@FindBy(xpath = "//*[contains(text(),'Frequently Asked Questions')]")
	public WebElement weeklyAdHeader;
	
	@FindBy(xpath = "//img[@alt='Weekly Ad']")
	public WebElement shopNow;
	
	@FindBy(xpath = "//div[@data-testid='sort-by']/div/select")
	public WebElement sortBy;
	
	@FindBy(xpath = "//*[contains(text(),'Name A-Z')]")
	public WebElement nameAtoZ;
	
	@FindBy(xpath = "//a[@href='/shop/en/petcostore/category/top-deals']")
	public WebElement topDeals;
	
	
}
