package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook_LoginPageDriver {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		FaceBook_LoginPage lp=new FaceBook_LoginPage(driver);
		lp.clickLoginButton();
		Thread.sleep(2000);
		lp.enterUsername("Saqib");
		Thread.sleep(2000);
		lp.enterPassword("Saqibdjdkdjj@1345");
		Thread.sleep(2000);
		lp.clickLoginButton();
		
		lp.enterUsername("7892158963");
		Thread.sleep(2000);
		lp.enterPassword("Akaay@123");
		Thread.sleep(2000);
		lp.clickLoginButton();

	}

}
