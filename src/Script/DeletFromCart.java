package Script;

import org.testng.annotations.Test;

import generic.Basetest;
import page.Cart;
import page.HomePage;
import page.Logout;
import page.SingInPage;
import page.WelcomePage;
@Test
public class DeletFromCart extends  Basetest
{
	
	public void test3() throws InterruptedException 
	{

		 //login
		 WelcomePage wl= new WelcomePage(driver);
		 wl.sign();
		 SingInPage sn= new  SingInPage(driver);
		 sn.username1(generic.ExelDate.exelsheet(path, sheet, 0, 1));
		 sn.password1(generic.ExelDate.exelsheet(path, sheet, 1, 1));
		 Thread.sleep(2000);
		 sn.singinbutton();
		 Thread.sleep(2000);
		 HomePage hp= new HomePage(driver);
		 hp.MyEBAY();
		 Cart c= new Cart(driver);
		 Thread.sleep(10000);
		 c.watchlist_bulkcheck();
		 c.Delete();
		 Thread.sleep(5000);
		 c.conform();
		 Thread.sleep(5000);
		 
		 //logout
		 Logout l=new Logout(driver);
		 l.logout();
		 Thread.sleep(2000);
		 l.logout1();
		 Thread.sleep(5000);

	}

}
