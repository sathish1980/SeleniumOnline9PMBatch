package Testcases;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.LogStatus;

import BrowserDriver.WebDriverFile;
import Commons.WebDriverCommons;
import Pages.SearchPage;
import Pages.SearchResultPage;
import Utils.ExcelFileHandling;
import Utils.PropertyFileHandle;


public class SeachTestCase extends WebDriverFile {
	
	@BeforeSuite
	public void LaunchTheBrowser() throws InterruptedException
	{
		Launch();
	}
	
	@BeforeTest
	public void LauchTheBrowserURL() throws InterruptedException
	{
		String url = PropertyFileHandle.propreaddata().getProperty("URL");
		driver.get(url);
		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.navigate().refresh();
		Thread.sleep(5000);
		
	}

	@Test(priority=0,dataProvider="SearchData",dataProviderClass=DataProviderClass.class)
	public void FlightSearchWithValidValues(String fromLoc,String toLoc,String date,String l) throws InterruptedException
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
		test.log(LogStatus.INFO, "Sucessfully launched");
		SearchPage s = new SearchPage(driver);
		s.ClickFromLocation();
		s.SelectLocation(fromLoc);
		test.log(LogStatus.INFO, "Sucessfully selected the from Location as " +fromLoc);
		
		s.ClickToLocation();
		s.SelectLocation(toLoc);
		test.log(LogStatus.INFO, "Sucessfully selected the to Location as " +toLoc);
		
		s.SelectADate(date);
		test.log(LogStatus.INFO, "Sucessfully selected the Date as " +date);
		
		s.ClickOnSearchButton();
		test.log(LogStatus.INFO, "Sucessfully clicked the search button ");
		
		SearchResultPage srp = new SearchResultPage(driver);
		srp.waitForOkayGotIt();
		test.log(LogStatus.INFO, "Sucessfully clicked the okGOtIT popup ");
		
		String searchResult = srp.WaitAndGetSearchText();
		String screenshotPath= s.takescreenshot(driver);
		
		System.out.println(searchResult);
		s.ClickOnBackButton(driver);
		Assert.assertEquals(s.GetSearchResultValue(), searchResult);
		test.log(LogStatus.INFO, "Sucessfully valdiated the search test");	
		test.log(LogStatus.PASS, test.addScreenCapture(screenshotPath));	

	}
	
	@Test(priority=1,dataProvider="SearchInvalidData",dataProviderClass=DataProviderClass.class	)
	public void FlightSearchWithInValidValues(String fromLoc,String toLoc) throws InterruptedException
	{
		SearchPage s = new SearchPage(driver);
		
		try
		{
		//s.ClickOnBackButton(driver);
		s.ClickFromLocation();
		s.SelectLocation(fromLoc);
		test.log(LogStatus.INFO, "Sucessfully selected the from Location as " +fromLoc);
		
		s.ClickToLocation();
		s.SelectLocation(toLoc);
		test.log(LogStatus.INFO, "Sucessfully selected the to Location as " +toLoc);
		
		String actualError = s.GetErrorMessageForSameCity();
		Assert.assertEquals("From & To airports cannot be the same", actualError);
		String screenshotPath= s.takescreenshot(driver);
		test.log(LogStatus.INFO, "Error messages are validated and the error message is : " +actualError);
		test.log(LogStatus.PASS, test.addScreenCapture(screenshotPath));
		}
		catch(Exception E)
		{
			String screenshotPath= s.takescreenshot(driver);
			test.log(LogStatus.FAIL, test.addScreenCapture(screenshotPath));
			
		}
	}
	
	@Test(priority=2)
	public void ValidateErrorRemovedAfterWeCorrectTheError() throws InterruptedException
	{
		
		SearchPage s = new SearchPage(driver);
		s.ClickFromLocation();
		s.SelectLocation("DEL");
		String screenshotPath= s.takescreenshot(driver);
		
		test.log(LogStatus.INFO, "Sucessfully selected the from Location as DEL");
		
		String actualError = s.GetErrorMessageForSameCity();
		Assert.assertEquals("No Error Exist", actualError);
		test.log(LogStatus.INFO, "Error messages are removed and the are no error message");
		test.log(LogStatus.PASS, test.addScreenCapture(screenshotPath));	

	}
	@AfterSuite
	public void teardown()
	{
		extentreportclose();
		driver.quit();
	}
	
}
