package Tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StringToInteger {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/HTML/Table/table.html");
		
		List<WebElement> elements = driver.findElements(By.xpath("//td"));
		
		int count=0;
		int sum=0;
		for(WebElement ele:elements)
		{
			String text = ele.getText();
			
			// you will get NumberFormatException if Sting contains text values e.f s, Karnataka ,bla bla
			try
			{
			int n = Integer.parseInt(text);
			System.out.println(n);
			count++;
			sum=sum+n;
			}
			
			catch(NumberFormatException e)
			{
				
			}
		}
		System.out.println("Numbers are = "+count);
		System.out.println("Sum of Numbers ="+sum);
	}

}
