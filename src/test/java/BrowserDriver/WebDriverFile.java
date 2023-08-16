package BrowserDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import Utils.PropertyFileHandle;

public class WebDriverFile 
{

	public static WebDriver driver;
	public void Launch() throws InterruptedException
	{
		
		String broswerName = PropertyFileHandle.propreaddata().getProperty("Browser");
		 
		if(broswerName.equalsIgnoreCase("Edge"))
		{
		driver = new EdgeDriver();
		}
		else if(broswerName.equalsIgnoreCase("Chrome"))
		{
		driver = new ChromeDriver();
		}
		driver.manage().window().maximize();
	}
}
