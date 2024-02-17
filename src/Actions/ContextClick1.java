package Actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick1 {

	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://timetracker.ctepl.com/actitime/login.do");
		WebElement ele = driver.findElement(By.id("licenseLink"));
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
		
		Robot r = new Robot();
		int l = KeyEvent.VK_L;
		r.keyPress(l);
		Thread.sleep(5000);
		r.keyRelease(l);
	}

}
