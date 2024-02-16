package seleniumtrainingpackage;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingContextMenu {

	public static void main(String[] args) throws InterruptedException, AWTException {
		WebDriver drv = new FirefoxDriver(); // starting Firefox browser
	    drv.manage().window().maximize(); // maximizing window
	    drv.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));//for page load
	    drv.get("http://google.com");//open testing website
	    drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// for Implicit wait

	    WebElement ele= drv.findElement(By.xpath("//span[text()='Sign in']"));
	    
	    Actions action = new Actions(drv);
	    drv.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	    action.contextClick(ele).build().perform();
	    //action.contextClick().build().perform();
	    
	    Robot robot = new Robot();
	    robot.keyPress(KeyEvent.VK_DOWN);
	    robot.keyRelease(KeyEvent.VK_DOWN);
	    drv.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));// for Implicit wait
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    Thread.sleep(5000);
	    drv.quit();
	}

}
