package seleniumtrainingpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.Action;

public class DragAndDrop {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		WebDriver driver;
		
		String currDir = System.getProperty("user.dir");
		System.setProperty("wedriver.gecko.driver", currDir+"\\drivers\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("https://www.jqueryui.com/droppable");// https://jqueryui/droppable/
		driver.manage().window().maximize();
		
//		WebElement draggable = driver.findElement(By.xpath("//div[@id='draggable']"));
//		WebElement droppable = driver.findElement(By.xpath("//div[@id='droppable']"));
		
		
		//demo-frame
		WebElement frame = driver.findElement(By.xpath("//iframe[@class = 'demo-frame']"));// xpath expression : //*[@id =\"content\"]/iframe
		driver.switchTo().frame(frame);
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
				
		
		Actions builder = new Actions(driver);
	   // Action dragAndDrop = builder.clickAndHold(draggable).moveToElement(droppable).release(droppable).build();
		
		builder.dragAndDrop(draggable, droppable).perform();
		
		///html/body/div/div[2]/div/div[1]/iframe
		
		///html/body/div/div[2]/div/div[1]/iframe
	}

}
