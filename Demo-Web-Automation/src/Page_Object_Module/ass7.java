package Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ass7 {
	public static WebDriver oBrowser = null;
	public static ActiPage oPage = null;
	public static void main(String[] args) {
		launchbrowser();
		navigate();
		login();
		flyoutwindow();
		createcustomer();
		createproject();
		createtask();
		deletetask();
		deleteproject();
		deletecustomer();
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
	static void createcustomer()
	{
		try
		{
			oPage.getTaskpage().click();
			Thread.sleep(2000);
			oPage.getAddnew().click();
			Thread.sleep(2000);
			oPage.getNewcustomer().click();
			Thread.sleep(2000);
			oPage.getCustomername().sendKeys("Customer 1");
			Thread.sleep(2000);
			oPage.getCreatecustomer().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createproject()
	{
		try
		{
			oPage.getPlusicon().click();
			Thread.sleep(2000);
			oPage.getCreatenewproject().click();
			Thread.sleep(2000);
			oPage.getEnterprojectname().sendKeys("Project 1");
			Thread.sleep(2000);
			oPage.getCreateproject().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void createtask()
	{
		try
		{
			oPage.getAddnewtask().click();
			Thread.sleep(2000);
			oPage.getCreatenewtask().click();
			Thread.sleep(2000);
			oPage.getEntertaskname().sendKeys("Task 1");
			Thread.sleep(2000);
			oPage.getCreatetask().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deletetask()
	{
		try
		{
			oPage.getTask1().click();
			Thread.sleep(2000);
			oPage.getTask1actions().click();
			Thread.sleep(2000);
			oPage.getTask1delete().click();
			Thread.sleep(2000);
			oPage.getTask1deletepermanently().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deleteproject()
	{
		try
		{
			oPage.getProjectsetting().click();
			Thread.sleep(2000);
			oPage.getProjectactions().click();
			Thread.sleep(2000);
			oPage.getProjectdelete().click();
			Thread.sleep(2000);
			oPage.getProjectdeletepermanently().click();
			Thread.sleep(2000);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	static void deletecustomer()
	{
		try
		{
			oPage.getCustomersetting().click();
			Thread.sleep(2000);
			oPage.getActions().click();
			Thread.sleep(2000);
			oPage.getDelete().click();
			Thread.sleep(2000);
			oPage.getDeletepermanently().click();
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