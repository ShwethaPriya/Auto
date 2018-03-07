package ecom;



import org.apache.bcel.verifier.exc.StaticCodeConstraintException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.Colors;
import org.testng.Reporter;

import generics.BaseTest;

public class Verify_cart {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("http://live.guru99.com/");
		WebElement mobile=driver.findElement(By.xpath("//a[text()='Mobile']"));
		Actions a= new Actions(driver);
		a.moveToElement(mobile).click().perform();
		driver.findElement(By.xpath("//a[text()='Sony Xperia']")).click();
		driver.findElement(By.xpath("//button[@title='Add to Cart']")).click();
		//driver.findElement(By.xpath("//span[text()='The maximum quantity allowed for purchase is 500.']"));
		WebElement w=driver.findElement(By.xpath("//input[@title='Qty']"));
		Thread.sleep(1000);
		w.clear();
		w.sendKeys("1000");
		driver.findElement(By.xpath("//span[text()='Update']")).click();
		WebElement e=driver.findElement(By.xpath("//p[contains(text(),'The maximum quantity allowed for')]"));
		String s= e.getCssValue("color");
		System.out.println(s);
		String hexa= Color.fromString(s).asHex();
		if(hexa.equals("#df280a"))
		{
			System.out.println("err msg is displayed in red");
		}
		
	driver.findElement(By.xpath("//span[text()='Empty Cart']")).click();
	String err=driver.findElement(By.xpath("(//p[text()='You have no items in your shopping cart.'])[2]")).getText();
	String act= "You have no items in your shopping cart.";
	if(act.equals(err))
	{
		System.out.println("msg is displayed");
	}
	}

}
