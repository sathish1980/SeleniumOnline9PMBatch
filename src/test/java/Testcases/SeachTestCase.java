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
import Pages.SearchPage;
import Pages.SearchResultPage;
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
		SearchPage s = new SearchPage(driver);
		s.ClickFromLocation();
		s.SelectLocation("DEL");
		s.ClickToLocation();
		s.SelectLocation("MAA");
		s.SelectADate("26");
		s.ClickOnSearchButton();
		SearchResultPage srp = new SearchResultPage(driver);
		srp.waitForOkayGotIt();
		String searchResult = srp.WaitAndGetSearchText();
		System.out.println(searchResult);
		Assert.assertEquals("Flights from New Delhi to Chennai", searchResult);
	}
	
	@Test(priority=1)
	public void FlightSearchWithInValidValues() throws InterruptedException
	{
		
		SearchPage s = new SearchPage(driver);
		s.ClickOnBackButton(driver);
		s.ClickFromLocation();
		s.SelectLocation("MAA");
		s.ClickToLocation();
		s.SelectLocation("MAA");
		String actualError = s.GetErrorMessageForSameCity();
		Assert.assertEquals("From & To airports cannot be the same", actualError);
		
	}
	
	@Test(priority=2)
	public void ValidateErrorRemovedAfterWeCorrectTheError() throws InterruptedException
	{
		
		SearchPage s = new SearchPage(driver);
		s.ClickFromLocation();
		s.SelectLocation("DEL");
		String actualError = s.GetErrorMessageForSameCity();
		Assert.assertEquals("No Error Exist", actualError);
		
	}
	@AfterSuite
	public void teardown()
	{
		driver.quit();
	}
}
