package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class configDatareader 
{
	Properties pro;

	public configDatareader()
	{
		File src = new File(System.getProperty("user.dir")+"\\Configuration\\config.properties");
		
		try {
			FileInputStream fis =  new FileInputStream(src);
			pro=new Properties();
			pro.load(fis);	
		} catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}
	
	public String getdata(String keytosearch)
	{
		return pro.getProperty(keytosearch);
		
	}
	
	public String getBrowser()
	{
		return pro.getProperty("Browser");
	}
	
	public String geturl()
	{
		return pro.getProperty("url");
	}
}
