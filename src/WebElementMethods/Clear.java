package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Clear {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/HTML/WebElements()/FirstNameLastName.html");
		WebElement fn = driver.findElement(By.id("fn"));
		Thread.sleep(2000);
		fn.sendKeys("Virat");
		Thread.sleep(2000);
//		By sendkeys
//		fn.sendKeys(Keys.CONTROL+"a");
//		Thread.sleep(2000);
//		fn.sendKeys(Keys.DELETE);
//		Thread.sleep(2000);
		
		fn.clear();
	//	Thread.sleep(5000);
		driver.quit();

	}

}
