package testcase;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import utility.browserFactory;
import utility.configDatareader;
import utility.exceldataread;

public class baseclass 
{

	public static WebDriver driver;
	public exceldataread excel;
	public configDatareader config;
	public ExtentReports report;
	public ExtentTest logger;
	
	@BeforeSuite
	public void readdata()
	{
		excel =  new exceldataread();
		config = new configDatareader();
		
		ExtentHtmlReporter extent = new ExtentHtmlReporter(new File(System.getProperty("user.dir")+"//Reports//"+System.currentTimeMillis()+"//CRM.html"));
		report = new ExtentReports();
		report.attachReporter(extent);	
	}
	
	@BeforeClass
	public void start()
	{
		driver=browserFactory.startapplication(driver,config.getBrowser(),config.geturl());
		
	}
	
	@AfterClass
	public void closeApplication()
	{
		browserFactory.teardown(driver);
		
	}
	
	@AfterMethod
	public void teardown()
	{
		report.flush();
	}
}
