package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Utilities.driverClass;

public class NaransFactory {

	public NaransFactory() {
		 PageFactory.initElements(driverClass.getDriver(), this);
	 }
	
	@FindBy (xpath =  "//button[@aria-label='Menu']")
	public WebElement navigationMenu;
	
	@FindBy (xpath =  "///button[@aria-label='Shop CAT']")
	public WebElement CatOption;
	
	@FindBy (xpath =  "/li[@role='listitem']//section/h2/a\"']")
	public WebElement CorrectPage;

	@FindBy (xpath =  "//a[@href='/shop/en/petcostore/category/cat/cat-treats/cat-crunchy-treats']")
	public WebElement SpecificCatProduct;
   
	@FindBy (xpath =  "https://www.petco.com/shop/en/petcostore/category/cat/cat-treats/cat-crunchy-treats")
	public WebElement ProductDetailsPage;

	@FindBy (xpath =  "//a[@data-track-value='CAT:SUPPLIES:Clothing & Accessories']")
	public WebElement ClothesAccessoriesUnderSuppliesCategory;
	
	@FindBy (xpath =  "//button[@aria-controls='color-panel']")
	public WebElement ColorFilter;
	
	@FindBy (xpath =  "//input[@data-testid='facet-checkbox___item-black']")
	public WebElement BlackColor;
	
}