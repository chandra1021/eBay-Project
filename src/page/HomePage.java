package page;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage 
{
	@FindBy(xpath="(//a[.='Mobile & Accessories'])[1]")
	private WebElement MobileAccessories;
	
	@FindBy(xpath="//a[.=' My PaisaPay']")
	private WebElement MyPaisaPay;
	
	@FindBy(xpath="//a[@title='Mobile & Accessories - Mobile Phones']")
	private WebElement MobilePhones ;
	
	@FindBy(xpath="//a[@title='Mobile & Accessories - Mobile Accessories']")
	private WebElement MobileAccessories1 ;
	
	@FindBy(xpath="//a[@title='Mobile & Accessories - Cases & Covers']")
	private WebElement CasesCovers ;
	
	@FindBy(xpath="//a[@title='Mobile & Accessories - Power Bank']")
	private WebElement PowerBank ;
	
	@FindBy(xpath="//a[@title='Mobile & Accessories - Headsets and Earphones']")
	private WebElement HeadsetsEarphones ;
	
	@FindBy(xpath="//a[@title='Mobile & Accessories - Smart Watch']")
	private WebElement  SmartWatch ;
	
	@FindBy(id="gh-ac")
	private WebElement SearchBox;
	
	@FindBy(id="gh-btn")
	private WebElement SearchButton;
	
	@FindBy(xpath="//a[.=' My eBay']")
	private WebElement MyEBAY;
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	// mouseover
	public void  MobileAccessories(WebDriver driver)
	{
		 Actions ac= new Actions(driver);
		 ac.moveToElement(MobileAccessories);
		 
	}
	public void  MobileAccessories1()

	{
		MobileAccessories.click();
	}
	
	public void MobilePhones1()
	{
		MobilePhones.click();
	}
	
	public void MobileAccessories11()
	{
		MobileAccessories1.click();
	}
	
	public void CasesCovers1()
	{
		CasesCovers.click();
	}
	
	public void PowerBank1()
	{
		PowerBank.click();
	}
	
	public void HeadsetsEarphones1()
	{
		HeadsetsEarphones.click();
	}
	
	public void SmartWatch1()
	{
		SmartWatch.click();
	}
	
	public void SearchBox1(String ItemName)

	{
		SearchBox.sendKeys(ItemName);
	}
	
	public void SearchButton1()

	{
		SearchButton.click();
	}
	public void MyEBAY()
	
	{
		MyEBAY.click();
	}
	public void MyPaisaPay1()
	
	{
		MyPaisaPay.click();
	}
	
		
	
}
