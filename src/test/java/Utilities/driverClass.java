package Utilities;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driverClass {

	// example of a singleton class
	
	public static WebDriver driver;
	
	@BeforeTest (alwaysRun = true )
	public static WebDriver getDriver() {
		
		
	        if (driver == null) {

	            
	            switch (ConfigurationReader.getProperty("browser")) {

	            case "chrome":
	                WebDriverManager.chromedriver().setup();
	                driver = new ChromeDriver();
	                driver.manage().window().maximize();
	                driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	                break;
	            case "chrome-headless":
	                WebDriverManager.chromedriver().setup();
	                driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
	                break;
	            case "firefox":
	                WebDriverManager.firefoxdriver().setup();
	                driver = new FirefoxDriver();
	                break;
	            case "firefox-headless":
	                WebDriverManager.firefoxdriver().setup();
	                driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
	                break;
	            case "edge":

	                if (!System.getProperty("os.name").toLowerCase().contains("windows")) {
	                    throw new WebDriverException("Your OS doesn't support Edge");
	                }

	                WebDriverManager.edgedriver().setup();
	                driver = new EdgeDriver();
	                break;
	            case "safari":

	                if (!System.getProperty("os.name").toLowerCase().contains("mac")) {
	                    throw new WebDriverException("Your OS doesn't support Safari");
	                }

	                WebDriverManager.safaridriver().setup();
	                driver = new SafariDriver();
	                break;
	            }

	            driver.get(ConfigurationReader.getProperty("petco"));
	            driver.manage().window().maximize();
	            driver.manage().timeouts().implicitlyWait(Constants.implicit_wait_time, TimeUnit.SECONDS);
	            

	        }
	        return driver;
	    }
	
    @AfterTest(alwaysRun = true)
	public static void tearDown() {
        if (driver != null) {
            driver.close();
            driver.quit();
            driver = null;
        }

    }

	
	
	
}
