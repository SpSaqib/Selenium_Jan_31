package Popups;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildBrowser {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Thread.sleep(2000);
		//One window opening another window is called child browser popup
		
		String win = driver.getWindowHandle();
		System.out.println(win);
		
		driver.findElement(By.xpath("//a[@title='Remote']")).click();
		Set<String> allwin = driver.getWindowHandles();
		
		for(String win1:allwin)
		{
			Thread.sleep(2000);
			driver.switchTo().window(win1);
			System.out.println(driver.getTitle());
		}
		
		driver.close();
	}

}
