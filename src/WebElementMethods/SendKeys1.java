package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SendKeys1 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/HTML/WebElements()/FirstNameLastName.html");
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		WebElement fn = driver.findElement(By.id("fn"));
		Thread.sleep(2000);
		fn.sendKeys("Virat");
		Thread.sleep(2000);
		fn.sendKeys(Keys.CONTROL+"ac");
		Thread.sleep(2000);

		driver.findElement(By.id("ln")).sendKeys(Keys.CONTROL+"v");
		Thread.sleep(2000);
		driver.quit();
	}

}
