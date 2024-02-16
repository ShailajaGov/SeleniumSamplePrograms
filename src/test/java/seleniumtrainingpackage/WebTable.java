package seleniumtrainingpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable {

	public static void main(String[] args) {
		
		
		String currDir = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", currDir+"\\drivers\\geckodriver.exe");//windows
		WebDriver driver = new FirefoxDriver();
	    driver.get("file:///C:/Shailaja/TestingFiles/WebTable.html");
	    
	    List<WebElement> costCells = driver.findElements(By.xpath("/html/body/table/tbody/tr/td[4]"));
	    
	    System.out.println( costCells.get(0).getText());
	    
	    int totalSum =0;
	    
	    for(WebElement cost :costCells )
	    {
	    	totalSum = totalSum + Integer.parseInt(cost.getText());
	    }
	    
	    System.out.println(totalSum);
	    

	}

}
