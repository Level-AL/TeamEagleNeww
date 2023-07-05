package Utilities;

import java.util.List; 
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;


public class cM extends pageInitializer {

	// This method is for sending String to the element we have given
	// @param : WebElement element = is accepting the WebElement where we
	// are sending the text
	// String text = it is the parameter that we are sending

	public static void sendKey (WebElement element, String text) {

		element.clear();
		element.sendKeys(text);

	}

	public static void wait(int seconds) {

		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			System.out.println(e);
		}

	}

	// goes through and selects the radio button or checkbox button that has the
	// value that you give it
	public static void clickRadioOrCheckBox(List<WebElement> radioOrCheckBox, String value) {

		String actualValue;

		for (WebElement eachElement : radioOrCheckBox) {
			actualValue = eachElement.getAttribute("value").trim();

			if (eachElement.isEnabled() && actualValue.equals(value)) {
				eachElement.click();

				break;
			}

		}

	}

	// selects dropDown by visible text

	public static void selectDropDownByVisibleText(WebElement element, String textToSelect) {

		try {
			Select select = new Select(element);

			List<WebElement> options = select.getOptions();

			for (WebElement el : options) {
				if (el.getText().equals(textToSelect)) {
					select.selectByVisibleText(textToSelect);
					break;
				}
			}
		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}
	// selects dropDown value

	public static void selectDropDownByValue(WebElement element, String textToSelect) {

		try {
			Select select = new Select(element);

			List<WebElement> options = select.getOptions();

			for (WebElement el : options) {
				if (el.getText().equals(textToSelect)) {
					select.selectByValue(textToSelect);
					break;
				}
			}
		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}

	// selects dropDown by index
	public static void selectDropDownIndex(WebElement element, int indexValue) {

		try {
			Select select = new Select(element);

			int size = select.getOptions().size();

			if (size > indexValue) {
				select.selectByIndex(indexValue);
			}

		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}

	// alert accept
	public static void acceptAlert() {

		try {
			Alert alert = driverClass.getDriver().switchTo().alert();
			alert.accept();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}

	}

	// alert dismiss
	public static void dismissAlert() {

		try {
			Alert alert = driverClass.getDriver().switchTo().alert();
			alert.dismiss();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}

	}

	// alert getText
	public static String alertGetText() {
		String alertText = null;
		try {
			Alert alert = driverClass.getDriver().switchTo().alert();
			alertText = alert.getText();
		} catch (NoAlertPresentException e) {
			e.printStackTrace();
		}

		return alertText;
	}

	// create 2 methods to switch from child window to parent window and vice versa

//	 switch iframe by index
	public static void switchToIFrameByIndex(int iframeIndex) {

		try {
			driverClass.getDriver().switchTo().frame(iframeIndex);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

//	switch iframe by element
	public static void switchToIFrameByElement(WebElement iframeElement) {
		try {
			driverClass.getDriver().switchTo().frame(iframeElement);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}
	}

//	switchiframe by name
	public static void switchToIFrameByName(String iframeName) {
		try {
			driverClass.getDriver().switchTo().frame(iframeName);
		} catch (NoSuchFrameException e) {
			e.printStackTrace();
		}

	}

	// switch to default content after iframe
	public static void switchToDefaultContent() {

		driverClass.getDriver().switchTo().defaultContent();

	}

//

//	switch from parent to child windows
	public static void switchToChildWindow(String parentWindowHandle) {
		try {
			Set<String> windowHandles = driverClass.getDriver().getWindowHandles();

			for (String windowHandle : windowHandles) {
				if (!windowHandle.equals(parentWindowHandle)) {
					driverClass.getDriver().switchTo().window(windowHandle);
					break;

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// switch from child to parent window
	public static void switchToParentWindow(String childWindowHandle) {
		try {
			Set<String> windowHandles = driverClass.getDriver().getWindowHandles();

			for (String windowHandle : windowHandles) {
				if (!windowHandle.equals(childWindowHandle)) {
					driverClass.getDriver().switchTo().window(windowHandle);
					break;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	
	// excplicit wait method
	
	public static WebDriverWait explicitWait () {
		
		WebDriverWait wait = new WebDriverWait(driverClass.getDriver(), Constants.explicit_wait_time);
		return wait;
	}
	
	
	public static WebElement waitForClickability (WebElement element) {
		
		return explicitWait().until(ExpectedConditions.elementToBeClickable(element));
	}
	
	public static WebElement waitForVisibilty (WebElement element) {
		
		return explicitWait().until(ExpectedConditions.visibilityOf(element));
	}
	
	public static void click (WebElement element ) {
		
		waitForVisibilty(element).click();
	}
	//Created by Naidan
	public void clickElement(WebElement element) {
		element.click();
	}
	
	
	public static void sendKey ( String keys, WebElement element) {
		
		waitForVisibilty(element).sendKeys(keys);
		
	}	
	
//	hover over
	public static void hoverOver (WebElement element) {
		Actions actions = new Actions(driverClass.getDriver());
		actions.moveToElement(element).perform();
	}
//	dragAndDrop
	public static void dragAndDrop (WebElement element1, WebElement element2) {
		Actions actions = new Actions(driverClass.getDriver());
		actions.dragAndDrop(element1, element2).perform();;
	}
//	doubleClick
	public static void doubleClick () {
		Actions actions = new Actions(driverClass.getDriver());
		actions.doubleClick().perform();
	}
	
//JS executor click By Naidan
	
	public static void jsClick(WebElement element) {
		try {
		    // Attempt to click on the element using the regular Selenium click() method
			element.click();
		} catch (ElementClickInterceptedException e) {
		    // If ElementClickInterceptedException is caught, handle it using JavaScript Executor

		    // Create an instance of JavascriptExecutor
			JavascriptExecutor js = (JavascriptExecutor) driverClass.getDriver();

		    try {
		        // Scroll the page to bring the element into view
		    	js.executeScript("arguments[0].scrollIntoView(true);", element);

		        // Click on the element using JavaScript
		    	js.executeScript("arguments[0].click();", element);
		    } catch (Exception ex) {
		        // Handle any exceptions that may occur during the JavaScript execution
		        ex.printStackTrace();
		    }
		}
	}
	
	
	
	
	
	public static void clickSpecificElementInListByText(List<WebElement> listOfWebElement,
            String textOfSpecificElement) {

        String text;

        for (int i = 0; i < listOfWebElement.size(); i++) {

            text = listOfWebElement.get(i).getText();
            if (text.contains(textOfSpecificElement)) {
                listOfWebElement.get(i).click();
            }
        }

    }
	
	
	
	public static void scrollPage() {
	    Actions a = new Actions(driverClass.getDriver());
	    //scroll down a page
	    a.sendKeys(Keys.PAGE_DOWN).build().perform();}
	
	
	
	
	
}
