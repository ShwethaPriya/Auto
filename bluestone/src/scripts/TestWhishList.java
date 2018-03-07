package scripts;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import generics.BaseTest;
import page.EngagementRing;
import page.HomePage;
import page.LoginPage;
import page.RingsPage;
import page.Shopping_bag;

public class TestWhishList extends BaseTest {

	@Test
	public void TestWhishList() throws InterruptedException
	{
	
		LoginPage l= new LoginPage(driver);
		HomePage h=new HomePage(driver);
		RingsPage r= new RingsPage(driver);
		EngagementRing e= new EngagementRing(driver);
		Shopping_bag sp= new Shopping_bag(driver);
		l.LogInn();
		l.setusername("shwetha.priya05@gmail.com");
		l.setpassword("abcdefg");
		l.login();
		
		h.mouseoverRing(driver);
		r.movetoEngagement(driver);
		r.movetoprice(driver);
		
		r.rs20000_30000(driver);
		Thread.sleep(20000);
		
		r.clickWishList(driver);
		Thread.sleep(10000);
		//r.clickRose(driver);
		r.clickWishListicon();
	}
}
