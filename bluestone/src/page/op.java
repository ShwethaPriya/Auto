package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class op {
	public static void main(String[] args) {
		String s="I love India";
		String[]s1=s.split(" ");
		String rev="";
		for(int i=s1.length-1;i>=0;i--)
		{
			rev=rev+s1[i]+" ";
		}
		System.out.print(rev);
	}
}

