package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class CreatingGenericMethodForScreenshot {
	
	public static void getScreenShot(WebDriver driver,String name) 
	{
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./"+name+".png");
		
		try
		{
		Files.copy(src, dest);
		}
		catch(IOException e)
		{
			
		}
	}

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		getScreenShot(driver, "Faceboook homem page");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@role='button'])[2]")).click();
		getScreenShot(driver, "Create Account");
		
	}

}
