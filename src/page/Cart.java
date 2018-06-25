package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Cart 
{
	
	@FindBy(name="watchlist_bulkcheck")
	private WebElement watchlist_bulkcheck;
	
	@FindBy(xpath="(//a[.='Delete'])[1]")
      private WebElement Delete;
	
	@FindBy(id="delCustpBtnSave")
	private WebElement conform;
	
	public  Cart(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void watchlist_bulkcheck(){
		watchlist_bulkcheck.click();
	}
	
	public void Delete(){
		Delete.click();
	}
	public void conform(){
		conform.click();
	}


}
