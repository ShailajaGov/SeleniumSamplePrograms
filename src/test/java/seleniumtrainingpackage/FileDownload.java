package seleniumtrainingpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileDownload {

	public static void main(String[] args) {
		
		FirefoxProfile prof = new FirefoxProfile();

		//Case:1 - Use this case to set download this code to your browser's default location
		//prof.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");

		//Case:2 - Download file to Desktop
		//prof.setPreference("browser.download.folderList", 0);
		//prof.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");

		//Case:3 - Download to custom folder path. Replace d:\\selenium with your Download Location 
		prof.setPreference("browser.download.dir","C:\\Shailaja\\TestingFiles\\");
		prof.setPreference("browser.download.folderList", 2);
		prof.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		
		FirefoxOptions options= new FirefoxOptions();
		options.setProfile(prof);

		//This will work for all cases mentioned above
		WebDriver driver = new FirefoxDriver(options);
		driver.get("http://docs.seleniumhq.org/download/");
		//GitHub repository
		 driver.findElement(By.linkText("64 bit Windows IE")).click();
	}

}
