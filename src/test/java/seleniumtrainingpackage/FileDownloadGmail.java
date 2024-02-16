package seleniumtrainingpackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadGmail {

	public static void main(String[] args) throws InterruptedException {
		WebDriver drv = new FirefoxDriver(); // starting Firefox browser
	    drv.manage().window().maximize(); // maximizing window
	    drv.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));//for page load
	    drv.get("https://www.gmail.com");//open testing website
	    //drv.findElement(null)
	    Thread.sleep(7000);
	    drv.findElement(By.xpath("//*[@id=\"identifierId\"]")).sendKeys("shailaja.sireesh@gmail.com");//("//*[@id=\"identifierId\"]")
	    
	    drv.findElement(By.xpath("//span[text() = 'Next'] ")).click();
	    Thread.sleep(7000);
	}

}
