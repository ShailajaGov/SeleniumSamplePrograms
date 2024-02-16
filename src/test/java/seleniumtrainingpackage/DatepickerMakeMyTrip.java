package seleniumtrainingpackage;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DatepickerMakeMyTrip {
	
	public static void main(String[] args) {
	
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.makemytrip.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//span[ text() = 'Departure']")).click();
		
		for(int i= 0 ;i<5;i++)
		{
			driver.findElement(By.xpath("//span[@class = 'DayPicker-NavButton DayPicker-NavButton--next']")).click();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
		}
		String day = "19";
		
		driver.findElement(By.xpath("//p[ text() ='"+day+"']")).click();
	}

}
