package xpaths;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.TestBase;

public class Flipkart extends TestBase{
	
	@Test
	public void login() {
		WebDriver driver = launchBrowser("Chrome");
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//form[@autocomplete='on']/div[2]/input")).sendKeys("hello");
	}

}
