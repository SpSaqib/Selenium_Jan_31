package SelectTag;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllOptionsPresentInListBox {

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("file:///E:/HTML/Select/Multiple%20Options.HTML");
	
		WebElement emp = driver.findElement(By.id("empire"));
		Thread.sleep(2000);
		
		Select sel=new Select(emp);
		List<WebElement> allOptions = sel.getOptions();
		allOptions.size();
		System.out.println(allOptions.size());
		
		List<WebElement> options = sel.getOptions();
		for(WebElement option:options)
		{
			System.out.println(option.getText());
		}

	}

}
