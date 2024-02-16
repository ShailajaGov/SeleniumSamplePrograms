package seleniumtrainingpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BasicClass {
	
	WebDriver driver;
	
	public void setupBrowser(String browser,String url)
	{
		String currDir = System.getProperty("user.dir");
		
				
		if(browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", currDir+"\\drivers\\chromedriver.exe");//windows
			//System.setProperty("webdriver.chrome.driver", currDir+"//drivers//chromedriver");//mac,linux
			//System.out.println(currDir+"\\drivers\\chromedriver.exe");
			driver= new ChromeDriver();
			
		}
		else if(browser.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", currDir+"\\drivers\\geckodriver.exe");//windows
						
			driver= new FirefoxDriver();
			
		}
		else if(browser.equalsIgnoreCase("edge"))
		{
			System.setProperty("webdriver.edge.driver", currDir+"\\drivers\\msedgedriver.exe");//windows
						
			driver= new EdgeDriver();
			
		}
		else
		{
			System.out.println("valid browser nor found hence quitting");
			System.exit(0);
		}
		
		if(url != "")
		{
			driver.get(url);
		   /* WebElement emailTxtBox = driver.findElement (By.id ("email"));
		    emailTxtBox.sendKeys("sailu_saila@yahoo.co.in");
		    //System.out.println(emailTxtBox.getText());
		    driver.findElement(By.name("pass")).sendKeys("password@456");
		   // driver.findElement(By.name("login")).click();
		    
		    
			
			//xpath locator with and operator 
			driver.findElement(By.xpath("//input[@id='email' and @name='email']")).sendKeys("sailu_saila@yahoo.co.in");
		    
		   // driver.findElement(By.xpath("//button[text() = 'Log In' ]")).click();
		   String str =  driver.findElement(By.xpath("//h2[contains(text() , 'friends' ) ]")).getText();
		   String str1= driver.findElement(By.xpath("//a[starts-with(text() , 'Create a P') ]")).getText();
		   System.out.println(str1);
		   driver.findElement(By.xpath("//*[@type = 'text']")).sendKeys("xxxx");
		   */
			
		  // driver.findElement(By.xpath("//a[text() = 'Create new account']")).click();
		  // driver.findElement(By.xpath("//select[@='month']/following-sibling::*"));
		  // driver.findElement(By.xpath("//select[@id='month'] /following::select[@id='year']")).sendKeys("2000");
		 // Select se = new Select(driver.findElement(By.id("month")));
		   //Select se =new Select(driver.findElement(By.xpath("//select[@id='month']")));
		 // se.selectByIndex(2);
			//driver.findElement(By.id("email")).sendKeys("sailu_saila@yahoo.co.in");
			/*try {
				driver.wait(100);
				//driver.quit();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				driver.close();
			}
			driver.close();
			*/
		}
		else
			driver.get("abount:blank");
	}

	

}
