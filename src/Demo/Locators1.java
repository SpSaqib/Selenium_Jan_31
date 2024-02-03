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
		driver.findElement(By.id("email")).sendKeys("saqib");
		driver.findElement(By.id("pass")).sendKeys("Aladin123");
//		driver.findElement(By.name("login")).click();
		driver.findElement(By.tagName("a")).click();
//		driver.quit();
		
	}

}
