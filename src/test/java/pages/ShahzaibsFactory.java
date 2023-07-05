package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.driverClass;

public class ShahzaibsFactory {

	


		
		public ShahzaibsFactory() {
			 PageFactory.initElements(driverClass.getDriver(), this);
		 }
		
		@FindBy (xpath = "//*[@id='WC_AccountDisplay_FormInput_logonId_In_Logon_1']")
		public WebElement emailBox;
		
		@FindBy (xpath = "//*[@id='WC_AccountDisplay_FormInput_logonPassword_In_Logon_1']")
		public WebElement passwordBox;
		
		@FindBy (xpath = "//*[@id='WC_AccountDisplay_links_2']")
		public WebElement signInButton;
		
		@FindBy (xpath = "//*[text()='Team']")
		public WebElement homePages;
		
		
		@FindBy (xpath = "//*[@aria-label='Menu']")
		public WebElement menuButton;
		
		@FindBy(xpath="//div/ul/li/a[text()='Cages & Cage Covers']")
		public WebElement CagesCover;
		
		@FindBy(xpath="//*[@data-cnstrc-item-id='5010613']")
		public WebElement itemToAdd;
		
		// -------------------------------1-----------------------//
		@FindBy(xpath="//div/ul/li[@role='listitem']")
		public List <WebElement> listForBirds;
		
		@FindBy(xpath="//*[@data-testid='add-to-cart-button']")
		public WebElement addToCart;
		
		@FindBy(xpath="//*[contains(@id,'qty-plus_1')]")
		public WebElement increaseQuantity;
		
		@FindBy(xpath="//*[contains(@id,'WC_OrderItemDetailsf_links_4_1')]")
		public WebElement saveLaterButton;
		
		@FindBy(xpath="//*[contains(@id,'WC_OrderItemDetailsf_links_4_1')]")
		public WebElement saveLaterVerify;
		//----------------------------------2------------------------------//
		
		@FindBy(xpath="//*[@id='brand-header']")
		public WebElement brandClicked;
		
		@FindBy(xpath="//div[contains(@class, 'BrandsFacet-styled__StyledFilterItem')]")
		public List <WebElement> brandsList;
		
		@FindBy(id="brand-header")
		public WebElement brandCloseButton;
		
		@FindBy(xpath="//div[contains(@class,'ExpandableFilter-styled__C')]")
		public List <WebElement> priceButtonList;
		
		@FindBy(xpath="//*[contains(@class,'DefaultFacet-styled__FilterI')]")
		public List <WebElement> listInPrice;
		
		@FindBy(xpath="//*[@data-testid='active-filters-button___clear']")
		public WebElement filterResults;
		
		@FindBy(xpath="//*[@data-track-product-id='5001130']")
		public WebElement selectItemFiltered;
		
		@FindBy(xpath="//*[@id='pdp-quantity-select']")
		public WebElement selectQuantity;
		
		@FindBy(xpath="//option[@value='7']")
		public WebElement selectedQuantity;
		
		@FindBy(xpath="//*[@class='cart-price price-red']")
		public WebElement priceNowText;
		
		@FindBy(xpath="//*[@class='cart-price cart-price-small smallPriceFix']")
		public WebElement priceThenText;
		
		@FindBy(xpath="//*[@id='WC_OrderItemDetailsf_links_3_1']")
		public WebElement removeItemButton;
		
		@FindBy(xpath="//*[contains(@class,'alert alert-dismissable product-removed cart-product-removed-conatiner')]")
		public WebElement removedItemVerify;
		
		//----------------------------------3------------------------------//
		
		
		@FindBy(xpath="//*[@id='header-search']")
		public WebElement searchBar;
		
		@FindBy(xpath="//button[@data-track-location='search']")
		public WebElement searchButtonForResults;
		
		@FindBy(xpath="//*[@id='__next']")
		public WebElement searchResults;
		
		@FindBy(xpath="//div/select")
		public WebElement sortByOptions;
		
		@FindBy(xpath="//select/option")
		public List <WebElement> listSortBy;
		
		@FindBy(xpath="//*[@data-cnstrc-item-id='5163181']")
		public WebElement selectitemBySort;
		//*[@data-testid='tab-content-tab-1']
		@FindBy(xpath="//div[contains(@class,'details-tab-')]/div/h2")
		public WebElement detailDisplayed;
		
		@FindBy(xpath="//section[@id='cart-left-section']")
		public WebElement cartSectionDisplayed;
		
		
	}

	

