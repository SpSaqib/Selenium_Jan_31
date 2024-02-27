package POM;

import java.sql.Driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SignUpPage {
	
	@FindBy(xpath="(//a[@role='button'])[2]")
	public WebElement signUp;
	
	@FindBy(xpath="//input[@name='firstname']")
	public WebElement firstName;
	
	@FindBy(name="lastname")
	public WebElement lastName;
	
	@FindBy(xpath="//input[@name='reg_email__']")
	public WebElement phoneNumber;
	
	@FindBy(xpath="//input[@autocomplete='new-password']")
	public WebElement password;
	
	@FindBy(name="birthday_day")
	public WebElement birthdayDay;
	
	@FindBy(name="birthday_month")
	public WebElement birthdayMonth;
	
	@FindBy(name="birthday_year")
	public WebElement birthdayYear;
	
	@FindBy(xpath="//input[@value='2']")
	public WebElement malegender;
	
	@FindBy(xpath="//button[@name='websubmit']")
	public WebElement signUpBTN;
	
	
	public SignUpPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public void clickOnSignUp()
	{
	
		signUp.click();
	}
	
	public void enterFirstName(String fn)
	{
		firstName.sendKeys(fn);
	}
	
	public void enterLastName(String ln)
	{
		lastName.sendKeys(ln);
	}
	
	public void enterEnterPhoneNumber(String ph)
	{
		phoneNumber.sendKeys(ph);
	}
	
	public void enterPassword(String ps)
	{
		password.sendKeys(ps);
	}
	
	
	public void clickOnDate()
	{
		birthdayDay.click();
	}
	
	public static void sleeping() throws InterruptedException
	{
		Thread.sleep(2000);
	}
	
	public void selectDate(String date)
	{
		Select sel=new Select(birthdayDay);
		sel.selectByValue(date);
	}
	
	public void selectMonth(String month)
	{
		Select sel1=new Select(birthdayMonth);
		sel1.selectByValue(month);
	}
	
	public void selectYear(String year)
	{
		Select sel2=new Select(birthdayYear);
		sel2.selectByValue(year);
	}
	
	public void clickOnMaleGender()
	{
		malegender.click();
	}
	
	public void clickOnFinalSignup()
	{
		signUpBTN.click();
	}
	
}
