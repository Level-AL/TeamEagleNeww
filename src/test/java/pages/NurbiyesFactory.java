package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.driverClass;

public class NurbiyesFactory {
	public NurbiyesFactory() {
		 PageFactory.initElements(driverClass.getDriver(), this);
	}
	
	@FindBy (xpath = "//button[@class=\"primary-navigation-styled__HamburgerButton-sc-cece281c-1 jNLiTL\"]")
	public WebElement menu;
	
	@FindBy (xpath = "//ul[@class=\"primary-navigation-content-styled__NavigationMenu-sc-9816bae5-1 kKqHfO\"]/li[8]/button")
	public WebElement reptilebar;
	
	@FindBy (xpath = "//a[@class=\"flyout__FlyoutLink-sc-7921f2eb-0 lbzpch\"]")
	public WebElement reptiletab;
	
	
	@FindBy (xpath = "//div[@id=\"shop-by-reptile\"]/div/div[2]/div[1]/a/div[2]/h4")
	public WebElement reptileProductInfo;
	
	@FindBy (xpath = "//*[@id=\"topcontent\"]/div[2]/div/div/ul/li[8]/div[2]/ul/section/div[2]/ul/li[6]/div[2]/ul/li[5]/a")
	public WebElement frogtab;
	
	@FindBy (xpath = "//a[@href='/shop/en/petcostore/product/zilla-vertical-tropical-kit-12x12x18']")
	public WebElement product;
	
	
	@FindBy (xpath = "//*[@id=\"variation-0\"]/div[1]/div[2]")
	public WebElement productDimension;
	
	@FindBy (xpath = "//button[@class='add-to-cart-row-styled__AddToCartButton-sc-4a84804-0 fbJWBa']")
	public WebElement addToCart;
	
	@FindBy (xpath = "//a[@id=\"continueReviewPage\"]")
	public WebElement checkout;
	
	@FindBy (xpath = "//button[@class=\"checkout__Button-sc-e843036f-1 checkout__SaveAndContinueButton-sc-e843036f-5 SelectShippingMethod___StyledSaveAndContinueButton-sc-f9c009e1-3 esNAPb iZRmpw cmhROC\"]")
	public WebElement saveAndContinue;
	
	
	@FindBy (xpath = "//button[contains(text(),'Add Credit Card')]")
	public WebElement creditCard;
	
	@FindBy (xpath = "//button[@class=\"primary-navigation-styled__HamburgerButton-sc-cece281c-1 gUQzAW\"]")
	public WebElement menu2;

	
	@FindBy (xpath = "//ul[@class=\"primary-navigation-content-styled__NavigationMenu-sc-9816bae5-1 cgQsEL\"]/li[8]/button")
	public WebElement reptilebar2;
	
	@FindBy(xpath ="//input[@id=\"cart-sign-in-emailAddress\"]")
	public WebElement email;
	
	@FindBy(xpath ="//input[@id=\"cart-sign-in-userPassword\"]")
	public WebElement password;
	
	@FindBy(xpath ="//button[@class=\"btn btn-primary btn-full margin-top-md\"]")
	public WebElement submit;

}
