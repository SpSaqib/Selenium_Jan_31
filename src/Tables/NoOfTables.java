package Tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NoOfTables {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/HTML/Table/table.html");
		// No of tables in the web page
		List<WebElement> noOfTables = driver.findElements(By.xpath("//table"));
		System.out.println(noOfTables.size());
		
		// No of rows in present in all tables
		List<WebElement> noOfRowsInAllTables = driver.findElements(By.xpath("//table[@border='1']/tbody/tr"));
		System.out.println(noOfRowsInAllTables.size());

		// No of rows in first tables
		List<WebElement> noOfRowsInFirstTable = driver.findElements(By.xpath("//table[@id='t1']/tbody/tr"));
		System.out.println(noOfRowsInFirstTable.size());
		
		//Read all cell data in all tables
		List<WebElement> readContentOfAllcells = driver.findElements(By.xpath("//table//tr/td"));
		System.out.println(readContentOfAllcells.size());
		
		for(WebElement cell:readContentOfAllcells)
		{
			System.out.println(cell.getText());
		}
		
	}

}
