package automation.mobile.core;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CovidBaseClass {

	WebDriver driver;
	DesiredCapabilities cap = new DesiredCapabilities();
	
	@BeforeClass
	public void init() throws MalformedURLException{
	     
	cap.setCapability("deviceName", "emulator-5554");
	cap.setCapability("platformName", "Android");
	cap.setCapability(CapabilityType.BROWSER_NAME, "Chrome"); 
	cap.setCapability(CapabilityType.VERSION, "10");
	driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
	 
	}
	 
	@BeforeMethod
	public void launchApp() throws MalformedURLException {
	 
	    driver.get("https://www.amazon.com");

	 
	}

}