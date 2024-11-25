package optionsandprofiling;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class ChromeProfilingAndOptions {
	
	@Test
	public void chrome() {
		System.setProperty("webdriver.chrome.driver", "D:\\drivers\\chromedriver.exe");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_LOG_PROPERTY, "logs\\chrome.log");
		System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
		
		ChromeOptions ops = new ChromeOptions();
		//ops.setBinary("");
		//ops.setPageLoadStrategy(strategy)
		ops.addArguments("--disable-notifications");
		ops.addArguments("--start-maximized");
		ops.addArguments("ignore-certificate-errors");
		//ops.addArguments("--proxy-server=http://89.2872.292.2:9090");
		
		ops.addArguments("user-data-dir=C:\\Users\\info\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 1");
		
		
		
		
		
		ChromeDriver cd = new ChromeDriver(ops);
		cd.get("http://pushengage.com/demo");
		// 100 lines
		
	}

}
