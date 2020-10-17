package automation.covid.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class HomePage{

    WebDriver driver;
    WebElement testedList; 

	//By  testedList = By.className("delta is-confirmed");
	By  confirmedList = By.className("delta is-confirmed");
	By  stateList = By.className("state-name fadeInUp");
	By  check = By.xpath("//div[@class='expand-table-toggle']/*[@class='octicon']");
	
	public HomePage(WebDriver driver) {
        this.driver = driver;
	}

	public void getTestedPositiveRatio() {
	//	driver.findElement(check).isDisplayed();
		driver.findElement(By.xpath("//div[@class='expand-table-toggle']/*[@class='octicon']")).click();

		/*List<WebElement> testedValues= driver.findElements(testedList);
				for (WebElement temp :testedValues ) {
		            System.out.println(temp);
		        }
		System.out.println();*/
		System.out.println("i am hrer" );
	}
	
	
}
