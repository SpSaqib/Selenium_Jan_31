package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfirmationAndPrompt_Popup {
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/HTML/Popup/Prompt%20Popup.HTML");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()=' Try it']")).click();
		
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		Thread.sleep(2000);
		//Here in popup sendkeys from automation text is not showing but its working properly 
		a.sendKeys("Saqib");
		Thread.sleep(2000);
		a.accept();
		WebElement successMessage = driver.findElement(By.id("demo"));
		System.out.println(successMessage.getText());
	
		System.out.println(driver.getPageSource());
	}
	

}
