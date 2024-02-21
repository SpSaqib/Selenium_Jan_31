package AutoSuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium_Option {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Selenium");
		Thread.sleep(2000);
		List<WebElement> elements = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']//li"));
		System.out.println(elements.size());
		for(WebElement ele:elements)
		{

			System.out.println(ele.getText());
		}
		driver.quit();

	}

}
