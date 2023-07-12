package BasiscinSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Radiobutton {
	
	public void radiobuttonimplementation(String gender) throws InterruptedException
	{
	
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		// Thread.sleep(2000);
		if(gender.equalsIgnoreCase("FeMale"))
		{
		driver.findElement(By.xpath("//*[@name='sex' and @value='1']")).click();	
		}
		else if(gender.equalsIgnoreCase("Male"))
		{
		driver.findElement(By.xpath("//*[@name='sex' and @value='2']")).click();	
		}
		else if(gender.equalsIgnoreCase("custom"))
		{
		driver.findElement(By.xpath("//*[@name='sex' and @value='-1']")).click();	
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Radiobutton c = new Radiobutton();
		c.radiobuttonimplementation("custom");
	}

}
