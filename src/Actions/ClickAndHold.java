package Actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ClickAndHold {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://demo.automationtesting.in/Static.html");
		
		
		WebElement draggable1 = driver.findElement(By.id("angular"));
		WebElement draggable2 = driver.findElement(By.id("mongo"));
		WebElement draggable3 = driver.findElement(By.id("node"));
		WebElement droppable = driver.findElement(By.id("droparea"));
		
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.clickAndHold(draggable1).moveToElement(droppable).click().build().perform();
		act.clickAndHold(draggable2).moveToElement(droppable).click().build().perform();
		act.clickAndHold(draggable3).moveToElement(droppable).click().build().perform();

	}

}
