package webelementfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.TestBase;

public class CNN extends TestBase{
	
	@Test
	public void cnn() {

			WebDriver driver = launchBrowser("Chrome");
			driver.get("http://cnn.com");
			boolean result = driver.findElement(By.xpath("//*[@id='header-nav-container']/div/div[2]/div/div[3]/nav/ul/li[3]/ul/li[1]/a")).isDisplayed();
			System.out.println(result);
			// click - visible
			driver.findElement(By.xpath("//*[@id='header-nav-container']/div/div[1]/div/button/svg")).click();

			result = driver.findElement(By.cssSelector("svg.menu-icon")).isDisplayed();
			System.out.println(result);
			
			driver.findElement(By.xpath("//*[@id='header-nav-container']/div/div[2]/div/div[3]/nav/ul/li[3]/ul/li[1]/a")).click();
	}
}
