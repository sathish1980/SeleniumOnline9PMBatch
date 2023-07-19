package BasiscinSelenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alertsconcepts {

	
	public void alertImplementation() throws InterruptedException
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/alert.xhtml");
		driver.findElement(By.xpath("//*[@id='j_idt88:j_idt91']")).click();
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='j_idt88:j_idt93']")).click();
		//driver.switchTo().alert().dismiss();
		// or
		Alert a = driver.switchTo().alert();
		a.dismiss();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='j_idt88:j_idt104']")).click();
		//driver.switchTo().alert().dismiss();
		// or
		Alert a1 = driver.switchTo().alert();
		String heading = a.getText();
		a.sendKeys("Besant Technology");
		a.accept();
		System.out.println(heading);
		Thread.sleep(2000);
		//Sweet alert
		
		driver.findElement(By.xpath("//*[@id='j_idt88:j_idt95']")).click();
		WebDriverWait wait =new WebDriverWait (driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='j_idt88:j_idt98']")));
		driver.findElement(By.xpath("//*[@id='j_idt88:j_idt98']")).click();
		
		
		
		
		
		
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Alertsconcepts A = new Alertsconcepts();
		A.alertImplementation();
	}

}
