package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingLeftAndRight {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		
		//Assigning subclass object to the interface
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		//Scroll till end
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		

	}

}
