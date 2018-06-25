package page;

import org.apache.bcel.generic.Select;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Watches

{
	@FindBy(xpath="//img[@src='https://i.ebayimg.com/thumbs/images/g/tn4AAOSwj85Zhckl/s-l225.jpg']")
	private WebElement watch1;
	
	@FindBy(xpath="//img[@src='https://i.ebayimg.com/thumbs/images/m/mic6YOptIyqu0q9BuwWQDdQ/s-l225.jpg']")
	private WebElement watch2;
	@FindBy(id="msku-sel-1")
	private WebElement dropdown;
	
	
	@FindBy(xpath="(//a[@n='Watch list'])[1]")
	private WebElement wishlist;
	
	@FindBy(xpath="//a[@id='binBtn_btn']")
	private WebElement Buy;
	
	@FindBy(id="isCartBtn_btn")
	private WebElement addtocart;
	
	@FindBy(id="dataLocation")
	private WebElement location;
	
	@FindBy(id="e5")
	private WebElement payentinfo;
/////////	
	@FindBy(id="txtPin")
	private WebElement pincode;
	
	@FindBy(id="btnSubmit")
	private WebElement PinSubmit;
	
	public   Watches (WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void watch1(){
		watch1.click();
	}
	
	public void watch2(){
		watch2.click();
	}
	
	
	public void wishlist1()
	{
		wishlist.click();
	}
	public void addtocart()
	{
		addtocart.click();
	}
	public void location()
	{
		location.click();
	}
	public void pincode(String Pincode)
	{
		pincode.sendKeys(Pincode);;
	}
	public void PinSubmit()
	{
		PinSubmit.click();
	}
	public void payentinfo()
	{
		payentinfo.click();
	}
	public void buy()
	{
		Buy.click();
		Buy.click();
		
	}
	 
	


}
