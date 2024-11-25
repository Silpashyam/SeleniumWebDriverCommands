package cssselectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.TestBase;

public class UnderstadingClassName  extends  TestBase{
	
	@Test
	public void testApp() {
		WebDriver driver = launchBrowser("Chrome");
		driver.get("http://flipkart.com");
		//driver.findElement(By.className("_2zrpKA _1dBPDZ")).sendKeys("abc");
		driver.findElement(By.xpath("//input[@class='_2zrpKA _1dBPDZ']")).sendKeys("hello");
		
	}

}
