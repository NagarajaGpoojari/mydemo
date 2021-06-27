package basetest;

import org.testng.annotations.BeforeTest;

import basePage.baseclass;

public class baseClassTest extends baseclass
{
	public baseClassTest() 
	{
		super();
	}
	
	@BeforeTest
	public void launchBrowser() 
	{
			baseclass bc = new baseclass();
			bc.launchBrowser();
	}
	
}
