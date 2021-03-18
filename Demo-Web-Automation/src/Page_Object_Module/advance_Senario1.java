package Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class advance_Senario1 {
	public static WebDriver oBrowser=null;
	public static ActiPage oPage = null;
	public static void main(String[] args) {
		
		launchbrowser();
		navigate();
		login();
		flyoutwindow();
		createuser();
		logout();
		loginasuser1();
		createuser2();
		modifyuser2password();
		logout();
		loginasuser2();
		createuser3();
		logout();
		login();
		modifyuser1password();
		logout();
		loginasuser1changepassword();
		logout();
		loginasuser2();
		deleteuser3();
		logout();
		loginasuser1changepassword();
		deleteuser2();
		logout();
		login();
		deleteuser1();
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
			oPage.getEmail().sendKeys("user1@gmail.com");
			Thread.sleep(2000);
			oPage.getUserName().sendKeys("user1");
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
	static void loginasuser1()
	{
		try
		{
			oPage.getUserName().sendKeys("user1");
			Thread.sleep(2000);
			oPage.getPassword().sendKeys("123456");
			Thread.sleep(2000);
			oPage.getLoginButton().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createuser2()
	{
		try
		{
			oPage.getStartexploringarrow().click();
			Thread.sleep(2000);
			oPage.getUser().click();
			Thread.sleep(2000);
			oPage.getCreateUser().click();
			Thread.sleep(2000);
			oPage.getFirstName().sendKeys("User");
			Thread.sleep(2000);
			oPage.getLastName().sendKeys("2");
			Thread.sleep(2000);
			oPage.getEmail().sendKeys("user2@gmail.com");
			Thread.sleep(2000);
			oPage.getUserName().sendKeys("user2");
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
	static void modifyuser2password()
	{
		try
		{
			oPage.getCreatedUser2().click();
			Thread.sleep(2000);
			oPage.getpassword().sendKeys("654321");
			Thread.sleep(2000);
			oPage.getCopypassword().sendKeys("654321");
			Thread.sleep(2000);
			oPage.getSaveUser1().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginasuser2()
	{
		try
		{
			oPage.getUserName().sendKeys("user2");
			Thread.sleep(2000);
			oPage.getPassword().sendKeys("654321");
			Thread.sleep(2000);
			oPage.getLoginButton().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createuser3()
	{
		try
		{
			oPage.getStartexploringarrow1().click();
			Thread.sleep(2000);
			oPage.getUser().click();
			Thread.sleep(2000);
			oPage.getCreateUser().click();
			Thread.sleep(2000);
			oPage.getFirstName().sendKeys("User");
			Thread.sleep(2000);
			oPage.getLastName().sendKeys("3");
			Thread.sleep(2000);
			oPage.getEmail().sendKeys("user3@gmail.com");
			Thread.sleep(2000);
			oPage.getUserName().sendKeys("user3");
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
	static void modifyuser1password()
	{
		try
		{
			oPage.getUser().click();
			Thread.sleep(2000);
			oPage.getCreatedUser1().click();
			Thread.sleep(2000);
			oPage.getpassword().sendKeys("654321");
			Thread.sleep(2000);
			oPage.getCopypassword().sendKeys("654321");
			Thread.sleep(2000);
			oPage.getSaveUser1().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void loginasuser1changepassword()
	{
		try
		{
			oPage.getUserName().sendKeys("user1");
			Thread.sleep(2000);
			oPage.getPassword().sendKeys("654321");
			Thread.sleep(2000);
			oPage.getLoginButton().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteuser3()
	{
		try
		{
			oPage.getUser().click();
			Thread.sleep(2000);
			oPage.getCreatedUser3().click();
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
	static void deleteuser2()
	{
		try
		{
			oPage.getUser().click();
			Thread.sleep(2000);
			oPage.getCreatedUser2().click();
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
	static void deleteuser1()
	{
		try
		{
			oPage.getUser().click();
			Thread.sleep(2000);
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