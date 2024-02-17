package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("file:///E:/HTML/Doubleclick.html");
		
		WebElement doubleClick = driver.findElement(By.id("dd"));
		
		Actions act=new Actions(driver);
		
		Thread.sleep(2000);
		act.doubleClick(doubleClick).build().perform();
		
		WebElement welcomeToIndia = driver.findElement(By.id("demo"));
		
		boolean v = welcomeToIndia.isDisplayed();
		if(v)
		{
			System.out.println("Welcome to india is displayed");
		}
		else
		{
			System.out.println("Welcome to india is not displayed");
		}

	}

}
