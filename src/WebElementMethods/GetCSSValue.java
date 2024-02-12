package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSValue {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/HTML/WebElements()/FirstNameLastName.html");
		WebElement help = driver.findElement(By.id("g"));
		
		String color = help.getCssValue("color");
		System.out.println(color);
		
		String size = help.getCssValue("font-size");
		System.out.println(size);
		
		String style = help.getCssValue("font-style");
		System.out.println(style);

	}

}
