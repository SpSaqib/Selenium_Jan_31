package SelectTag;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultSelected {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("file:///E:/HTML/Select/Multiple%20Options.HTML");
	
		WebElement emp = driver.findElement(By.id("empire"));
		Thread.sleep(2000);
		
		Select sel=new Select(emp);
		
		sel.selectByIndex(1);
		Thread.sleep(1000);	
		sel.selectByValue("p");
		Thread.sleep(1000);		
		sel.selectByVisibleText("Fish");
		
	//	sel.deselectAll();
		
		sel.deselectByIndex(1);
		Thread.sleep(1000);
		
		sel.deselectByValue("p");
		Thread.sleep(1000);
		
		sel.deselectByVisibleText("Fish");
		
		////it will check whether the tag is built from multiple tag or not
		System.out.println(sel.isMultiple());
	}

}
