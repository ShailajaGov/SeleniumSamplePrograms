package seleniumtrainingpackage;

public class BrowserCommands extends BasicClass{

	public void getCommandExample()
	{
		driver.get("https://www.facebook.com");
	}
	
	public void getCurrentUrlExample()
	{
		String url = driver.getCurrentUrl();
		System.out.println(url);
	}
	public void getTitleExample()
	{
		System.out.println(driver.getTitle());
	}
	
	public void closeBrowserTab()
	{
		try {
			Thread.sleep(10000);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		
		driver.close();
	}
	
	public void quitBrowser()
	{
		try {
			Thread.sleep(10000);
		}
		catch(InterruptedException ex)
		{
			ex.printStackTrace();
		}
		driver.quit();
	}
	
	public static void main(String[] args) {
		
		BrowserCommands obj=new BrowserCommands();
		obj.setupBrowser("edge","");
		obj.getCommandExample();
		obj.getCurrentUrlExample();
		obj.getTitleExample();
		//obj.closeBrowserTab();
		obj.quitBrowser();
		
	}

}
