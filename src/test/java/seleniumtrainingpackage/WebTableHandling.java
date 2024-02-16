package seleniumtrainingpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String currDir = System.getProperty("user.dir");
		System.setProperty("webdriver.gecko.driver", currDir+"\\drivers\\geckodriver.exe");//windows
		
		String columnXpath = "/html/body/table/tbody/tr[1]/th"; 
	    String rowXpath = "/html/body/table/tbody/tr/td[1]"; 
	    
	    WebDriver driver = new FirefoxDriver();
	    driver.get("file:///C:/Shailaja/TestingFiles/DynamicTable.html");
	    
	    List<WebElement> col = driver.findElements(By.xpath(columnXpath)); 
	    System.out.println("No of columns : " + col.size()); 

    // Number of rows 
	    List<WebElement> rows = driver.findElements(By.xpath(rowXpath)); 
    	System.out.println("No of rows : " + rows.size()); 
    	driver.close(); 
	}

}
