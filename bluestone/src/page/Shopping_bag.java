package page;

import static org.testng.Assert.assertEquals;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class Shopping_bag {
	
	@FindBy(xpath="//img[@class='img-responsive']")
	private List<WebElement>  ShoppingBag_Product;
	
	@FindBy(xpath="//span[contains(text(),'Items')]")
	private WebElement  NO_ofitem;
	
	public Shopping_bag(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public  void clickProduct () {
		int count=	ShoppingBag_Product.size();
		System.out.println(count);
	}
	
	public void verifybag(WebDriver driver)
	{
		assertEquals(NO_ofitem, ShoppingBag_Product);
		Reporter.log("element is same");
	
	}
	
}
