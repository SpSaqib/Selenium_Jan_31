package FindElementsMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstProgram {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));

		int count = links.size();
		System.out.println(count);
		
		for(WebElement link:links)
		{
			System.out.println(link.getText());
	
		}
		
		
	//	driver.quit();
		
	}

}
