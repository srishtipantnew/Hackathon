package automation.covid.tests;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import automation.covid.core.BaseClass;
import automation.covid.pages.HomePage;

public class TestPositivityRatioTest {
	WebDriver driver;
	HomePage homepage;

	public TestPositivityRatioTest() {
		homepage = new HomePage(driver);
	}

	@BeforeTest
	public void setup() {
	System.setProperty("webdriver.chrome.driver", "src/test/resources/driver/chrome-driver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://www.covid19india.org/");
	}
	
	
	@Test(priority = 1)
	public void verifyTestPositivity() {
		System.out.println("gregerg");
		homepage.getTestedPositiveRatio();

	}
	
	@AfterTest
	public void tearDownTest() {
		driver.close();
	}
}
