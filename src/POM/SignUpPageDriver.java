package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SignUpPageDriver {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		SignUpPage.sleeping();
		
		SignUpPage sp=new SignUpPage(driver);
		sp.clickOnSignUp();
		SignUpPage.sleeping();
		sp.enterFirstName("AB");
		SignUpPage.sleeping();
		sp.enterLastName("Deviliers");
		SignUpPage.sleeping();
		sp.enterEnterPhoneNumber("7892158963");
		SignUpPage.sleeping();
		sp.enterPassword("AB@123");
		SignUpPage.sleeping();
		sp.selectDate("22");
		SignUpPage.sleeping();
		sp.selectMonth("4");
		SignUpPage.sleeping();
		sp.selectYear("1996");
		SignUpPage.sleeping();
		sp.clickOnMaleGender();
		SignUpPage.sleeping();
		sp.clickOnFinalSignup();
	}

}
