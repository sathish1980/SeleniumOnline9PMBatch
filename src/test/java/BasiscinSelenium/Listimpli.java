package BasiscinSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.*;

public class Listimpli {
	
	public void listimplementation(String[] ExpectedCity) throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		String title = driver.getTitle();
		System.out.println(title);
		String getUrl = driver.getCurrentUrl();
		System.out.println(getUrl);
		String domstructure= driver.getPageSource();
		System.out.println(domstructure);
		
		String text = driver.findElement(By.xpath("(//*[@id='j_idt87']//div[1]//h5)[7]")).getText();
		System.out.println(text);
		
		for(int j=0;j<ExpectedCity.length;j++)
		{
			String ExpectedCities = ExpectedCity[j];
		
		driver.findElement(By.xpath("//*[contains(@class,'ui-selectcheckboxmenu-trigger')]")).click();
		Thread.sleep(2000);
		List<WebElement> AllValues = driver.findElements(By.xpath("//*[@class='ui-selectcheckboxmenu-items-wrapper']//ul//li"));
		int size= AllValues.size();
		for(int i=1;i<=size;i++)
		{
			String ActualCity = driver.findElement(By.xpath("//*[@class='ui-selectcheckboxmenu-items-wrapper']//ul//li["+i+"]")).getAttribute("data-item-value");
			System.out.println(ActualCity);
			if(ActualCity.equalsIgnoreCase(ExpectedCities))
			{
				driver.findElement(By.xpath("//*[@class='ui-selectcheckboxmenu-items-wrapper']//ul//li["+i+"]//div[contains(@class,'ui-chkbox-box')]")).click();
				break;
			}
		}
		driver.findElement(By.xpath("//*[contains(@class,'ui-selectcheckboxmenu-close')]")).click();
		}
		String windowsname = driver.getWindowHandle();
		System.out.println(windowsname);
		System.out.println(driver.getWindowHandles());
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Listimpli L = new Listimpli();
		String[] Cityname= {"Rome","Paris","Berlin"};
		L.listimplementation(Cityname);
	}

}
