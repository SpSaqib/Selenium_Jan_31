package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isDisabled {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/HTML/Disabled.html");
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
		boolean enabled = driver.findElement(By.id("fn")).isEnabled();
		System.out.println(enabled);
		
		boolean disabled = driver.findElement(By.id("fn")).isDisplayed();
		System.out.println(disabled);

	}

}
