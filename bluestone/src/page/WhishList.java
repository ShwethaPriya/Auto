package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WhishList {
	
	@FindBy(xpath="//a[@data-id='16718']")
	private WebElement  RingtowishList;
	
	
	@FindBy(xpath="//a[@title='Add to wishlist']")
	private List<WebElement> wishLists;
	
	@FindBy(xpath="//a[text()='Remove']")
	private WebElement remove;
	
	public WhishList(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void clickWishList()
	{
		RingtowishList.click();
	}
	
	
	public void clickRemove()
	{
		remove.click();
	}
	
}

