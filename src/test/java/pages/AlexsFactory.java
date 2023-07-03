package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.driverClass;

public class AlexsFactory {
	public AlexsFactory() {
		 PageFactory.initElements(driverClass.getDriver(), this);
	 }
	
	@FindBy (xpath = "//button[@class='primary-navigation-styled__HamburgerButton-sc-cece281c-1 jNLiTL']")
	public WebElement hamburgerMenu;
	
	@FindBy (xpath = "//button[@data-track-value='NEW & TRENDING']")
	public WebElement newTrending;
	
	@FindBy (xpath= "//a[@data-track-value='NEW & TRENDING:GIFT CARDS']")
	public WebElement giftCardLink;
	
	@FindBy (xpath="//input[@name='recipientName']")
	public WebElement receptientName;
	
	@FindBy (xpath="//input[@name='senderName']")
	public WebElement senderName;
	
	@FindBy (xpath="//button[@class='primary-cta-yellow']")
	public WebElement continueWithPurchase;
	
	@FindBy (xpath= "//input[@id='recipientName-input']")
	public WebElement theirNameInput;
	
	@FindBy (xpath="senderName-input")
	public WebElement yourNameInput;
	
	@FindBy (xpath = "//button[@data-cashbot-id='recipient-button-submit']")
	public WebElement sendADigitalCard;
	
	@FindBy (xpath = "//button[@data-cashbot-id='choice-button-submit']")
	public WebElement howMuchButton;
	
	@FindBy (xpath = "//div[@id='amount-4']")
	public WebElement dollarAmount100;
	
	@FindBy (xpath = "//button[@data-cashbot-id='amount-button-submit']")
	public WebElement addAMessageButton;
	
	@FindBy (xpath= "//textarea[@id='message-input']")
	public WebElement yourMessageInput;
	
	@FindBy (xpath = "//button[@data-cashbot-id='message-button-submit']")
	public WebElement whereIsItGoingButton;
	
	@FindBy (xpath = "//input[@id='recipientEmail-input']")
	public WebElement emailInput;
	
	@FindBy (xpath = "//input[@id='recipientEmailConfirmation-input']")
	public WebElement ConfirmEmailInput;
	
	@FindBy (xpath = "//button[@data-cashbot-id='delivery-button-submit']")
	public WebElement addToCartButton;
	
	@FindBy (xpath = "//button[@data-cashbot-id='place-order-button-button']")
	public WebElement checkoutButton;
	
	@FindBy (xpath = "//input[@class='csr-no form-control dot-logon-id']")
	public WebElement loginEmailInput;
	
	
	@FindBy (xpath = "//input[@class='csr-no form-control']")
	public WebElement loginPasswordInput;
	
	@FindBy (xpath = "//button[@class='btn btn-primary btn-full margin-top-sm']")
	public WebElement signInButtonLogin;
	
	@FindBy (xpath = "//a[@class='logo-anchor-styled__Container-sc-9f47c04b-2 fKxrai']")
	public WebElement homeButtonHomePage;
	
	@FindBy (xpath = "//input[@class='input-styled__FloatInput-sc-f448db3e-5 kAqfEs']")
	public WebElement searchBar;
	
	@FindBy (xpath = "//button[@class='search-styled__SearchButton-sc-53f6302e-1 gyJbhl']")
	public WebElement searchButton;
	
	@FindBy (xpath = "//a[text()='Search: \"dog food\"']")
	public WebElement searchDogFoodValidation; 
}

