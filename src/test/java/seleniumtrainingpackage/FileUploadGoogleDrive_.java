package seleniumtrainingpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadGoogleDrive_ {

	public static void main(String[] args) throws InterruptedException, AWTException {
	    // TODO Auto-generated method stub
		
	    WebDriver drv = new FirefoxDriver(); // starting Firefox browser
	    drv.manage().window().maximize(); // maximizing window
	    drv.manage().timeouts().pageLoadTimeout(10, TimeUnit. SECONDS);//for page load
	    drv.get("https://www.google.com/drive");//open testing website
	    drv.manage().timeouts().implicitlyWait(10, TimeUnit. SECONDS);// for Implicit wait
	 
//	    JavascriptExecutor js = (JavascriptExecutor)drv; // Scroll operation using Js Executor
//	    js.executeScript("window.scrollBy(0,200)"); // Scroll Down(+ve) upto browse option
//	    Thread.sleep(2000); // suspending execution for specified time period
	    
	    
	    drv.findElement(By.linkText("Go to Drive")).click();
	   // drv.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
	    //drv.manage().timeouts().implicitlyWait(10, TimeUnit. SECONDS);// for Implicit wait
	    drv.switchTo().activeElement().sendKeys("shailaja.sireesh@gmail.com");
	   // drv.findElement(By.xpath("//input[@type = 'email']")).sendKeys("shailaja.sireesh@gmail.com");
	    drv.findElement(By.xpath("//span[text() = 'Next']")).click();
	    drv.findElement(By.xpath("//input[@type = 'password']")).sendKeys("GShailaja1979");
	    drv.findElement(By.xpath("//button[text() = 'New']"));
	 
	     WebElement browse = drv.findElement(By.xpath("//span[text() = 'Upload a file']"));
	     // using linkText, to click on browse element 
	    browse.click(); // Click on browse option on the webpage
	    Thread.sleep(2000); // suspending execution for specified time period
	 
	    // creating object of Robot class
	    Robot rb = new Robot();
	 
	    // copying File path to Clipboard
	   
	    StringSelection str = new StringSelection(" C:\\Shailaja\\TestingFiles\\FileUpload.txt");//C:\\Users\\Chait\\Desktop\\File upload.docx
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
	 
	     // press Contol+V for pasting
	     rb.keyPress(KeyEvent.VK_CONTROL);
	     rb.keyPress(KeyEvent.VK_V);
	 
	    // release Contol+V for pasting
	    rb.keyRelease(KeyEvent.VK_CONTROL);
	    rb.keyRelease(KeyEvent.VK_V);
	 
	    // for pressing and releasing Enter
	    rb.keyPress(KeyEvent.VK_ENTER);
	    rb.keyRelease(KeyEvent.VK_ENTER);
	   }
}
