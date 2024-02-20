package Frames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame3 {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS );
		
	//	WebElement ele = driver.findElement(By.xpath("//iframe[@cd_frame_id_='5cc3f3a1194665791f4b04f4f69a2732']"));
		driver.switchTo().frame(0);
		Thread.sleep(2000);
		WebElement draggable = driver.findElement(By.id("draggable"));
		WebElement droppable = driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(draggable, droppable).build().perform();
		Thread.sleep(2000);
	}

}
