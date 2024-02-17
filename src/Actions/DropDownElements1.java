package Actions;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DropDownElements1 {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		WebElement ele = driver.findElement(By.xpath("//div[@class='_1ch8e_']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(ele).build().perform();
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//div[@class='_16rZTH']//a"));
		
		int count=suggestions.size();
		
		for(WebElement sug:suggestions)
		{
			System.out.println(sug.getText());
		}
		
		driver.findElement(By.xpath("//a[text()='Women Western']")).click();

	}

}
