package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.driverClass;

public class TrooksFactory {
	public TrooksFactory() {
		PageFactory.initElements(driverClass.getDriver(), this);
	}

	@FindBy(id = "header-search")
	public WebElement searchBar;

	@FindBy(xpath = "//button[@aria-label='Search']")
	public WebElement searchButton;

	@FindBy(xpath = "//*[@href='/shop/en/petcostore/search?query=small%20pet%20food&filters%5Bgroup_id%5D=same-day-delivery-products']")
	public WebElement sameDayButtonUnderCategoryTab;

	@FindBy(xpath = "//button[@data-testid='hamburger-menu']")
	public WebElement triplebarbutton;

	@FindBy(xpath = "//button[@aria-label='Shop SMALL PET']")
	public WebElement shopSmallPetButtonInsideTripleBar;

	@FindBy(xpath = "//li[@role='listitem'][7]//section[@class='flyout-styled__FlyoutContent-sc-317a9e89-1 itkdkh']/h2")
	public WebElement smallPetSubPageTitle;

}
