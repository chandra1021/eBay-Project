package Script;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import generic.Basetest;
import page.HomePage;
import page.Logout;
import page.SingInPage;
import page.Watches;
import page.WelcomePage;

public class PaymentPage extends Basetest
{
	@Test
		public void test4() throws InterruptedException 
		{
			 //login
			 WelcomePage wl= new WelcomePage(driver);
			 wl.sign();
			 SingInPage sn= new  SingInPage(driver);
			 sn.username1(generic.ExelDate.exelsheet(path, sheet, 0, 1));
			 sn.password1(generic.ExelDate.exelsheet(path, sheet, 1, 1));
			 Thread.sleep(2000);
			 sn.singinbutton();
			 HomePage hp= new HomePage(driver);
			 hp.SearchBox1("watches");
			 hp.SearchButton1();
			 Watches wt= new Watches(driver);
			 wt.watch1();
			 Thread.sleep(5000);
			 JavascriptExecutor js = (JavascriptExecutor) driver;
			 js.executeScript("window.scrollBy(0,500)");
			 Thread.sleep(2000);
			 wt.payentinfo();
			 
			 //logout
			 Logout l=new Logout(driver);
			 l.logout();
			 Thread.sleep(2000);
			 l.logout1();
			 Thread.sleep(15000);
			 
			
}
}