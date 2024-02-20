package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/HTML/Frame1/Page11.html");
		
		//With index 
		driver.switchTo().frame(0);
		//with String
	//	driver.switchTo().frame("frame");
		//with WebElement
//		WebElement ele = driver.findElement(By.id("frm"));
//		driver.switchTo().frame(ele);
		driver.findElement(By.id("gf1")).sendKeys("Katrina");
		
		driver.switchTo().defaultContent();
		driver.findElement(By.id("m")).sendKeys("Salman");
		
		Thread.sleep(2000);
		driver.quit();
	}

}
