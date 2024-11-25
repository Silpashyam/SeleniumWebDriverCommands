package optionsandprofiling;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.ProfilesIni;
import org.testng.annotations.Test;

public class FirefoxProfilingAndOptions {

	// set binary
	// notifications
	// maximize the browsers
	// certificate errors
	// work with proxy
	// page load stratergy
	
	@Test
	public void firefox() {
		
		
		System.setProperty("webdriver.gecko.driver", "D:\\drivers\\geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE, "logs\\firefox.log");
		FirefoxOptions options  = new FirefoxOptions();
		//options.setPageLoadStrategy(strategy)
		//options.setBinary("C:\\Program Files\\Mozilla Firefox\\firefox.exe");
		ProfilesIni allProf = new ProfilesIni(); // all the profiles
		FirefoxProfile prof = allProf.getProfile("june2020");
		// notification
		prof.setPreference("dom.webnotifications.enabled", false);
		//ssl
		prof.setAcceptUntrustedCertificates(true);
		prof.setAssumeUntrustedCertificateIssuer(false);
		// proxy
		prof.setPreference("network.proxy.type", 1);
		prof.setPreference("network.proxy.socks", "83.778.87.11");
		prof.setPreference("network.proxy.socks_port", 1827);
		options.setProfile(prof);
		
		
		FirefoxDriver fd = new FirefoxDriver(options); // new profile
		//fd.get("http://pushengage.com/demo");
		fd.get("https://expired.badssl.com/");
		
	}
}
