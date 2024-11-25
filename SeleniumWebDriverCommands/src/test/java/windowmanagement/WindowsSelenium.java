package windowmanagement;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;

import base.TestBase;

public class WindowsSelenium extends TestBase{
	
	@Test
	public void testWindows() throws InterruptedException {
		WebDriver driver  = launchBrowser("Chrome");
		//driver.switchTo().newWindow(WindowType.TAB);
		//1 window
		Set<String> s = driver.getWindowHandles();
		System.out.println("Total windows "+ s.size());
		Iterator<String> it = s.iterator();
		System.out.println(it.next()); // main window ID
		
		//driver.switchTo().window(nameOrHandle)
		driver.get("http://naukri.com");
		//3 windows
		Thread.sleep(2000);
		s = driver.getWindowHandles();// ordered set
		System.out.println("Total windows "+ s.size());
		it = s.iterator();
		if(s.size()>1) {
			String mainWindow = it.next(); 
			String popup1 = it.next(); 
			String popup2 = it.next();
			System.out.println(mainWindow);
			System.out.println(popup1);
			System.out.println(popup2);
			
			driver.switchTo().window(popup1);
			driver.close();
			driver.switchTo().window(popup2);
			driver.close();// close window under focus
			driver.switchTo().window(mainWindow);
			//driver.switchTo().defaultContent();
			driver.quit();// close all windows and end selenium session
		}
	}

}
