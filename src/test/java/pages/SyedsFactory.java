package pages;

import org.openqa.selenium.WebElement; 
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.driverClass;

public class SyedsFactory {
 public SyedsFactory() {
	 PageFactory.initElements(driverClass.getDriver(), this);
 }
 
 	@FindBy (xpath = "//*[@id='petco-header-render-node']/header/div[2]/div/nav/div[2]/button")
	public WebElement shopMenu;
	@FindBy (xpath = "//*[@class='slide-out-wrapper-styled___SlideOutWrapper-sc-c0b7f430-0 jmUblu']/div/ul/li[13]/button")
	public WebElement shopByBrand;
	@FindBy (xpath = "//*[@class='flyout-styled__FlyoutInnerContainer-sc-317a9e89-3 fzClhA']/div/a")
	public WebElement wholeHearted;
	@FindBy (xpath = "//*[@id='collapseOne']/ul/li[5]/a")
	public WebElement dogFilter;
	@FindBy (xpath = "//*[@id='sameDayDeliveryTabInPlp']/div/div/div/a")
	public WebElement sameDayDelivery;
	@FindBy (xpath = "//*[@id='section_0_3_3074457345618259659_4099276460824412706']/div/p/a")
	public WebElement priceMenu;
	@FindBy (xpath = "//*[@id='section_list_0_3_3074457345618259659_4099276460824412706']/div/div[2]/div/a")
	public WebElement priceFilter;
	@FindBy (xpath = "//*[@id='product-listing-sort-by_4_3074457345618259661_4099276460824412711']")
	public WebElement relevanceFilter;
	@FindBy (xpath = "//*[@id='product_tile_val_1928003']")
	public WebElement productName;
	@FindBy (xpath = "//*[@id='offerPrice_1928003']")
	public WebElement productPrice;
	@FindBy (xpath = "//*[@class='plp-same-day-delivery italic']/span")
	public WebElement productDelivery;
	@FindBy (xpath = "//*[@id='searchBasedNavigation_widget_4_3074457345618259661_4099276460824412711']")
	public WebElement allProducts;
	@FindBy (xpath = "//*[@id='product_tile_val_1928003']")
	public WebElement firstRelevantProduct;
	@FindBy (xpath = "//*[@class='price-stack-styled__PriceForm-sc-a0629737-0 khXXph']/div/div/h1")
	public WebElement relevantProductTitle;
	@FindBy (xpath = "//*[@class='price-row-styled__PriceRowContainer-sc-cd8e8c27-1 zyTvb']") 
	public WebElement relevantProductPrice;
	@FindBy (xpath = "//*[@class='swatch-styled__StyledLabel-sc-72ade3b1-3 ctSRKH']")
	public WebElement relevantProductDescriptionType;
	@FindBy (xpath = "//*[@class='swatch-styled__StyledValue-sc-72ade3b1-4 kGmuYd']")
	public WebElement relevantProductDescriptionValue;
}
