package downloadandupload;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.xml.LaunchSuite;

import base.TestBase;

public class Facebook extends TestBase{

	@Test
	public void testApp() throws IOException {
		launchBrowser("Chrome");
		driver.get("http://facebook.com");
		driver.findElement(By.xpath("//*[@id='email']")).sendKeys("its.thakur@gmail.com");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys("Learning@123");
		driver.findElement(By.xpath("//*[@id='pass']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//div[text()='Ashish Thakur']")).click();
	
		driver.findElement(By.xpath("//div[@aria-label='Update profile picture']")).click();
		driver.findElement(By.xpath("//div[@aria-label='Upload Photo']")).click();
		
		new ProcessBuilder(System.getProperty("user.dir")+"//autoit//Facebook.exe").start();
	}
}
