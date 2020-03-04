package testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import org.testng.annotations.Test;

import tastpage.loginpageobjects;


public class logintestcase extends baseclass
{

	@Test
	public void loginApp()
	{
		logger = report.createTest("login to CRM");
						
		loginpageobjects login = PageFactory.initElements(driver,loginpageobjects.class);
		logger.info("starting application");
		
		login.logintoCRM(excel.getstringdata("Sheet1", 1, 0), excel.getstringdata("Sheet1", 1, 1));
		logger.pass("login success");
		
	}
	

}
