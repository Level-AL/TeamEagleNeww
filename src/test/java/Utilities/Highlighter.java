package Utilities;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Highlighter {
    private static final int FLASH_DURATION = 200; // Flash duration in milliseconds

    public static void highlightElement(WebDriver driver, WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String originalStyle = element.getAttribute("style");

        // Flash the element in lighter shades of red, white, and blue colors
        for (int i = 0; i < 3; i++) {
            // Light red color (#FF8080)
            js.executeScript("arguments[0].setAttribute('style', 'background-color: #FF8080; border: 2px solid #FF8080;');", element);
            sleep(FLASH_DURATION);

            // Light white color (#F8F8F8)
            js.executeScript("arguments[0].setAttribute('style', 'background-color: #F8F8F8; border: 2px solid #F8F8F8;');", element);
            sleep(FLASH_DURATION);

            // Light blue color (#8080FF)
            js.executeScript("arguments[0].setAttribute('style', 'background-color: #8080FF; border: 2px solid #8080FF;');", element);
            sleep(FLASH_DURATION);

            // Revert back to the original style
            js.executeScript("arguments[0].setAttribute('style', '" + originalStyle + "');", element);
            sleep(FLASH_DURATION);
        }
    }

    private static void sleep(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

