package downloadandupload;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class IE_Download {
	
	@Test
	public void download() throws NullPointerException, IOException {
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.qtpselenium.com/downloads/download.html");
		String url=driver.findElement(By.linkText("xls download")).getAttribute("href");
		System.out.println(url);
		FileDownloader file = new FileDownloader(driver, "D:\\Common\\temp\\");
		file.downloader(url);
	}

}
