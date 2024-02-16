package seleniumtrainingpackage;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class EditElementsInTable {
	 static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		
		String currDir = System.getProperty("user.dir");
		System.setProperty("wedriver.gecko.driver", currDir+"\\drivers\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.navigate().to("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCellTable");// https://jqueryui/droppable/
		driver.manage().window().maximize();
		EditElementsInTable obj = new EditElementsInTable();
		obj.setFirstName(0, "Shailaja");
		obj.selectCategory(1, "Family");
		//obj.setFirstName(0, "Shailaja");
		
		//tr.CMWVMEC-i-b:nth-child(1) > td:nth-child(2) > div:nth-child(1)
		
		//tr[__gwt_row='" + rowIndex + "'] > td > div
				
	}
	
	public  void setFirstName(int rowIndex, String firstName)
	{
	    WebElement firstNameElement = new WebDriverWait(driver, Duration.ofSeconds(10))
	            .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("tr[__gwt_row='" + rowIndex + "'] > td > div")))
	            .get(1);
	    firstNameElement.click();
	    firstNameElement.findElement(By.tagName("input")).sendKeys(firstName + Keys.ENTER);
	}
	
	public  void selectCategory(int rowIndex, String category)
	{
		 WebElement categoryElement = new WebDriverWait(driver, Duration.ofSeconds(10))
		            .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("tr[__gwt_row='" + rowIndex + "'] > td > div")))
		            .get(3);
		 (new Select(categoryElement.findElement(By.tagName("select")))).selectByVisibleText(category);
		
		 //Alternate solution
		
//	    WebElement categoryElement = new WebDriverWait(driver, Duration.ofSeconds(10))
//	            .until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector("tr[__gwt_row='" + rowIndex + "'] > td > div > select")))
//	            .get(0);
//	  
//	    Select dropdown = new Select(categoryElement);
//	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//	    dropdown.selectByValue(category);
	}

}
