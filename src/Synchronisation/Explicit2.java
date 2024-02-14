package Synchronisation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicit2 {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
	
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.findElement(By.cssSelector("a[rel='async']")).click();
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector("input[name='firstname']"))));
		driver.findElement(By.cssSelector("input[name='firstname']")).sendKeys("Saqib");
		driver.findElement(By.cssSelector("input[name='lastname']")).sendKeys("SP");
		driver.findElement(By.cssSelector("input[name='reg_email__']")).sendKeys("testing@gmail.com");
		driver.findElement(By.cssSelector("input[autocomplete='new-password']")).sendKeys("Testing@12345");

	}

}
