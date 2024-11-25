package downloadandupload;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import base.TestBase;

public class UploadingFiles extends TestBase{
	
	@Test
	public void uploading() {
		launchBrowser("Chrome");
		driver.get("http://files.form.guide/contact-form/contact-form-attachment-1/contactform.php");
		driver.findElement(By.id("photo")).sendKeys("D:\\menu.jpg");
	}

}
