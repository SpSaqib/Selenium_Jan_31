package Tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StringToInteger2 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/HTML/Table/table.html");
		
		List<WebElement> elements = driver.findElements(By.xpath("//td"));
		
		int count=0;
		
		for(WebElement ele:elements)
		{
			String text = ele.getText();
			
			// you will get NumberFormatException if Sting contains text values e.f s, Karnataka ,bla bla
			try
			{
			int n = Integer.parseInt(text);
			
			}
			
			catch(NumberFormatException e)
			{
				System.out.println(text);
				count++;
			}
		}
		System.out.println("No of Strings = "+count);
		
	}

}
