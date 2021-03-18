package Pop_Up_Prgrms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupBrowsersDemo {

	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		popupTesting();
	}
	
	public static void launchBrowser()
	{
		try
		{
			String path=System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver", path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static void popupTesting()
	{
		try
		{
			System.out.println("Before Click on the Link # of Browers :"+getPopupCount());
			oBrowser.findElement(By.linkText("actiTIME Inc.")).click();
			System.out.println("After Click on the Link # of Browers :"+getPopupCount());
			Thread.sleep(2000);
			if(getPopupCount()>1)
			{
				popupHandling();
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	static int getPopupCount()
	{
		int count=0;
		count=oBrowser.getWindowHandles().size();
		return count;
	}
	
	static void popupHandling()
	{
		try
		{
			String parentBrowser;
			parentBrowser=oBrowser.getWindowHandle();
			System.out.println("Parent Browser :"+parentBrowser);
			Object arrPopups[]=oBrowser.getWindowHandles().toArray();
			for(int i=1;i<arrPopups.length;i++)
			{
				String childBrowser=arrPopups[i].toString();
				System.out.println("Child Browser :"+childBrowser);
				oBrowser.switchTo().window(childBrowser);
				String title=oBrowser.getTitle();
				System.out.println("Title :"+title);
				String url=oBrowser.getCurrentUrl();
				System.out.println("URL :"+url);
				oBrowser.findElement(By.linkText("Start Using actiTIME")).click();
				Thread.sleep(2000);
			}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
