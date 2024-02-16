package seleniumtrainingpackage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownInterations {

	//@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriver driver;
		
		String currDir = System.getProperty("user.dir");
		
		System.setProperty("webdriver.gecko.driver", currDir+"\\drivers\\geckodriver.exe");
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.navigate().to("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text() = 'Create new account']")).click();
		WebElement element = driver.findElement(By.xpath("//select[@id='month' and @name='birthday_month']"));
		
		Select dropdown = new Select(element);
		dropdown.selectByVisibleText("Jun");
		
		System.out.println("The Output of the IsSelected " + element.isSelected());
		System.out.println("The Output of the IsEnabled " + element.isEnabled());
		System.out.println("The Output of the IsDisplayed " + element.isDisplayed());
		
		driver.close();
	}

}
