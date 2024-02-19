package JavaScriptExecutor;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingDisable {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/HTML/Disabled.html");
		
		//Assigning subclass object to the interface
		JavascriptExecutor js = (JavascriptExecutor)driver;
		Thread.sleep(2000);
		//Handling Disable elements document.getElementById('fn').value='Pass value '
		
		js.executeScript("document.getElementById('fn').value=' '");
		Thread.sleep(2000);
		js.executeScript("document.getElementById('fn').value='Karnataka'");
		Thread.sleep(2000);
	//	js.executeScript("document.getElementById('l').click()");
		Thread.sleep(2000);

	}

}
