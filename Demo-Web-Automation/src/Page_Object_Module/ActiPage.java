package Page_Object_Module;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiPage {
	
	public ActiPage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser,this);
	}
	
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}

	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLoginButton()
	{
		return oLogin;
	}
	
	private WebElement gettingStartedShortcutsMenuCloseId;
	public WebElement getflyoutwindow()
	{
		return gettingStartedShortcutsMenuCloseId;
	}
	
	@FindBy(xpath="//a[@class='content users']")
	private WebElement oUser;
	public WebElement getUser()
	{
		return oUser;
	}
	
	@FindBy(xpath="//div[@class='buttonText']")
	private WebElement oCreateUser;
	public WebElement getCreateUser()
	{
		return oCreateUser;
	}
	
	private WebElement firstName;
	public WebElement getFirstName()
	{
		return firstName;
	}
	
	private WebElement lastName;
	public WebElement getLastName()
	{
		return lastName;
	}
	
	private WebElement email;
	public WebElement getEmail()
	{
		return email;
	}
	
	private WebElement userDataLightBox_usernameField;
	public WebElement getUsername()
	{
		return userDataLightBox_usernameField;
	}
	
	private WebElement password;
	public WebElement getpassword()
	{
		return password;
	}
	
	private WebElement passwordCopy;
	public WebElement getCopypassword()
	{
		return passwordCopy;
	}
	
	@FindBy(xpath="//span[@class='buttonTitle']")
	private WebElement oCreateuser;
	public WebElement getCreateUserButton()
	{
		return oCreateuser;
	}
	
	@FindBy(xpath="//span[text()='1, User']")
	private WebElement oCreatedUser1;
	public WebElement getCreatedUser1()
	{
		return oCreatedUser1;
	}
	
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getDeleteUser1()
	{
		return userDataLightBox_deleteBtn;
	}
	
	@FindBy(xpath="//span[text()='Save Changes']")
	private WebElement oSaveUser1;
	public WebElement getSaveUser1()
	{
		return oSaveUser1;
	}
	
	@FindBy(xpath="//a[@class='content tasks']")
	private WebElement oTask;
	public WebElement getTaskpage()
	{
		return oTask;
	}
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement oAddnew;
	public WebElement getAddnew()
	{
		return oAddnew;
	}
	
	@FindBy(xpath="//div[@class='item createNewCustomer ellipsis']")
	private WebElement oNewcustomer;
	public WebElement getNewcustomer()
	{
		return oNewcustomer;
	}
	
	private WebElement customerLightBox_nameField;
	public WebElement getCustomername()
	{
		return customerLightBox_nameField;
	}
	
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement oCreatecustomer;
	public WebElement getCreatecustomer()
	{
		return oCreatecustomer;
	}
	
	@FindBy(xpath="//div[@class='editButton available']")
	private WebElement oCustomersetting;
	public WebElement getCustomersetting()
	{
		return oCustomersetting;
	}
	
	@FindBy(xpath="//div[@class='action']")
	private WebElement oActions;
	public WebElement getActions()
	{
		return oActions;
	}
	
	@FindBy(xpath="//div[text()='Delete']")
	private WebElement oDelete;
	public WebElement getDelete()
	{
		return oDelete;
	}
	
	@FindBy(xpath="//span[text()='Delete permanently']")
	private WebElement oDeletepermanently;
	public WebElement getDeletepermanently()
	{
		return oDeletepermanently;
	}
	
	@FindBy(xpath="//textarea[@class='textarea']")
	private WebElement oTextarea;
	public WebElement getTextarea()
	{
		return oTextarea;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[1]")
	private WebElement oCloseCustomerwindow;
	public WebElement getCloseCustomerwindow()
	{
		return oCloseCustomerwindow;
	}
	
	@FindBy(xpath="//div[@class='plusIcon']")
	private WebElement oPlusicon;
	public WebElement getPlusicon()
	{
		return oPlusicon;
	}
	
	@FindBy(xpath="//div[@class='item createNewProject ellipsis']")
	private WebElement oCreatenewproject;
	public WebElement getCreatenewproject()
	{
		return oCreatenewproject;
	}
	
	private WebElement projectPopup_projectNameField;
	public WebElement getEnterprojectname()
	{
		return projectPopup_projectNameField;
	}
	
	@FindBy(xpath="//span[text()='Create Project']")
	private WebElement oCreateproject;
	public WebElement getCreateproject()
	{
		return oCreateproject;
	}
	
	@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement oProjectsetting;
	public WebElement getProjectsetting()
	{
		return oProjectsetting;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement oProjectactions;
	public WebElement getProjectactions()
	{
		return oProjectactions;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
	private WebElement oProjectdelete;
	public WebElement getProjectdelete()
	{
		return oProjectdelete;
	}
	
	@FindBy(xpath="//*[@id=\'projectPanel_deleteConfirm_submitTitle\']")
	private WebElement oProjectdeletepermanently;
	public WebElement getProjectdeletepermanently()
	{
		return oProjectdeletepermanently;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
	private WebElement oEnterprojectdiscription;
	public WebElement getEnterprojectdiscription()
	{
		return oEnterprojectdiscription;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[1]")
	private WebElement ogetcloseproject;
	public WebElement getcloseproject()
	{
		return ogetcloseproject;
	}
	
	@FindBy(xpath="//div[text()='Add New Task']")
	private WebElement oAddnewtask;
	public WebElement getAddnewtask()
	{
		return oAddnewtask;
	}
	
	@FindBy(xpath="//div[@class='item createNewTask ellipsis']")
	private WebElement oCreatenewtask;
	public WebElement getCreatenewtask()
	{
		return oCreatenewtask;
	}
	
	@FindBy(xpath="//input[@class='inputFieldWithPlaceholder']")
	private WebElement oEntertaskname;
	public WebElement getEntertaskname()
	{
		return oEntertaskname;
	}
	
	@FindBy(xpath="//span[text()='Create Tasks']")
	private WebElement oCreatetask;
	public WebElement getCreatetask()
	{
		return oCreatetask;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr/td[2]/div/div[2]")
	private WebElement oTask1;
	public WebElement getTask1()
	{
		return oTask1;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement oTask1actions;
	public WebElement getTask1actions()
	{
		return oTask1actions;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div")
	private WebElement oTask1delete;
	public WebElement getTask1delete()
	{
		return oTask1delete;
	}
	
	//@FindBy(xpath="//*[@id=\'taskPanel_deleteConfirm_submitTitle\']")
	private WebElement taskPanel_deleteConfirm_submitTitle;
	public WebElement getTask1deletepermanently()
	{
		return taskPanel_deleteConfirm_submitTitle;
	}
	
	@FindBy(xpath="//span[@class='startExploringArrow']")
	private WebElement oStartexploringarrow;
	public WebElement getStartexploringarrow()
	{
		return oStartexploringarrow;
	}
	
	@FindBy(xpath="//span[text()='2, User']")
	private WebElement oCreatedUser2;
	public WebElement getCreatedUser2()
	{
		return oCreatedUser2;
	}
	
	@FindBy(xpath="//span[text()='Save Changes']")
	private WebElement oSaveUser2;
	public WebElement getSaveUser2()
	{
		return oSaveUser2;
	}
	
	
	@FindBy(xpath="//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[2]")
	private WebElement oStartexploringarrow1;
	public WebElement getStartexploringarrow1()
	{
		return oStartexploringarrow1;
	}
	
	@FindBy(xpath="//span[text()='3, User']")
	private WebElement oCreatedUser3;
	public WebElement getCreatedUser3()
	{
		return oCreatedUser3;
	}
	
	private WebElement logoutLink;
	public WebElement getLogOutLink()
	{
		return logoutLink;
	}
}