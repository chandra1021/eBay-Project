package Script;


import org.testng.annotations.Test;

import generic.Basetest;
import page.Logout;
import page.SingInPage;
import page.WelcomePage;

public class LoginLogut extends Basetest 
{ 
	
	
	@Test
	public void test1() throws InterruptedException 
	{
	  //login
		 WelcomePage wl= new WelcomePage(driver);
		 wl.sign();
		 SingInPage sn= new  SingInPage(driver);
		 sn.username1(generic.ExelDate.exelsheet(path, sheet, 0, 1));
		 sn.password1(generic.ExelDate.exelsheet(path, sheet, 1, 1));
		 Thread.sleep(2000);
		 sn.singinbutton();
		//logout 
		 Logout l=new Logout(driver);
		 l.logout();
		 Thread.sleep(5000);
		 l.logout1();
		 Thread.sleep(5000);

}}
