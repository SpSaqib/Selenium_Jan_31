package FindElementsMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tofindhiddenlinks {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/downloads/");
		List<WebElement> links = driver.findElements(By.tagName("a"));

		int count = links.size();
		System.out.println(count);
		
//		for(WebElement link:links)
//		{
//			System.out.println(link.getText());
//	
//		}
//		
		int c=0;
		for(WebElement link:links)
		{
			boolean m = link.isDisplayed();
			if(m)
			{
				c++;
			}
		}
		System.out.println(c);
		System.out.println(count-c);
		
		driver.quit();
	}

}
