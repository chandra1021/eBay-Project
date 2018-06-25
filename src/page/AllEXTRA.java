package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AllEXTRA
{

	@FindBy(xpath="//a[@href='http://my.ebay.com/ws/eBayISAPI.dll?MyEbayBeta&CurrentPage=MyeBayMyMessages&ssPageName=STRK%3AME%3ALNLK%3ANone&_trksid=p2060353.m2034.l3912']")
	private WebElement messages;
	
	@FindBy(id="v4-0_4")
	private WebElement return1;
	
	@FindBy(xpath="//a[.='Back to My eBay']")
	private WebElement backtohome;
	
	@FindBy(xpath="//a[.='Tell us what you think']")
	private WebElement review;
	
	
	
	public AllEXTRA(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void messages()
	{
		messages.click();
	}
	public void return1()
	{
		return1.click();
	}
	public void backtohome()
	{
		backtohome.click();
	}
	public void review1()
	{
		review.click();
	}
}
