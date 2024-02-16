package seleniumtrainingpackage;

public class NavigationExample extends BasicClass{

	public void navDemo() throws InterruptedException
	{
		driver.navigate().to("https://www.youtube.com");
		
		//back
		System.out.println("navigating back to google.com");
		
		Thread.sleep(5000);
		driver.navigate().back();
		
		//forward
		System.out.println("navigating forward to youtube.com");
		Thread.sleep(5000);
		driver.navigate().forward();
		
		//Refresh
		System.out.println("Refresh page");
		Thread.sleep(5000);
		driver.navigate().refresh();
	}
	
	public static void main(String[] args) {
		NavigationExample obj = new NavigationExample();
		obj.setupBrowser("edge", "https://www.google.com");
		
		try {
			obj.navDemo();
		}
		catch(InterruptedException e)
		{
			e.printStackTrace();
		}
	}

}
