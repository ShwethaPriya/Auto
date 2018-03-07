package page;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EngagementRing {

	@FindBy(xpath="//a[@class='link-overlay']")
	private List<WebElement> Price;

	@FindBy(xpath="//span[@id='bst-actual-price']")
	private List<WebElement> actPrice;
	
	@FindBy(xpath="//span[@class='total-designs']")
	private WebElement displayedoption ;
	
	@FindBy(xpath="//img[@alt='The Elignia Ring']")
	private WebElement selectProduct ;
	
	@FindBy(xpath="//div[@id='main']")
	private WebElement scroll ;

	
	public EngagementRing(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void selectProduct(WebDriver driver){
		JavascriptExecutor j= (JavascriptExecutor)driver;
		
		int Y=selectProduct.getLocation().getY();
			j.executeScript("window.scrollBy(0,"+Y+")");
			selectProduct.click();
		
		
		
		
	}

	public void compare_option()
	{
		String e="";
		System.out.println(Price.size());
		int a=Price.size();
		String expected=displayedoption.getText();
		System.out.println(expected);
		char []ch=expected.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=48 && ch[i]<=57)
			{
				e=e+ch[i];
			}
		}
		int e1=Integer.parseInt(e);
		if(a==e1)
		{
			System.out.println("displayed all the rings");
		}
		else
		{
			System.out.println("missing rings");
		}
	}
	
	public void getPrice()
	{
		String orderPrice=" "; int a=50000; int b=90000;
		for(WebElement pp:actPrice)
		{
			String text= pp.getText();
			System.out.println(text);
			char [] sort=text.toCharArray();
			for(int j=0;j<sort.length;j++)
			{
				if(sort[j]>= 48 && sort[j]<=57 )
				{
					orderPrice=orderPrice+sort[j];
				}
			
			}
			int sortde=Integer.parseInt(orderPrice);
		if(a<=sortde && b>=sortde)
		{
			System.out.println("sorted");
		}
		else
		{
			System.out.println("not sorted");
		}
		}
	}

}

