package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class launchingBrowserwithNavigate {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/Hammer-Wallpaper-Finished-Anti-Skid-Non-Slip/dp/B08R6WF7CH");
		Thread.sleep(1000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.navigate().back();
		Thread.sleep(1000);
		driver.navigate().refresh();

	}

}
