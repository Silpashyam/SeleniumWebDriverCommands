package explicitwait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.TestBase;
// UFT - 
public class Waiting extends TestBase{
	
	@Test
	public void waitTest() throws InterruptedException {
		WebDriver driver = launchBrowser("Chrome");
		driver.get("https://www.awwwards.com/sites/khoa-le");
		// not loaded 
		driver.findElement(By.xpath("//*[@id='header']/div/div[2]/div[2]/strong/a")).click();
		// 2 secs to load full, 1 sec
		//Thread.sleep(4000);
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name("_username")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("_username")));
		wait.until(ExpectedConditions.elementToBeClickable(By.name("_username")));
		if(isElementPresent("//input[@name='_username']"))
			driver.findElement(By.name("_username")).sendKeys("abc");// StaleElement ,Elementnotinteractable
	}
	
	
	public boolean isElementPresent(String elementXpath) {// only for xpath 
		
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(elementXpath)));
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(elementXpath)));
			wait.until(ExpectedConditions.elementToBeClickable(By.xpath(elementXpath)));
		}catch(Exception e) {
			return false;
		}
		
		return true;
   }


}
