package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout
{
	@FindBy(id="gh-ug")
	private WebElement logout;
	
	@FindBy(xpath="//a[.='Sign out']")
      private WebElement logout1;
	
	public  Logout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void logout(){
		logout.click();
	}
	
	public void logout1(){
		logout1.click();
	}

	

}
