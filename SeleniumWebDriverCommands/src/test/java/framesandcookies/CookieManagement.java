package framesandcookies;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class CookieManagement {

	public static void main(String[] args) {
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "null");
		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://cnn.com");
		
		Set<Cookie> cookies= driver.manage().getCookies();// get all cookies in set
		
		Iterator<Cookie> it = cookies.iterator();
		
		while(it.hasNext()){
			Cookie c = it.next();
			System.out.println(c.getName()+" --- "+ c.getValue());
			if(c.getName().equals("countryCode")){
				driver.manage().deleteCookie(c);// delete cookie
				Cookie mycookie = new Cookie("countryCode", "UK");
				driver.manage().addCookie(mycookie);// add cookie
			}
		}
		
		System.out.println("--------------------------");
		
		cookies= driver.manage().getCookies();
		
	     it = cookies.iterator();
		
		while(it.hasNext()){
			Cookie c = it.next();
			System.out.println(c.getName()+" --- "+ c.getValue());
			if(c.getName().equals("countryCode")){
				driver.manage().deleteCookie(c);
			}
		}
		
	}

}
