package Script;


import org.testng.annotations.Test;

import generic.Basetest;
import page.HomePage;
import page.Logout;
import page.SingInPage;
import page.WelcomePage;


public class SearchItemTestCase extends Basetest 
{ 
	
	
	@Test
	public void test1() throws InterruptedException 
	{
	 
		 WelcomePage wl= new WelcomePage(driver);
		 wl.sign();
		 SingInPage sn= new  SingInPage(driver);
		 sn.username1(generic.ExelDate.exelsheet(path, sheet, 0, 1));
		 sn.password1(generic.ExelDate.exelsheet(path, sheet, 1, 1));
		 Thread.sleep(2000);
		 sn.singinbutton();
		 HomePage hp= new HomePage(driver);
		 hp.SearchBox1("men watches");
		 hp.SearchButton1();
		 //logout
		 Logout l=new Logout(driver);
		 l.logout();
		 Thread.sleep(2000);
		 l.logout1();
		 Thread.sleep(5000);
		 }
}
