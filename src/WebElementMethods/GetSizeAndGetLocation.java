package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSizeAndGetLocation {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		WebElement un = driver.findElement(By.name("email"));
		boolean displayed = un.isDisplayed();
		System.out.println(displayed);
	
		
		Dimension d = un.getSize();
		System.out.println(d);
		int h = d.getHeight();
		System.out.println(h);
		int w = d.getWidth();
		System.out.println(w);
		
		Point p = un.getLocation();
		System.out.println(p);
		int x = p.getX();
		int y = p.getY();
		System.out.println(x);
		System.out.println(y);
		
		
	}

}
