package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;

public class Basetest implements Constant

{
    public  WebDriver driver;
	
	@BeforeMethod
	public void openApp() throws InterruptedException
	{
		System.setProperty(key, value);
		driver=new FirefoxDriver();
		driver.get("https://www.ebay.in/");
	}
	
	@AfterSuite
	public void closeApp()
	{
		driver.close();
	}

}
