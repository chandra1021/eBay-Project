package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage
{
	
	@FindBy(xpath="//a[.='Sign in']")
	private WebElement signin;
	
	public WelcomePage(WebDriver driver)

	{
		
		PageFactory.initElements(driver, this);

	}
	
	public void sign()

	{
		signin.click();
	}

}
