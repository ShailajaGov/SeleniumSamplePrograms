package seleniumtrainingpackage;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HandlingPromptDialogueAlert extends BasicClass {
	
public static void main(String[] args) {
		
		
	HandlingPromptDialogueAlert obj = new HandlingPromptDialogueAlert();
	obj.setupBrowser("edge", "http://omayo.blogspot.com/");
	
	}

public void HandleAlertBox()
{
	driver.findElement(By.xpath("//input[@value='ClickToGetAlert']")).click();
	Alert alert = driver.switchTo().alert();
	alert.accept();
	
}

}
