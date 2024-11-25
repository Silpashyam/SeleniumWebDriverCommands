package framesandcookies;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.TestBase;

public class Google extends TestBase{
	
	@Test
	public void paytm() throws InterruptedException {
		
		launchBrowser("Chrome");
		driver.get("http://google.com");
		driver.findElement(By.name("q")).sendKeys("hello");
		
	}

}
