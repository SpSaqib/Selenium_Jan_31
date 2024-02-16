package AutoSuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Program1 {

	public static void main(String[] args) {
		
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
		
		driver.findElement(By.name("q")).sendKeys("Bollywood");
		
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//li[@data-view-type='1']"));
		
		int count = autoSuggestions.size();
		System.out.println(count);
		
		
		for (WebElement suggestion:autoSuggestions)
		{
			
			System.out.println(suggestion.getText());
		}

	}

}
