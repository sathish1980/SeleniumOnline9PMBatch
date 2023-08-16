package Testcases;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BrowserDriver.WebDriverFile;
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

	@Test(priority=0)
	public void LaunchTheBrowserCheck()
	{
		System.out.println("Browser is launched and url is entered");
	}

	@AfterSuite
	public void teardown()
	{
		driver.quit();
	}
}
