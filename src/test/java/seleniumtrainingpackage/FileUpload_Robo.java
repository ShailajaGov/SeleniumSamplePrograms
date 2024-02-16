package seleniumtrainingpackage;

import java.awt.AWTException;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.util.concurrent.TimeUnit;
import java.awt.Robot;
 
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
 
import  java.awt.event.KeyEvent;
import java.time.Duration;
 
 
public class FileUpload_Robo {
 
    public static void main(String[] args) throws InterruptedException, AWTException {
    // TODO Auto-generated method stub
 
    WebDriver drv = new FirefoxDriver(); // starting Firefox browser
    drv.manage().window().maximize(); // maximizing window
    drv.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));//for page load
    drv.get("https://www.grammarly.com/plagiarism-checker");//open testing website
    drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// for Implicit wait
 
    JavascriptExecutor js = (JavascriptExecutor)drv; // Scroll operation using Js Executor
    js.executeScript("window.scrollBy(0,200)"); // Scroll Down(+ve) upto browse option
    Thread.sleep(2000); // suspending execution for specified time period
 
     WebElement browse = drv.findElement(By.xpath("//span[text() = 'Upload a file']"));
     // using linkText, to click on browse element 
    browse.click(); // Click on browse option on the webpage
    Thread.sleep(2000); // suspending execution for specified time period
 
    // creating object of Robot class
    Robot rb = new Robot();
 
    // copying File path to Clipboard imitates Ctrl+C 
   
    StringSelection str = new StringSelection(" C:\\Shailaja\\TestingFiles\\FileUpload.txt");//C:\\Users\\Chait\\Desktop\\File upload.docx
    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
 
//    robot.keyPress(KeyEvent.VK_ENTER);
//    robot.keyRelease(KeyEvent.VK_ENTER);
    
    
     // press Contol+V keys for pasting
     rb.keyPress(KeyEvent.VK_CONTROL);
     rb.keyPress(KeyEvent.VK_V);
 
    // release Contol+V keys for pasting
    rb.keyRelease(KeyEvent.VK_CONTROL);
    rb.keyRelease(KeyEvent.VK_V);
    Thread.sleep(2000);
    // for pressing and releasing Enter key
    rb.keyPress(KeyEvent.VK_ENTER);
    rb.keyRelease(KeyEvent.VK_ENTER);
   }
 
}




