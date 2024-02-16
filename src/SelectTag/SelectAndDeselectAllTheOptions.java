package SelectTag;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectAndDeselectAllTheOptions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("file:///E:/HTML/Select/Multiple%20Options.HTML");
	
		WebElement emp = driver.findElement(By.id("empire"));
		
		Select sel=new Select(emp);
		
		List<WebElement> allopts = sel.getOptions();
		int count = allopts.size();
		
		for(int i=0;i<count;i++)
		{
			sel.selectByIndex(i);
			Thread.sleep(1000);
		}

		for(int i=0;i<count;i++)
		{
			sel.deselectByIndex(i);
			Thread.sleep(1000);
		}
	}

}
