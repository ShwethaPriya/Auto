package page;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RingsPage {

	@FindBy(xpath= "//span[text()='Rings ']")
	private WebElement Ring;
	
	@FindBy(xpath="(//span[@class='sub-inner'])[1] ")
	private WebElement Engagement;
	
	@FindBy(xpath="//img[@alt='The Clasped Band for Her']")
	private WebElement product;

	@FindBy(xpath="//img[@alt='The Timeless Rose Ring']")
	private WebElement RoseRing;
	
	@FindBy(xpath="(//span[@class='sub-inner'])[3]")
	private WebElement cople_Bands;
	
	@FindBy(xpath="(//span[@class='sub-inner'])[2]")
	private WebElement Diamond;
	
	@FindBy(xpath="//i[@class='icon-ion-chevron-down']")
	private WebElement price;
	 
	@FindBy(xpath="(//span[@class='WebRupee'])[1]")
	private WebElement Below1000 ;
	
	@FindBy(xpath="//a[@data-displayname='rs 10000 to rs 20000']")
	private WebElement  rs10000t_20000;
	
	@FindBy(xpath="//a[@data-displayname='rs 20000 to rs 30000']")
	private WebElement  rs20000_30000;
	
	@FindBy(xpath="//a[@data-id='4181']")
	private WebElement  RoseRingtowishList;
	
	@FindBy(xpath="//a[text()=' 50,000 and Above ']")
	private WebElement  rs50000_above;
	
	@FindBy(xpath="//span[text()='Metal']")
	private WebElement metal;
	
	@FindBy(xpath="//span[text()='Gold Purity']")
	private WebElement Gold_Purity;
	
	
	@FindBy(xpath="//a[@data-displayname='18k']")
	private WebElement Gold_purity18k;
	
	@FindBy(xpath="//span[text()='Gender']")
	private WebElement Gender;
	
	@FindBy(xpath="//span[text()='Stones']")
	private WebElement Stones;
	
	@FindBy(xpath="//a[text()='View Details >>']")
	private WebElement View_Details;
	
	
	@FindBy(xpath="//a[@data-displayname='diamond and gemstone']")
	private WebElement Diamond_gemstone;
	
	@FindBy(xpath="//span[text() ='Offers']")
	private WebElement offers;
	
	@FindBy(xpath="//a[@data-displayname='UPTO 20% OFF']")
	private WebElement upto_20offers;
	
	@FindBy(xpath="//a[@href='https://www.bluestone.com/jewellery/earrings.html']//span[text()='(132)']") 
	WebElement Below1000_availableoption ;
	
	@FindBy(xpath="//span[@class='total-designs']")
	private WebElement Below1000_displayedoption ;

	@FindBy(xpath="//a[@data-id='16718']")
	private WebElement  wishList;
	
	@FindBy(xpath="//img[@alt='The Rosette Ring']")
	private WebElement  LocatewishList;
	
	
	@FindBy(xpath="//span[@class='icon-img hs wishlist-icon']")
	private WebElement  wishListicon;
	
	
	public RingsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ViewDetails(WebDriver driver)
	{
		View_Details.click();
	}
	
	public void Rings(WebDriver driver)
	{
		Actions a=new Actions(driver);
		a.moveToElement(Ring).click().perform();
	}
	
	public void mouseoveronproduct(WebDriver driver)
	{
		Actions a= new Actions(driver);
		a.moveToElement(product);
	}
	
	public void movetoEngagement(WebDriver driver)
	{
		Actions a= new Actions(driver);
		a.moveToElement(Engagement).click().build().perform();;
	}
	
	public void movetoprice(WebDriver driver)
	{
		Actions a= new Actions(driver);
		a.moveToElement(price).click().build().perform();

	}
	
	public void below10000(WebDriver driver)
	{
		Actions a= new Actions(driver);
		a.moveToElement(Below1000).click().perform();
	}
	
	public  void metal(WebDriver driver)
	{
		Actions a= new Actions(driver);
		a.moveToElement(metal).perform();
		
	}
	public void above50000(WebDriver driver)
	{
		Actions a= new Actions(driver);
		a.moveToElement(rs50000_above).click().perform();
	}
	public void rs20000_30000(WebDriver driver)
	{
		Actions a= new Actions(driver);
		a.moveToElement(rs20000_30000).click().perform();
	}
	
	public void clickRose(WebDriver driver)
	{
		int y=RoseRing.getLocation().getY();
		System.out.println(y);
		JavascriptExecutor j= (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,"+y+")");
		RoseRingtowishList.click();
		
		
			
		}
	
	public void clickWishList(WebDriver driver)
	{
		int y=LocatewishList.getLocation().getY();
		
		JavascriptExecutor j= (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,"+y+")");
	
		wishList.click();
	}
	
	
	public void w()
	{
		wishList.click();
	}
	public void clickWishListicon()
	{
		wishListicon.click();
	}
	
	
}
