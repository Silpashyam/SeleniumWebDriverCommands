package jsandactions;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import base.TestBase;

public class Americangolf extends TestBase{
	
	@Test
	public void testAmericanGolf() throws InterruptedException {
		launchBrowser("Chrome");
		driver.get("http://americangolf.co.uk");// window.location
		WebElement golfClubs=driver.findElement(By.xpath("//*[@id='header-navigation']/div[1]/ul/li[2]/a"));
		Actions act = new Actions(driver);
		act.moveToElement(golfClubs).build().perform();// moves mouse to element
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='CLUBS_1']/ul/li[3]/ul/li/a/span")));
		//driver.findElement(By.xpath("//*[@id='CLUBS_1']/ul/li[3]/ul/li/a/span")).click();
		List<WebElement> links = driver.findElements(By.xpath("//div[@id='CLUBS_1']/descendant::a"));
		Random r = new Random();
		int i = r.nextInt(links.size());
		links.get(i).click(); //  random link
		
		waitForPageToLoad();
		WebElement e = driver.findElements(By.xpath("//div[@class='noUi-handle noUi-handle-lower']")).get(1);
		// scroll to element
		int y=e.getLocation().y;
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollTo(0,"+(y-50)+")");
		act.clickAndHold(e).moveByOffset(100, 0).release().build().perform();
		
		
		
	}
	public void waitForPageToLoad() throws InterruptedException{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		int i=0;
		// page to load 100% -- wait for max 20 secs
		while(i!=10){
			String state = (String)js.executeScript("return document.readyState;");
			System.out.println(state);// complete, loading, interactive
	
			if(state.equals("complete"))
				break;
			else
				Thread.sleep(2000);
	
			i++;
		}
		// check for jquery/ajax status
		
		i=0;
		while(i!=10){

			Long d= (Long) js.executeScript("return jQuery.active;");
			System.out.println(d);//0,1
			if(d.longValue() == 0 )
				break;
			else
				Thread.sleep(2000);
			i++;

		}
		
	}

}
