package generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.beust.jcommander.Parameter;

import generics.AUL;
import generics.IAutoConst;

public class BaseTest implements IAutoConst{
	public static WebDriver driver;
	static
	{
		System.setProperty(Chrome_key, Chrome_Value);
		System.setProperty(Gecko_key, Gecko_Value);
	}
	@Parameters("browser")
	@BeforeMethod(alwaysRun=true)
	public void openBrowser(@Optional("chrome")String browser)
	{
	
			if(browser.equals("chrome"))
			{
			driver = new ChromeDriver();
			}
			else
			{
				driver = new FirefoxDriver();	
			}
			String url=AUL.getProperty(SETTING_PATH, "URL");
			driver.get(url);
			String strITO=AUL.getProperty(SETTING_PATH, "ITO");
			long ITO=Long.parseLong(strITO);
			driver.manage().timeouts().implicitlyWait(ITO,TimeUnit.SECONDS);
		}

	@AfterMethod
	public void closeBrowser(ITestResult res)
	{
		String testName=res.getName();
		if(res.getStatus()==2)
		{
			AUL.Takephoto(PHOTO_PATH,testName, driver);
		}
		driver.quit();
	}

}
