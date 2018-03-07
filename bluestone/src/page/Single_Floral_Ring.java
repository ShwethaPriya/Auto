package page;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Single_Floral_Ring {
	@FindBy(xpath="(//a[@id='pid_492']) [1]")
	private  WebElement floralRing;

	@FindBy(id="ringselect")
	private  WebElement selectRing;

	public  Single_Floral_Ring(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void clickfloral(WebDriver driver)
	{
		int y=floralRing.getLocation().getY();
		JavascriptExecutor j= (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,"+y+")");
		floralRing.click();
	}

	public void select_ring()
	{
		Select select= new Select(selectRing);
		/*List<WebElement> option =	select.getOptions();

		for(WebElement op: option)
		{
			String text= op.getText();
			System.out.println(text);
		}*/
		select.isMultiple();
		select.selectByVisibleText("10");
	}

	public void scroll(WebDriver driver)
	{
		int y= floralRing.getLocation().getY();
		JavascriptExecutor j= (JavascriptExecutor)driver;
		for(int i=1;i<=5;i++)
		{
			j.executeScript("window.scrollBy(0,y)");
			//j.executeScript("arguments[0].scrollIntoView();",floralRing);
		}

	}
}

