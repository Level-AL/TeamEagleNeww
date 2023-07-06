package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.driverClass;

public class ZakirsFactory {
	
	public ZakirsFactory() {
		 PageFactory.initElements(driverClass.getDriver(), this);
	}
	
	
	@FindBy (xpath = "//*[@id=\"topcontent\"]/div[2]/button")
	public WebElement navigationMenue;
	
	@FindBy (xpath = "//span[text()='DOG']")     
	public WebElement DogElement;
	
	@FindBy (xpath = "//span[text()='DOG']")
	public WebElement DogBtn;
	
	@FindBy (xpath = "//*[@id=\"topcontent\"]/div[2]/div/div/ul/li[4]/div[2]/ul/section/h2/a")
	public WebElement DogPageHeading;
	
	@FindBy (xpath = "//*[@id='WC_AccountDisplay_FormInput_logonId_In_Logon_1']")
	public  WebElement emailBox ;
	
	@FindBy (xpath = "//*[@id='WC_AccountDisplay_FormInput_logonPassword_In_Logon_1']")
	public WebElement passwordBox;
	
	@FindBy (xpath = "//*[@id='WC_AccountDisplay_links_2']")
	public WebElement loginButton;
	
	
	@FindBy (xpath = "//*[@id=\"header-search\"]")
	public WebElement searchBar;
	
	
	@FindBy (xpath = "//button[@aria-label='Search']")
	public WebElement searchBtn;
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	


