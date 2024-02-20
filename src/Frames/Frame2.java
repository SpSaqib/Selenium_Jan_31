package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frame2 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/HTML/Frame1/Page21.html");
		driver.switchTo().frame(0);
		driver.switchTo().frame(0);
		driver.findElement(By.id("c")).sendKeys("Karina Kapoor");
		Thread.sleep(2000);
		driver.switchTo().parentFrame();
		driver.findElement(By.id("gf1")).sendKeys("Katrina");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("m")).sendKeys("Salman");
		driver.findElement(By.id("gf2")).sendKeys("Sangeeta Bijlani");
		Thread.sleep(2000);
		
	
	}

}
