package page;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	
	@FindBy(id="login")
	private WebElement LogIn;
	
	@FindBy(id="email-id")
	private WebElement unTB;
	
	@FindBy( xpath="//input[@id='password']")
	private WebElement pwTB;
	
	@FindBy(id="edit-login-account")
  private	WebElement loginBtn;
	
	@FindBy(xpath="//div[@class='formErrorContent']")
	private WebElement errMsg;
	
	public LoginPage(WebDriver driver)
	{
		
		PageFactory.initElements(driver,this);
	}
	
	public void LogInn() 
	{
		LogIn.click();
	}


	public void setusername(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void setpassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	public void login()
	{
		loginBtn.click();
	}
	

	public void verifyerrmsg(WebDriver driver)
	{
		WebDriverWait wait= new WebDriverWait(driver, 10);
		try
		{
			wait.until(ExpectedConditions.visibilityOf(errMsg));
		}
		catch(Exception e)
		{
			
		}
				
	}
}
