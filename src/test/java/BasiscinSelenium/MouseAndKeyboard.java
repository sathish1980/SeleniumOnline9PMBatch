package BasiscinSelenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseAndKeyboard {
	
	public void Mouseimplementation() throws InterruptedException
	{
		
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ebay.com/");
		Actions mouseaction = new Actions(driver);
		mouseaction.moveToElement(driver.findElement(By.xpath("//*[text()='Electronics']//parent::li"))).perform();
		Thread.sleep(1000);
		mouseaction.moveToElement(driver.findElement(By.xpath("//*[text()='Computers and tablets']//parent::li"))).click().perform();
	}
	
	public void testcase2()
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Actions mouseaction = new Actions(driver);
		mouseaction.moveToElement(driver.findElement(By.id("email"))).sendKeys("sathish").doubleClick().contextClick().perform();
		
	}
	
	public void DragAndDrop()
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/drag.xhtml");
		Actions mouseaction = new Actions(driver);
		mouseaction.moveToElement(driver.findElement(By.id("form:drag_content"))).dragAndDrop(driver.findElement(By.id("form:drag_content")), driver.findElement(By.id("form:drop_header"))).perform();
		
	}
	
	public void mouseandkeyboardoperations()
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Actions mouseaction = new Actions(driver);
		mouseaction.moveToElement(driver.findElement(By.id("email"))).sendKeys("sathish").perform();
		mouseaction.keyDown(Keys.TAB).keyUp(Keys.TAB).perform();
		mouseaction.keyDown(Keys.SHIFT).keyDown(Keys.TAB).keyUp(Keys.SHIFT).keyUp(Keys.TAB).perform();
	}
	
	public void Keyboard() throws AWTException
	{
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Actions mouseaction = new Actions(driver);
		mouseaction.moveToElement(driver.findElement(By.id("email"))).sendKeys("sathish").doubleClick().contextClick().perform();
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		r.keyPress(KeyEvent.VK_TAB);
		r.keyRelease(KeyEvent.VK_TAB);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		
	}
	

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		MouseAndKeyboard M = new MouseAndKeyboard();
		M.Keyboard();
	}

}
