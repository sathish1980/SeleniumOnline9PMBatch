package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Commons.WebDriverCommons;

public class SearchPage extends WebDriverCommons
{
	WebDriver driver;
	
	public SearchPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void ClickFromLocation() throws InterruptedException
	{
		Thread.sleep(5000);
		Explicitwaitforelementobeclickable(driver, driver.findElement(By.xpath("//*[@for='fromCity']")));
		
		driver.findElement(By.xpath("//*[@for='fromCity']")).click();
	}
	
	public void ClickToLocation() throws InterruptedException
	{
		//Thread.sleep(5000);
		Explicitwaitforelementobeclickable(driver, driver.findElement(By.xpath("//*[@for='toCity']")));
		driver.findElement(By.xpath("//*[@for='toCity']")).click();
	}
	
	public void SelectLocation(String expectedLocation)
	{

		Explicitwaitforelementobeclickable(driver, driver.findElement(By.xpath("(//*[@id='react-autowhatever-1']//li)[last()]")));
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
		Explicitwaitforpresencefelement(driver, By.xpath("(//*[@class='DayPicker-Month'])[last()-1]//*[@class='DayPicker-Week']//div[contains(@class,'DayPicker-Day')]"));
		
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
	
	public String GetErrorMessageForSameCity()
	{
		List<WebElement> elementExist = driver.findElements(By.xpath("//*[@data-cy='sameCityError']"));
		if (elementExist.size() >0)
		{
		Explicitwaitforpresencefelement(driver, By.xpath("//*[@data-cy='sameCityError']"));
		return driver.findElement(By.xpath("//*[@data-cy='sameCityError']")).getText();
		}
		return "No Error Exist";
	}
	
}
