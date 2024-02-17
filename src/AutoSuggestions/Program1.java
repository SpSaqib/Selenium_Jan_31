package AutoSuggestions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import ScreenShots.CreatingGenericMethodForScreenshot;

public class Program1 {

	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.airindia.com/");
		Thread.sleep(2000);
		driver.findElement(By.id("To")).sendKeys("Mu");
		Thread.sleep(2000);
		List<WebElement> autoSuggestions = driver.findElements(By.xpath("//ngb-typeahead-window[@role='listbox']//button"));
		
		int count = autoSuggestions.size();
		System.out.println(count);
		
		
		for (WebElement suggestion:autoSuggestions)
		{
			
			System.out.println(suggestion.getText());
		}
		
		CreatingGenericMethodForScreenshot s=new CreatingGenericMethodForScreenshot();
		s.getScreenShot(driver, "Airline");
		for (WebElement suggestion:autoSuggestions)
		{
			
			if(suggestion.getText().equals("Mumbai, India, IN"))
			{
				suggestion.click();
			}
		}
		

	}

}
