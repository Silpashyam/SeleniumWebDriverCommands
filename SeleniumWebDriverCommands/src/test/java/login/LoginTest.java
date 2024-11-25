package login;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import base.TestBase;

public class LoginTest extends TestBase{

	
	@Test
	public void login() {
		WebDriver driver = launchBrowser("Chrome");
		driver.get("http://yahoo.com");
		
		
	}
}
