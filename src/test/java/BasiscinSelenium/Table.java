package BasiscinSelenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {
	
	WebDriver driver;
	public void tableImplementation(String expectedCountryName)
	{
		driver = new ChromeDriver();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		driver.manage().window().maximize();
		driver.get("https://leafground.com/table.xhtml");
		List<WebElement> totalRows =driver.findElements(By.xpath("//*[@class='ui-datatable-scrollable-body']//table/tbody//tr"));
		for(int i=1;i<totalRows.size();i++)
		{
			String countryName = driver.findElement(By.xpath("//*[@class='ui-datatable-scrollable-body']//table/tbody//tr["+i+"]//td[2]//span[contains(@style,'vertical-align')]")).getText();
			if (expectedCountryName.equalsIgnoreCase(countryName))
			{
				String representative = driver.findElement(By.xpath("//*[@class='ui-datatable-scrollable-body']//table/tbody//tr["+i+"]//td[3]//span[contains(@style,'vertical-align')]")).getText();
				System.out.println(representative);
				String status = driver.findElement(By.xpath("//*[@class='ui-datatable-scrollable-body']//table/tbody//tr["+i+"]//td[5]//span[contains(@class,'customer-badge')]")).getText();
				System.out.println(status);
				
			}
		}
	} 	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Table T = new Table();
		T.tableImplementation("India");
	}

}
