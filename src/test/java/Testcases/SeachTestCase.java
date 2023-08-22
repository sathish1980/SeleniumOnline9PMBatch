package Testcases;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BrowserDriver.WebDriverFile;
import Commons.WebDriverCommons;
import Utils.PropertyFileHandle;


public class SeachTestCase extends WebDriverFile {
	
	@BeforeSuite
	public void LaunchTheBrowser() throws InterruptedException
	{
		Launch();
	}
	
	@BeforeTest
	public void LauchTheBrowserURL()
	{
		String url = PropertyFileHandle.propreaddata().getProperty("URL");
		driver.get(url);
		
	}

	@SuppressWarnings("deprecation")
	@Test(priority=0)
	public void FlightSearchWithValidValues() throws InterruptedException
	{
		/*
		 * Lauch the Browser and enter the application url -done
		 * Select the From Location
		 * Select To location
		 * Select Date
		 * Click On Search
		 * Wait for Search Result Page
		 * Valdiate the Search REsult critera is macth with the search input
		 */
		ClickFromLocation();
		SelectLocation("DEL");
		ClickToLocation();
		SelectLocation("MAA");
		SelectADate("26");
		ClickOnSearchButton();
		waitForOkayGotIt();
		String searchResult = WaitAndGetSearchText();
		System.out.println(searchResult);
		Assert.assertEquals("Flights from Mumbai to Chennai", searchResult);
	}
	
	public void ClickFromLocation() throws InterruptedException
	{
		Thread.sleep(5000);
		WebDriverCommons WD = new WebDriverCommons();
		WD.Explicitwaitforelementobeclickable(driver, driver.findElement(By.xpath("//*[@for='fromCity']")));
		
		driver.findElement(By.xpath("//*[@for='fromCity']")).click();
	}
	
	public void ClickToLocation() throws InterruptedException
	{
		//Thread.sleep(5000);
		WebDriverCommons WD = new WebDriverCommons();
		WD.Explicitwaitforelementobeclickable(driver, driver.findElement(By.xpath("//*[@for='toCity']")));
		
		driver.findElement(By.xpath("//*[@for='toCity']")).click();
	}
	public void SelectLocation(String expectedLocation)
	{
		WebDriverCommons WD = new WebDriverCommons();
		WD.Explicitwaitforelementobeclickable(driver, driver.findElement(By.xpath("(//*[@id='react-autowhatever-1']//li)[last()]")));
		List<WebElement> allElements = driver.findElements(By.xpath("//*[@id='react-autowhatever-1']//li"));
		for(int i=1;i<allElements.size();i++)
		{
			String actualLocation = driver.findElement(By.xpath("//*[@id='react-autowhatever-1']//li["+i+"]//div[contains(@class,'pushRight')]")).getText();
			if (expectedLocation.equalsIgnoreCase(actualLocation))
			{
				driver.findElement(By.xpath("//*[@id='react-autowhatever-1']//li["+i+"]")).click();
				break;
			}
				
		}
	}
	
	public void SelectADate(String dateToBeSelect)
	{
		WebDriverCommons WD = new WebDriverCommons();
		WD.Explicitwaitforpresencefelement(driver, By.xpath("(//*[@class='DayPicker-Month'])[last()-1]//*[@class='DayPicker-Week']//div[contains(@class,'DayPicker-Day')]"));
		
		List<WebElement> AllDates = driver.findElements(By.xpath("(//*[@class='DayPicker-Month'])[last()-1]//*[@class='DayPicker-Week']//div[contains(@class,'DayPicker-Day')]"));
		for(int i=1;i<=AllDates.size();i++)
		{
			String dateIsDisabled = driver.findElement(By.xpath("((//*[@class='DayPicker-Month'])[last()-1]//*[@class='DayPicker-Week']//div[contains(@class,'DayPicker-Day')])["+i+"]")).getAttribute("class");
			if(!dateIsDisabled.contains("disabled"))
			{
				String actualDate = driver.findElement(By.xpath("((//*[@class='DayPicker-Month'])[last()-1]//*[@class='DayPicker-Week']//div[contains(@class,'DayPicker-Day')])["+i+"]//p")).getText();
				if (actualDate.equalsIgnoreCase(dateToBeSelect))
				{
					driver.findElement(By.xpath("((//*[@class='DayPicker-Month'])[last()-1]//*[@class='DayPicker-Week']//div[contains(@class,'DayPicker-Day')])["+i+"]")).click();
					break;
				}
			}
			
		}
	}
	
	public void ClickOnSearchButton()
	{
		driver.findElement(By.xpath("//*[text()='Search']")).click();
	}
	
	public String WaitAndGetSearchText()
	{
		
		WebDriverCommons WD = new WebDriverCommons();
		WD.Explicitwaitforpresencefelement(driver, By.xpath("//*[contains(@class,'journey-title')]//span"));
		String actualResultText = driver.findElement(By.xpath("//*[contains(@class,'journey-title')]//span")).getText();
		return actualResultText;
	}

	public void waitForOkayGotIt() throws InterruptedException
	{
		WebDriverCommons WD = new WebDriverCommons();
		WD.Explicitwaitforpresencefelement(driver, By.xpath("(//div[@class='overlay']//span)[1]"));
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[@class='overlay']//span)[1]")).click();
	}
	@AfterSuite
	public void teardown()
	{
		//driver.quit();
	}
}
