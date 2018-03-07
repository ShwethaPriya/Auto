package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EliginaRing {

	@FindBy(xpath="//input[@id='buy-now']")
	private WebElement buynow;
	
	
	@FindBy(xpath="//a[text()=' Cart']")
	private WebElement click_cart;
	
	public EliginaRing(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void click_buynow()
	{
		buynow.click();
	}
	
	public void click_cart()
	{
		click_cart.click();
	}


}	
