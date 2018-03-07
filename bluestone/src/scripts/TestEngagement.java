package scripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import generics.BaseTest;
import page.EngagementRing;
import page.HomePage;
import page.LoginPage;
import page.RingsPage;

public class TestEngagement extends BaseTest{
	@Test
	public void EngTest() throws InterruptedException
	{
		LoginPage l= new LoginPage(driver);
		EngagementRing e= new EngagementRing(driver);
		l.LogInn();
		l.setusername("shwetha.priya05@gmail.com");
		l.setpassword("abcdefg");
		l.login();
		HomePage h=new HomePage(driver);
		h.mouseoverRing(driver);
		RingsPage r= new RingsPage(driver);
		r.movetoEngagement(driver);
		Thread.sleep(10000);
		r.movetoprice(driver);
		r.above50000(driver);
		e.compare_option();
		
	}
	

}
