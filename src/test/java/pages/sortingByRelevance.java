package pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.driverClass;

public class sortingByRelevance {

	public sortingByRelevance() {
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
	@FindBy (xpath = "//*[@class='dropdown-style']/select")
	public WebElement relevanceFilter;
}
