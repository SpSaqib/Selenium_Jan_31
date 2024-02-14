package Synchronisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implicit1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.cssSelector("a[rel='async']")).click();
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Saqib");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("SP");
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("testing@gmail.com");
		driver.findElement(By.cssSelector("input[autocomplete='new-password']")).sendKeys("Testing@12345");

	}

}
