package Popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HiddenDivisionPopup {

	public static void main(String[] args) {
		
		//to diable show notifications popup
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		
		String url="https://www.airvistara.com/in/en/travel-information/vistara-exclusives/vistara-di"
				+ "rect?gclid=Cj0KCQiAz8GuBhCxARIsAOpzk8waoT4Ew_vRfkXzHyJFazSavh9l_UjttvQ2O74_CWOO7GQ13p317pwaAmLFEAL"
				+ "w_wcB&utm_source=google&utm_medium=Search&utm_campaign=PMX_Brand_Dom_Search_Nov_22&ef_id=Cj0KCQiAz8GuB"
				+ "hCxARIsAOpzk8waoT4Ew_vRfkXzHyJFazSavh9l_UjttvQ2O74_CWOO7GQ13p317pwaAmLFEALw_wcB:G:s&s_kwcid=AL!596!3!6598"
				+ "05002549!p!!g!!vistara&s_kwcid=AL!596!3!659805002549!p!!g!!vistara&gad_source=1";
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.id("accept-all-btn-section")).click();
		driver.findElement(By.id("calender_icon")).click();
		driver.findElement(By.xpath("//a[text()='18']")).click();
		driver.findElement(By.xpath("//a[text()='18']")).click();

	}

}
