package BasiscinSelenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	
	WebDriver driver;
	public void frameconcpet()
	{
		//System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\driverfiles\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/frame.xhtml");
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//*[@id='Click' and text()='Click Me'])[1]")));
		//driver.findElement(By.xpath("//button[contains(@style,'#ff7295')]")).click();
		
		List<WebElement> totalFrames= driver.findElements(By.tagName("iframe"));
		for(int i=0;i<totalFrames.size();i++)
		{
			driver.switchTo().frame(i);
			List<WebElement> elementExist= driver.findElements(By.xpath("//button[contains(@style,'#ff7295')]"));
			if(elementExist.size()>0)
			{
				driver.findElement(By.xpath("//button[contains(@style,'#ff7295')]")).click();
				driver.switchTo().defaultContent();
				break;
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Frames F = new Frames();
		F.frameconcpet();
	}

}
