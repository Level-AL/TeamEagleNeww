package Utilities;

import java.util.List;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Cms extends pageInitializer{

	
	
	public static void scrollPage() {
	Actions a = new Actions(driverClass.getDriver());
    //scroll down a page
    a.sendKeys(Keys.PAGE_DOWN).build().perform();}
	
	
	

	public static void scrollPageUp() {
	Actions a = new Actions(driverClass.getDriver());
    //scroll down a page
    a.sendKeys(Keys.PAGE_UP).build().perform();}
	
	//------------------------------------------------------------------//
	
	
	public static void clickSpecificElementInList(List<WebElement> listOfWebElement, WebElement textOfSpecificElement) {
	    WebElement text;

	    for (int i = 0; i < listOfWebElement.size(); i++) {
	        text = listOfWebElement.get(i);
	        if (text.getText().contains(textOfSpecificElement.getText())) {
	            text.click();
	        }
	    }
	}

	
	//------------------------------//
	
	
	
	
}

