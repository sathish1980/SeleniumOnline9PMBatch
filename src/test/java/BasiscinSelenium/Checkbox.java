package BasiscinSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Checkbox {

	public void checkboximplementation(String gender) throws InterruptedException
	{
	
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.findElement(By.xpath("//*[@id='j_idt87:j_idt89']//div[contains(@class,'chkbox')]")).click();
		driver.findElement(By.xpath("(//*[@id='j_idt87:basic']//div[contains(@class,'chkbox-box')])[2]")).click();
		String classValue = driver.findElement(By.xpath("(//*[@id='j_idt87:basic']//div[contains(@class,'chkbox-box')])[2]")).getAttribute("class");
		if(classValue.contains("ui-state-active"))
		{
			System.out.println("Check box is clicked sucessfully");
		}
		driver.findElement(By.xpath("(//*[@id='j_idt87:basic']//div[contains(@class,'chkbox-box')])[2]")).click();
		String nextclassValue = driver.findElement(By.xpath("(//*[@id='j_idt87:basic']//div[contains(@class,'chkbox-box')])[2]")).getAttribute("class");
		if(!nextclassValue.contains("ui-state-active"))
		{
			System.out.println("Check box is un clicked sucessfully");
		}
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Checkbox c = new Checkbox();
		c.checkboximplementation(null);
	}

}
