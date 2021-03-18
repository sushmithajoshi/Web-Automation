package Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass1 {
	public static WebDriver oBrowser = null;
	public static ActiPage oPage = null;
	public static void main(String[] args) {
		
		launchbrowser();
		navigate();
		login();
		flyoutwindow();
		createuser();
		deleteuser();
		logout();
		closeapplication();

	}
	static void launchbrowser()
	{
		String path = null;
		try
		{
			path = System.getProperty("user.dir");
			System.setProperty("webdriver.chrome.driver",path+"\\Library\\drivers\\chromedriver.exe");
			oBrowser = new ChromeDriver();
			oPage = new ActiPage(oBrowser);
			oBrowser.manage().window().maximize();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:81/login.do");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void login()
	{
		try
		{
			oPage.getUserName().sendKeys("admin");
			Thread.sleep(2000);
			oPage.getPassword().sendKeys("manager");
			Thread.sleep(2000);
			oPage.getLoginButton().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void flyoutwindow()
	{
		try
		{
			oPage.getflyoutwindow().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createuser()
	{
		try
		{
			oPage.getUser().click();
			Thread.sleep(2000);
			oPage.getCreateUser().click();
			Thread.sleep(2000);
			oPage.getFirstName().sendKeys("User");
			Thread.sleep(2000);
			oPage.getLastName().sendKeys("1");
			Thread.sleep(2000);
			oPage.getEmail().sendKeys("userdemo@gmail.com");
			Thread.sleep(2000);
			oPage.getUsername().sendKeys("userdemo");
			Thread.sleep(2000);
			oPage.getpassword().sendKeys("123456");
			Thread.sleep(2000);
			oPage.getCopypassword().sendKeys("123456");
			Thread.sleep(2000);
			oPage.getCreateUserButton().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteuser()
	{
		try
		{
			oPage.getCreatedUser1().click();
			Thread.sleep(2000);
			oPage.getDeleteUser1().click();
			Thread.sleep(2000);
			oBrowser.switchTo().alert().accept();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void logout()
	{
		try
		{
			oPage.getLogOutLink().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void closeapplication()
	{
		try
		{
			oBrowser.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}