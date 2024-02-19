package JavaScriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling2 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		//Assigning subclass object to the interface
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		
		//Scrolling up and down for 10 times
		for(int i=0;i<10;i++)
		{
		js.executeScript("window.scrollBy(0,50)");
		Thread.sleep(2000);
		}
		for(int i=0;i<10;i++)
		{
		js.executeScript("window.scrollBy(0,-50)");
		Thread.sleep(2000);
		}

	}

}
