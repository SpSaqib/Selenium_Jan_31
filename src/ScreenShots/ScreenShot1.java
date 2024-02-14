package ScreenShots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenShot1 {

	public static void main(String[] args) throws IOException, InterruptedException  {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
						
		TakesScreenshot ts = (TakesScreenshot)driver;
		
		File src = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("C:\\Users\\HP\\eclipse-workspace\\Selenium_Practice_Janaury_2024\\demo.png");
		
		Files.copy(src, dest);
		Thread.sleep(2000);
		driver.quit();

	}

}
