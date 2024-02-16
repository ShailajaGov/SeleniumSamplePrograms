package seleniumtrainingpackage;

import java.awt.AWTException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingDatePicker {

	static int targetMonth = 0,targetDay =0,targetYear =0;
	static int currentMonth = 0,currentDay= 0,currentYear = 0;
	static int jumpToMonth = 0;
	static boolean increment = true;
	public static WebDriver driver;
	//WebDriver driver;
	
	public static void main(String[] args) {
		
		String dateToSet = "06/26/2024";
		getCurrentDateMonthAndYear();
		System.out.println(currentDay +" "+currentMonth+" " +currentYear);
		getTargetDayMonthAndYear(dateToSet);
		calculateHowManyMonthsToJump();
		
		//WebDriverManager. 
		selectDate();
		

	}


	private static void selectDate() {
		
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryui.com/datepicker/");
		driver.switchTo().frame( driver.findElement(By.xpath("//iframe[@class = 'demo-frame']")));
		driver.findElement(By.xpath("//input[@id = 'datepicker']")).click();
		
		for(int i = 0;i<jumpToMonth;i++)
		{
			if(increment)
			{
				driver.findElement(By.xpath("//span[@class = 'ui-icon ui-icon-circle-triangle-e']")).click();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			}
			else
			{
				driver.findElement(By.xpath("//span[@class = 'ui-icon ui-icon-circle-triangle-w']")).click();
			}
		}
		
		driver.findElement(By.linkText(Integer.toString(targetDay))).click();
	}


	private static void calculateHowManyMonthsToJump() {
		if((targetMonth - currentMonth)> 0)
		{
			jumpToMonth = targetMonth - currentMonth;
		}
		else
		{
			jumpToMonth = currentMonth - targetMonth;
			increment = false;
		}
		
	}


	private static void getTargetDayMonthAndYear(String dateToSet) {
		// TODO Auto-generated method stub
		String split[]= dateToSet.split("/");
		targetDay = Integer.parseInt(split[1]);
		targetMonth = Integer.parseInt(split[0]);
		targetYear = Integer.parseInt(split[2]);
		
		System.out.println(targetDay +" "+targetMonth+" " +targetYear);
		
	}


	private static void getCurrentDateMonthAndYear() {
		// TODO Auto-generated method stub
		Calendar cal= Calendar.getInstance();
		currentDay = cal.get(Calendar.DAY_OF_MONTH);
		currentMonth =cal.get(Calendar.MONTH)+1;
		currentYear =cal.get( Calendar.YEAR);
	}
	

}
