package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GeneralMethods {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/HTML/WebElements()/FirstNameLastName.html");
		WebElement fn = driver.findElement(By.id("fn"));
		Thread.sleep(2000);
		String tagName = fn.getTagName();
		System.out.println(tagName);
		WebElement help = driver.findElement(By.id("g"));
		System.out.println(help.getText());
		System.out.println(help.getAttribute("href"));
	}

}
