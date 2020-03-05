package tastpage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import testcase.baseclass;



public class loginpageobjects extends baseclass
{
//	WebDriver driver;
//	
//	public loginpageobjects(WebDriver pdriver)
//	{
//		this.driver=pdriver;
//	}
//		
	@FindBy(id = "txtUsername")
	public WebElement userName;
	
	@FindBy(id = "txtPassword")
	public WebElement passWord;
	
	@FindBy(id = "btnLogin")
	public WebElement submit;
	
	public void logintoCRM(String usernameapp,String passwordapp)
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		userName.sendKeys(usernameapp);
		passWord.sendKeys(passwordapp);
		submit.click();

	}
	
	
}
