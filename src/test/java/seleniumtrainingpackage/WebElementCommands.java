package seleniumtrainingpackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebElementCommands extends BasicClass{
	
	public void webElementDemo()
	{
		WebElement email = driver.findElement(By.id("email"));
		System.out.println(email.getAttribute("class"));
		
		WebElement instaLink = driver.findElement(By.linkText("Instagram"));
		System.out.println(instaLink.getAttribute("title"));
		
		WebElement welcomeMsg = driver.findElement(By.xpath("//h2[ @class ='_8eso']"));
		
		System.out.println(welcomeMsg.getCssValue("font-size"));
		driver.manage().window().maximize();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebElementCommands obj= new WebElementCommands();
		obj.setupBrowser("edge", "https://www.facebook.com");
		obj.webElementDemo();
	}

}
