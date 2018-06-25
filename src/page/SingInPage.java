package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.Basepage;

public class SingInPage extends Basepage
{

	WebDriver driver;
	@FindBy(id = "userid")
	private WebElement username;
	
	@FindBy(id="pass")
	private WebElement password;
	
	@FindBy(id="sgnBt")
	private WebElement singinbutton;
	
	public SingInPage(WebDriver driver)
	{
	
		PageFactory.initElements(driver, this);		
	}
	
	
	public void username1(String username1)
	{
		
		username.sendKeys(username1);
	}	 
	public void password1(String password1)
	{
		password.sendKeys(password1);
	}	 


	public void singinbutton()// pass webdrier
	{
		//Basepage.ElementPresent(singinbutton,driver);
		singinbutton.click();
		
	}	 
	
	
	
	
}
