package BasiscinSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	public void dropdownimplementation() throws InterruptedException
	{
	
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		// Thread.sleep(2000);
		Select s = new Select(driver.findElement(By.id("day")));
		s.selectByIndex(25);
		Select month = new Select(driver.findElement(By.id("month")));
		month.selectByValue("6");
		Select year = new Select(driver.findElement(By.id("year")));
		year.selectByVisibleText("2000");
	}
		

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Dropdown D = new Dropdown();
		D.dropdownimplementation();
	}

}
