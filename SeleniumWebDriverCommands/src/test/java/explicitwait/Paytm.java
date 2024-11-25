package explicitwait;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.TestBase;

public class Paytm extends TestBase{
	
	@Test
	public void paytm() throws InterruptedException {
		WebDriver driver = launchBrowser("Chrome");
		driver.get("https://paytm.com");
		// delay - for the link to ready
		Thread.sleep(3000);
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='app']/div/div[2]/div[2]/div[3]/div[4]/div")));
				
		driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[2]/div[3]/div[4]/div")).click();
	}

}
