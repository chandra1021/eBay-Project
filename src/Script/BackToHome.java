package Script;

import org.testng.annotations.Test;

import generic.Basetest;
import page.AllEXTRA;
import page.HomePage;
import page.Logout;
import page.SingInPage;
import page.WelcomePage;

public class BackToHome extends Basetest
{
	@Test
	public void test() throws InterruptedException
	{
	 //login
	 WelcomePage wl= new WelcomePage(driver);
	 wl.sign();
	 SingInPage sn= new  SingInPage(driver);
	 sn.username1(generic.ExelDate.exelsheet(path, sheet, 0, 1));
	 sn.password1(generic.ExelDate.exelsheet(path, sheet, 1, 1));
	 Thread.sleep(2000);
	 sn.singinbutton();
	 
	 Thread.sleep(5000);
	 HomePage hp= new HomePage(driver);
	 hp.MyPaisaPay1();
	 
	 Thread.sleep(10000);
	 AllEXTRA all = new AllEXTRA(driver);
	 all.backtohome();
	
			 
	 Thread.sleep(10000);
	 //logout
	 Logout l=new Logout(driver);
	 l.logout();
	 Thread.sleep(2000);
	 l.logout1();
	 Thread.sleep(2000);	 

}}
