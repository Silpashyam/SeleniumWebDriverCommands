package optionsandprofiling;



import org.openqa.selenium.Keys;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.Proxy;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverService;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class EdgeDriverSel {
	// pre requisites - careful with edge version
	// logs
	// page load strategy
	// binary 
	// PROXY	
	// Profiling - NO
	// Notifications
	// certificate
	 
	
	public static void main(String[] args) {
		// 
		//System.setProperty("webdriver.edge.driver", "D:\\Common\\drivers\\MicrosoftWebDriver.exe");
		System.setProperty(EdgeDriverService.EDGE_DRIVER_LOG_PROPERTY,"logs\\edge.log");
		//System.setProperty(EdgeDriverService.EDGE_DRIVER_SILENT_OUTPUT_PROPERTY,"true");
		System.setProperty("webdriver.edge.driver", "D:\\drivers\\msedgedriver.exe");
		
		EdgeOptions options = new EdgeOptions();
		//options.setBinary(new File(""));
		options.addArguments("--disable-notifications");
		options.addArguments("--start-maximized");
		//options.addArguments("--proxy-server=http://83.209.94.87:8123");
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("ignore-certificate-errors");
		
		// NOTIFICATIONS and PROFILE
		
		
		EdgeDriver driver = new EdgeDriver(options);// make sure previous session is closed
		//driver.get("https://www.pushengage.com/demo");
		driver.get("https://untrusted-root.badssl.com/");
		//driver.manage().window().maximize();
			
		/*	
		// cert
		driver.get("https://192.163.254.17:2083/");
		//2 line code
		driver.findElement(By.id("moreInformationDropdownSpan")).click();
		driver.findElement(By.id("invalidcert_continue")).click();
		
	
		driver.get("http://facebook.com");
		driver.findElement(By.name("email")).clear();
		driver.findElement(By.name("email")).sendKeys("its.thakur@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("Jungle@123");
		driver.findElement(By.name("pass")).sendKeys(Keys.ENTER);
		*/
	
	}

}
