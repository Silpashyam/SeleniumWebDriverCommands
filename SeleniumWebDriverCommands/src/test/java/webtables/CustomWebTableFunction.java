package webtables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.TestBase;

public class CustomWebTableFunction extends TestBase{
	
	@Test
	public void testTable() {
	  String company="Prism Johnson"; // find the current price
	  launchBrowser("Chrome");
	  driver.get("https://money.rediff.com/gainers/bse/daily/groupa?src=gain_lose");
	  int rowNumber = getRowNumberWithCellData("//table[@class='dataTable']",company,"xpath");
	  
	  Assert.assertTrue(rowNumber != -1, "Company name not found in table - "+ company);
	  
	  String price = driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr["+rowNumber+"]/td[4]")).getText();
	  System.out.println(price);
	  
	}
	// return row number corresponding to data
	// data not found returns -1
	public int getRowNumberWithCellData(String tableLocator , String data,String identifier) {
		List<WebElement> rows = null;
		if(identifier.equals("xpath"))
			rows = driver.findElements(By.xpath(tableLocator+"/tbody/tr"));
		else
			rows = driver.findElements(By.cssSelector(tableLocator+">tbody>tr"));
		
		for(int rNum=0;rNum<rows.size();rNum++) {
			WebElement row = rows.get(rNum);
			List<WebElement> cells = row.findElements(By.tagName("td"));
			for(int cNum=0;cNum<cells.size();cNum++) {
				//System.out.println(cells.get(cNum).getText());
				if(data.equals(cells.get(cNum).getText()))
					return (rNum+1);
					
			}
			//System.out.println("------");
		}
		// no data found
		return -1;
	}
	
	
	
	
	
	
	
	

}
