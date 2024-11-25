package explicitwait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.TestBase;

public class Zoho extends TestBase{
	
	@Test
	public void appTest() throws InterruptedException {
		WebDriver driver = launchBrowser("Chrome");
		driver.get("https://www.zoho.com/signup.html");
		//Thread.sleep(5000);
		boolean b = driver.findElement(By.xpath("//input[@id='tos']")).isEnabled();
		System.out.println(b);
		// Thread.sleep(2)
		// WebDriverWait - explicit
		
		int i=1;
		while(i<=10) {// max 10 secs
			if(driver.findElement(By.xpath("//input[@id='tos']")).isEnabled())
				break;
			else {
				Thread.sleep(1000);
				i++;
			}
		}
		
		//WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='tos']")));
		//wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='tos']")));
		
		
		driver.findElement(By.xpath("//input[@id='tos']")).click();
		driver.findElement(By.id("emailfield")).sendKeys("hello");
		//driver.findElement(By.id("emailfield")).clear();
		String text = driver.findElement(By.xpath("//h3")).getText();
		System.out.println(text);
		text = driver.findElement(By.id("emailfield")).getAttribute("value");
		System.out.println("Value of text field "+ text);
		text = driver.findElement(By.id("signupbtn")).getAttribute("value");
		System.out.println(text);
		text = driver.findElement(By.xpath("//input[@id='tos']")).getAttribute("checked");
		System.out.println(text);
		
		
		
	}

}
