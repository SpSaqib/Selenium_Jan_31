package WebElementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class isSelected {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///E:/HTML/ABABABABAB.html");
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		boolean notSelected = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected();
		System.out.println(notSelected);
		driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).click();
		
		boolean selected = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]")).isSelected();
		System.out.println(selected);
		
		

	}

}
