package BasiscinSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CreateAccount {
	
	public void caccount() throws InterruptedException
	{
	
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.cssSelector("a[data-testid='open-registration-form-button']")).click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		// Thread.sleep(2000);
		driver.findElement(By.name("firstname")).sendKeys("sathish");
		driver.findElement(By.name("lastname")).sendKeys("kumar");
		driver.findElement(By.name("reg_email__")).sendKeys("kumar.sathish189@gmail.com");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("reg_email_confirmation__"))));
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("kumar.sathish189@gmail.com");
		
	}
	
	public void explictwait()
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/messages.xhtml");
		driver.findElement(By.id("j_idt94:j_idt95")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("ui-growl-message")));
		String text = driver.findElement(By.cssSelector("[class='ui-growl-message']>p")).getText();
		System.out.println(text);
		
		
	}
	
	public void explictwaittilltext()
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/drag.xhtml");
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//vertical scroll down
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
		driver.findElement(By.id("form:j_idt119")).click();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(60));
		wait.until(ExpectedConditions.textToBePresentInElementLocated(By.xpath("//*[@class='ui-progressbar-label']"),"100%"));
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.className("ui-growl-message")));
		String text = driver.findElement(By.cssSelector("[class='ui-growl-message']>span")).getText();
		System.out.println(text);
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		CreateAccount C = new CreateAccount();
		C.caccount();
	}

}
