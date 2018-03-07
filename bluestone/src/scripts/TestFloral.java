package scripts;

import org.testng.annotations.Test;

import generics.BaseTest;
import page.EliginaRing;
import page.EngagementRing;
import page.HomePage;
import page.LoginPage;
import page.RingsPage;
import page.Shopping_bag;
import page.Single_Floral_Ring;

public class TestFloral extends BaseTest{
@Test
public void testfloral() throws InterruptedException
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
	
	Single_Floral_Ring s= new Single_Floral_Ring(driver);
	s.clickfloral(driver);
	s.select_ring();
	EliginaRing ep= new EliginaRing(driver);
	ep.click_buynow();
	//ep.click_cart();
	Thread.sleep(1000);
	sp.clickProduct();
	
	//sp.verifybag(driver);
	
}
}
