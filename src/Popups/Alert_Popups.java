package Popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popups {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/HTML/Popup/Alert.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		
		
		Alert a = driver.switchTo().alert();
		System.out.println(a.getText());
		a.accept();
	
		System.out.println(driver.getPageSource());
	}

}
