package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

public class FaceBook_LoginPage {
	private WebElement unTB;
	private WebElement pwTB;
	private WebElement lgBT;

	
	public  FaceBook_LoginPage(WebDriver driver)
	{
		 unTB = driver.findElement(By.name("email"));
		 pwTB = driver.findElement(By.xpath("//input[@type='password']"));
		 lgBT = driver.findElement(By.xpath("//button[@type='submit']"));
		
	}
	
	//Utilization
	public void enterUsername(String un)
	{
		unTB.sendKeys(un);
	}
	
	public void enterPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	
	public void clickLoginButton()
	{
		lgBT.click();
	}

}
