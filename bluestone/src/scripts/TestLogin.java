package scripts;


import org.testng.annotations.Test;

import generics.BaseTest;
import page.HomePage;
import page.LoginPage;

public class TestLogin extends BaseTest {
	@Test
	public void logintest() {
		LoginPage l= new LoginPage(driver);
		l.LogInn();
		l.setusername("shwetha.priya05gmail.com");
		l.setpassword("abcdefg");
		l.login();
		l.verifyerrmsg(driver);
	}
}
