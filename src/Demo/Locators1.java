package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("a[rel='async']")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Saqib");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("SP");
		Thread.sleep(2000);  
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("testing@gmail.com");
		driver.findElement(By.cssSelector("input[autocomplete='new-password']")).sendKeys("Testing@12345");
		
	//	driver.findElement(By.name("firstname")).sendKeys("Saqib");
//		driver.findElement(By.id("email")).sendKeys("saqib");
//		driver.findElement(By.id("pass")).sendKeys("Aladin123");
////		driver.findElement(By.name("login")).click();
//		driver.findElement(By.tagName("a")).click();
////		driver.quit();
		
	}

}
