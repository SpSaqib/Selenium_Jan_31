package Tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WithoutUsingXpath {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/HTML/Table/table.html");
		
		System.out.println(driver.getPageSource());
		
		List<WebElement> table = driver.findElements(By.tagName("table"));
		System.out.println(table.size());
		
		//Limiting the scope of driver
		WebElement table1 = driver.findElement(By.id("t1"));
		
		List<WebElement> noOfRowsInFirstTable = table1.findElements(By.tagName("tr"));
		System.out.println(noOfRowsInFirstTable.size());
		
		List<WebElement> noOfCellsInFirstTable = table1.findElements(By.tagName("td"));
		System.out.println(noOfCellsInFirstTable.size());
		
		//Number of c0lumns in first table1
		List<WebElement> noOfColumnsInFirstTable = table1.findElements(By.xpath("(//table[@id='t1']//tr)[1]/td"));
		System.out.println(noOfColumnsInFirstTable.size());

	}

}
