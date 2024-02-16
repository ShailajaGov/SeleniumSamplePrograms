package seleniumtrainingpackage;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver; 
import java.awt.*; 
import java.awt.event.KeyEvent; 

public class HandleSelfSignedCertificatePopup{

	WebDriver driver;
	
	public static void main(String[] args) {
		
		HandleSelfSignedCertificatePopup obj=new HandleSelfSignedCertificatePopup();
		obj.startExecution();
		
		
	}
	public  void startExecution() {
		
		String currDir = System.getProperty("user.dir");

		System.setProperty("webdriver.gecko.driver", currDir + "\\drivers\\geckodriver.exe");

		driver = new FirefoxDriver();
		
		driver.manage().window().maximize(); 
		
		driver.get("https://google.com");
		
		  try { 
			  t1.start(); 
			  t2.start();
		  
			  t1.join(); 
			  t2.join(); } catch (InterruptedException e) {
		  
		  e.printStackTrace(); }
		 
	}
	
	Thread t1 = new Thread(new Runnable() {

		@Override
		public void run() {
			driver.get("https://google.com"); 
			
		}
	
	});
	
	Thread t2 = new Thread(new Runnable() {

		@Override
		public void run() {
			
			 try { 
	                // Use a sleep of 5 secs for 
	                // the self signed pop up tp appear. 
	                Thread.sleep(5000); 
	                Robot robot = new Robot(); 
	                // Click on Enter button using Robot class 
	                // Clicking on Enter button because the assumption 
	                // is the focus would be on "OK" button 
	                // If the focus is no on "OK" button we can code 
	                // to click on TAB and move the focus on "OK" 
	                // button and click on Enter button using Robot class 
	                robot.keyPress(KeyEvent.VK_ENTER); 
	            } 
	            catch (InterruptedException e) { 
	                throw new RuntimeException(e); 
	            } 
	            catch (AWTException e) { 
	                throw new RuntimeException(e); 
	            } 
			
		}
		
	});

}
