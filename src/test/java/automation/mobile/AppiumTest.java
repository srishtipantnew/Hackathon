package automation.mobile;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AppiumTest {

	 
WebDriver driver;
DesiredCapabilities cap = new DesiredCapabilities();
 
@BeforeClass
public void init() throws MalformedURLException{
     
cap.setCapability("deviceName", "emulator-5554");
cap.setCapability("platformName", "Android");
cap.setCapability(CapabilityType.BROWSER_NAME, "Chrome"); 
cap.setCapability(CapabilityType.VERSION, "10");
 
}
 
@Test
public void testApp() throws MalformedURLException {
 
driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
    driver.get("https://www.amazon.com");
 
}
 
}