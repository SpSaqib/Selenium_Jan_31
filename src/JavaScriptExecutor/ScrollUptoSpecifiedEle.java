package JavaScriptExecutor;

import java.awt.Point;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUptoSpecifiedEle {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		//Assigning subclass object to the interface
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		
		WebElement ele = driver.findElement(By.xpath("//h2[text()='News']"));
		org.openqa.selenium.Point p = ele.getLocation();
		int yy=p.getY()-200;
		
		
		
		js.executeScript("window.scrollBy(0,'"+yy+"')");
		Thread.sleep(2000);
		

	}
}
