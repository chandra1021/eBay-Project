package generic;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Basepage implements Constant
{
	public static void ElementPresent (WebElement element,WebDriver driver)
	{
		
		try
		{
		WebDriverWait w = new WebDriverWait(driver,30);
		w.until(ExpectedConditions.visibilityOf(element));
		Reporter.log("element is present",true);
		}
		catch(Exception e)
		{
			Reporter.log("element is not present", true);		
		}
	}
	
	public static void verifyTitle(String title,WebDriver driver)
	{
		
		try
		{
			WebDriverWait w = new WebDriverWait(driver,2);
			w.until(ExpectedConditions.titleContains(title));
			Reporter.log("element is present",true);
		}
			
		catch(Exception e)
			{
				Reporter.log("element not present", true);		
			}
		
	}
	
	public static void verifyPage(String tittle,WebDriver driver)
	{
		
		String actual=driver.getTitle();
		Assert.assertEquals(actual, tittle);
	
}}
