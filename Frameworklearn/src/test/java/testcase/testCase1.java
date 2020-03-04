package testcase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class testCase1 
{

	
	public void test1()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\Compressed\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		
		WebElement uName = driver.findElement(By.id("txtUsername"));
		WebElement uPaswd = driver.findElement(By.id("txtPassword"));
		WebElement submit = driver.findElement(By.id("btnLogin"));
		
		uName.sendKeys("Admin");
		uPaswd.sendKeys("admin123");
		submit.click();
		
		
		
		
	}
}
