package browsers;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class SeleniumBasics {
	// session not created exception
	@Test
	public void testApp() {
		// latest and the right chromedriver.exe
		//System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		ChromeDriver cd = new ChromeDriver();
		cd.get("http://yahoo.com");
		
		// version of firefox  - turn off the automatic update
		//System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
		FirefoxDriver fd = new FirefoxDriver();
		fd.get("http://cnn.com");
		
		
		// zoom - 100%
		// protected mode is off for all 4
		// security - all active content
		//System.setProperty("webdriver.ie.driver", "D:\\drivers\\IEDriverServer.exe");
		//InternetExplorerDriver ie =  new InternetExplorerDriver();
		//ie.get("http://google.com");
		 
		//System.setProperty("webdriver.edge.driver", "D:\\drivers\\msedgedriver.exe");
		EdgeDriver ed = new EdgeDriver();
		ed.get("http://yahoo.com");
		
		
		
		
		
	}

}
