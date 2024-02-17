package AutoSuggestions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeOptionPrinting {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.co.in/");
//		driver.findElement(By.xpath("//a[@role='button']")).click();
		
	//	driver.findElement(By.xpath("//button[@jsname='ZUkOIc']")).click();
		
//		driver.findElement(By.className("M6CB1c rr4y5c")).click();

	//	ngVsM u4RcUd
	}

}
