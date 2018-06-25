package Script;

import org.testng.annotations.Test;

import generic.Basetest;
import page.AllEXTRA;
import page.HomePage;

import page.SingInPage;
import page.WelcomePage;

public class ReviewAboutEbay  extends Basetest
{
	@Test
	public void test2() throws InterruptedException 
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
		 hp.MyEBAY();
		 Thread.sleep(5000);
		 AllEXTRA all = new AllEXTRA(driver);
		 all.review1();
		 	 
	}
	

}
