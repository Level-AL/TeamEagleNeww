package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.driverClass;

public class HamadsFactory {
	public HamadsFactory() {
		 PageFactory.initElements(driverClass.getDriver(), this);
	 }
	
	@FindBy(xpath = "//*[@id='WC_AccountDisplay_FormInput_logonId_In_Logon_1']")
	public WebElement userName;
	@FindBy(xpath = "//*[@id='WC_AccountDisplay_FormInput_logonPassword_In_Logon_1']")
	public WebElement password;
	@FindBy(xpath = "//*[@id='WC_AccountDisplay_links_2']")
	public WebElement loginButton;
	@FindBy(xpath = "//input[@id=\\\"header-search\\\"]")
	public WebElement searchBar;
	@FindBy(xpath = "//button[@class=\\\"Search__SearchButton-sc-ztrrc9-1 bQTuVQ\\\"]")
	public WebElement searchButton;
	@FindBy(xpath = "//div[@class='sc-dkzDqf gNublD rec rec-slider-container']/div/div/div[1]/div/div/div/a")
	public WebElement firstProduct;
	@FindBy(xpath = "//button[@class=\\\"add-to-cart-row-styled__AddToCartButton-sc-4a84804-0 fbJWBa\\\"]")
	public WebElement addingProduct;
	@FindBy(xpath = "//a[@class=\\\"Shared__SecondaryNavigationButton-sc-ed57a588-1 foAVkh\\\"]")
	public WebElement addToCartButton;
	@FindBy(xpath = "//div[@id='cart-heading']/span")
	public WebElement actualTextCart;
	@FindBy(xpath = "//a[@id=\\\"continueReviewPage\\\"]")
	public WebElement checkoutButton;
	@FindBy(xpath = "//div[@class=\\\"AddCreditCard-styled__ButtonContainer-sc-cb788d4e-4 bQaeXc\\\"]")
	public WebElement addToCard;
	@FindBy(id = "AccountNumber")
	public WebElement cardNumberField;
	@FindBy(id = "FullName")
	public WebElement cardNameField;
	@FindBy(xpath = "/input[@id=\\\"SaveButton\\\"]")
	public WebElement placeOrderButton;
	@FindBy(xpath = "//a[@id=\\\"WC_OrderItemDetailsf_links_3_1\\\"]")
	public WebElement removeAllItemsButton;
	@FindBy(xpath = "//h1[contains(text(), \\\"Your Cart Is Empty\\\")]")
	public WebElement emptyCart;
	
	
	
}


