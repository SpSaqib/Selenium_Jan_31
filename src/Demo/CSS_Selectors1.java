package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSS_Selectors1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[placeholder='Email address or phone number']")).sendKeys("Saqib");
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("input[placeholder='Password']")).sendKeys("Hello@123");
		driver.quit();
	}

}
