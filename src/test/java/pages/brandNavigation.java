package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.driverClass;

public class brandNavigation {

	public brandNavigation() {
		PageFactory.initElements(driverClass.getDriver(), this);
	}
	
	@FindBy (xpath = "//*[@id='petco-header-render-node']/header/div[2]/div/nav/div[2]/button")
	public WebElement shopMenu;
	@FindBy (xpath = "//*[@class='slide-out-wrapper-styled___SlideOutWrapper-sc-c0b7f430-0 jmUblu']/div/ul/li[13]/button")
	public WebElement shopByBrand;
	@FindBy (xpath = "//*[@class='flyout-styled__FlyoutInnerContainer-sc-317a9e89-3 fzClhA']/div/a")
	public WebElement wholeHearted; 
}
