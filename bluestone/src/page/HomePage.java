package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	@FindBy(xpath= "//span[text()='Rings ']")
	private WebElement Ring;
	
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void mouseoverRing(WebDriver driver)
	{
		Actions a= new Actions(driver);
		a.moveToElement(Ring).build().perform();
	
	}
		
}
