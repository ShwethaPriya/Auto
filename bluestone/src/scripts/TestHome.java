package scripts;

import org.testng.annotations.Test;

import generics.BaseTest;
import page.HomePage;

public class TestHome extends BaseTest{
	@Test
	public void ringtest() {
		HomePage h = new HomePage(driver);
		h.mouseoverRing(driver);

	}
}