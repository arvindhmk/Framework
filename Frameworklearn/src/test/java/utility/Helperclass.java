package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

import testcase.baseclass;

public class Helperclass extends baseclass
{

	public static String captureScreenshot()
	{
		
		TakesScreenshot scrn = (TakesScreenshot)driver;
		File src = scrn.getScreenshotAs(OutputType.FILE);
		File dest = new File(System.getProperty("user.dir")+"\\Screenshots\\"+System.currentTimeMillis()+".jpeg");
		try {
			FileHandler.copy(src, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String path = System.getProperty("user.dir")+"\\Screenshots"+System.currentTimeMillis()+".jpeg";
		return path;
		
		
	}
}
