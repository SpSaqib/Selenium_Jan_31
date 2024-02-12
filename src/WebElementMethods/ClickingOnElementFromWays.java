package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickingOnElementFromWays {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/HTML/WebElements()/FirstNameLastName.html");
		
		//By click
		WebElement clickAble = driver.findElement(By.id("s"));

		//By click
	//	clickAble.click();
		Thread.sleep(2000);
	//	clickAble.submit();
		
		clickAble.sendKeys(Keys.ENTER);	
	}

}
