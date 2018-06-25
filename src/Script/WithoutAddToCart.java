package Script;

import org.testng.annotations.Test;

import generic.Basetest;
import page.HomePage;
import page.Watches;
@Test
public class WithoutAddToCart  extends Basetest
{
	public void test2() throws InterruptedException 
	{
		 HomePage hp= new HomePage(driver);
		 hp.SearchBox1("watches");
		 hp.SearchButton1();
		 Watches wt= new Watches(driver);
		 wt.watch1();
		 wt.wishlist1();
		 Thread.sleep(5000);
		 
		 
	}


}
