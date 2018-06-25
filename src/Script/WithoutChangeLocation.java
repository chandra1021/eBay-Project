package Script;

import org.testng.annotations.Test;

import generic.Basetest;
import page.HomePage;
import page.Logout;
import page.SingInPage;
import page.Watches;


public class WithoutChangeLocation  extends Basetest
{
	@Test
	public void test2() throws InterruptedException 
	{
		 HomePage hp= new HomePage(driver);
		 hp.SearchBox1("watches");
		 hp.SearchButton1();
		 Watches wt= new Watches(driver);
		 wt.watch1();
		 Thread.sleep(5000);
		 wt.location();
		 wt.buy();
		  Thread.sleep(5000);
		 
		 driver.navigate().refresh();
		 Thread.sleep(5000);
		 SingInPage sn= new  SingInPage(driver);
		 sn.username1(generic.ExelDate.exelsheet(path, sheet, 0, 1));
		 sn.password1(generic.ExelDate.exelsheet(path, sheet, 1, 1));
		 Thread.sleep(2000);
		 sn.singinbutton();
		//logout 
		 Logout l=new Logout(driver);
		 l.logout();
		 Thread.sleep(2000);
		 l.logout1();
		 Thread.sleep(15000);
		 
		 
	}


}
