package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLaunchSingleBrowser {

	public static void main(String[] args) throws InterruptedException {
		
//		System.setProperty("webdriver.edge.driver", "C:\\Users\\HP\\Downloads\\edgedriver_win64\\msedgedriver.exe");
//	    System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\Downloads\\chromedriver-win32\\chromedriver-win32\\chromedriver.exe");
			
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.facebook.com/");
			Thread.sleep(1000);
			driver.manage().window().maximize();
			String title = driver.getTitle();
			System.out.println(title);
			String URL = driver.getCurrentUrl();
			System.out.println(URL);
			String src = driver.getPageSource();
			System.out.println(src);
			driver.manage().deleteAllCookies();
	//		driver.quit();			
	}

}
