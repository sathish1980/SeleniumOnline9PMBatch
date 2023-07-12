package BasiscinSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class SecondClass {
	
	public void launch()
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		//driver.manage().window().minimize();
		//driver.close();
		/*driver.get("https://www.facebook.com/");
		driver.navigate().to("https://mail.google.com/mail/u/0/#inbox");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();*/
		driver.get("https://www.facebook.com/");
		// WebElement username = driver.findElement(By.id("email"));
		//WebElement username = driver.findElement(By.name("email"));
		//WebElement username = driver.findElement(By.className("inputtext _55r1 _6luy"));
		WebElement username = driver.findElement(By.xpath("//input[@type='text']"));
		
		username.sendKeys("sathish kumar R");
		username.clear();
		//or
		// driver.findElement(By.linkText("Forgotten password?")).click();
		driver.findElement(By.partialLinkText("pass")).click();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SecondClass s = new SecondClass();
		s.launch();
	}

}
