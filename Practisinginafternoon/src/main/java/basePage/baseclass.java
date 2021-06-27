package basePage;

import java.io.FileInputStream;
import java.util.Properties;

import io.github.bonigarcia.wdm.WebDriverManager;

public class baseclass 
{
	Properties prop;
	
		public baseclass() 
		{
			try 
			{
			FileInputStream ip = new FileInputStream("./src/main/java/configuration/config.properties"); //This is for loading the config.properties file.
			Properties prop = new Properties();
			prop.load(ip);
			}
			catch(Exception e) 
			{
				System.out.println("File not found");
			}
		}
		
		 //Create an object of properties and try to load the config.properties file.
		
			public void launchBrowser() 
			{
				String browser = prop.getProperty("Browser");
				if(browser.equalsIgnoreCase("Chrome")) 
				{
					WebDriverManager.chromedriver().setup();
				}
				else if(browser.equalsIgnoreCase("Firefox")) 
				{
					WebDriverManager.firefoxdriver().setup();
				}
				else 
				{
					WebDriverManager.edgedriver().setup();
				}
			}
		
}
