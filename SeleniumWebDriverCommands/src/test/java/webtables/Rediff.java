package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.TestBase;

public class Rediff extends TestBase{
	
	@Test
	public void testTable() {
	  String company="Prism Johnson"; // find the current price
	  
	  WebDriver driver = launchBrowser("Chrome");
	  driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
	  
	  List<WebElement> names = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
	  List<WebElement> prices = driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
	  System.out.println("Total companies "+ names.size());
	  System.out.println("Total prices "+ prices.size());
	  
	  for(int i=0;i<names.size();i++) {
		  if(company.equals(names.get(i).getText())) {
			  System.out.println(names.get(i).getText()+" -- "+ prices.get(i).getText());
			  break;
		  }
	  }
	
	  
	  
	  
	  
	  
	}
	

}
