package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FBloginWithoutPOM {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.netflix.com/login");
		Thread.sleep(2000);

		
		WebElement unTB = driver.findElement(By.name("userLoginId"));
		unTB.sendKeys("saqib@gmail.com");
		WebElement pwTB = driver.findElement(By.name("password"));
		pwTB.sendKeys("Saqib2337");
		WebElement lgBT = driver.findElement(By.xpath("//button[@type='submit']"));
		lgBT.click();
		Thread.sleep(2000);
		
		unTB.sendKeys("saqib@gmail.com");
		pwTB.sendKeys("Saqib2334267");
		lgBT.click();
		
		
//		unTB.sendKeys("Saqib");
//		
//		pwTB.sendKeys("Saqib2337");
//		
//		lgBT.click();
	}

}
