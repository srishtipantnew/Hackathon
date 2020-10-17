package automation.covid.core;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;
	
	public void init() {
	     
		System.setProperty("webdriver.chrome.driver","src/test/resources/driver/chrome-driver.exe");
	    driver = new ChromeDriver();
	    driver.get("https://www.covid19india.org/ ");
        driver.manage().window().maximize();
	 
	}
	 
	
	public WebDriver getDriver() {
        return driver;
    }
}
