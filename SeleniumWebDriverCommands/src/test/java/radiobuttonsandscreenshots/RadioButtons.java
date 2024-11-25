package radiobuttonsandscreenshots;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import base.TestBase;

public class RadioButtons extends TestBase{
// select
// which is selected
	//https://patient.labcorp.com/registration
	//input.ng-touched.ng-dirty.ng-valid
	//label[text()='Female']/preceding-sibling::input
	@Test
	public void radio() {
		launchBrowser("Chrome");
		driver.get("https://www.chabadpotomac.com/templates/articlecco_cdo/aid/1094542/jewish/HS-Registration-Form-New-Student.htm");
		List<WebElement> radios = driver.findElements(By.name("reading_proficiency"));
		System.out.println("Total radio buttons " + radios.size());
		System.out.println(radios.get(0).getAttribute("checked"));
		System.out.println(radios.get(1).getAttribute("checked"));
		System.out.println(radios.get(2).getAttribute(""));
		radios.get(0).click();
		System.out.println(radios.get(0).getAttribute("checked"));
		System.out.println(radios.get(1).getAttribute("checked"));
		System.out.println(radios.get(2).getAttribute("checked"));
		
	}
	
	
}
