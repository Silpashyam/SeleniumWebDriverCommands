package implicitwait;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import base.TestBase;

public class WaitingExample extends TestBase{
	@Test
	public void linkedIn() throws InterruptedException {
		WebDriver driver = launchBrowser("Chrome");
		driver.get("https://www.linkedin.com/login?fromSignsession_passwordIn=true&trk=guest_homepage-basic_nav-header-signin");
		
		// wait for sometime
		driver.findElement(By.id("usernameXX")).sendKeys("xyz");;
		driver.findElement(By.id("password")).sendKeys("xyz");;
	}
}
