package POM;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FB_LoginPage {

	//Declaration
	@FindBy(id="email")
	private WebElement UnTB;
	
	@FindBy(name="pass")
	private WebElement pwTB;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement lgBT;
	
	//Not allowed
//	@FindBy(css selector="button[type='submit']")
//	private WebElement lgBT;
	
	//allowed
//	@FindBy(css="button[type='submit']")
//	private WebElement lgBT;
	
	//Initialization
	
	public FB_LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void enterUsername(String un)
	{
		UnTB.sendKeys(un);
	}
	
	public void enterPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	
	public void clickLoginButton()
	{
		lgBT.click();
	}
	
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		FB_LoginPage lp=new FB_LoginPage(driver);
		lp.clickLoginButton();
		Thread.sleep(3000);
		lp.enterUsername("7892158963");
		Thread.sleep(1000);
		lp.enterPassword("Akaay@123");
		Thread.sleep(1000);
		lp.clickLoginButton();
		Thread.sleep(1000);
		
	}

}
