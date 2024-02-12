package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CricbuzIndependent_And_Dependant_Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.cricbuzz.com/cricket-series/7175/icc-under-19-world-cup-2024/points-table");
		driver.manage().window().maximize();
		String text = driver.findElement(By.xpath("(//th[text()='Group A']/../../..//div[@class='cb-col cb-col-84'])[3]")).getText();
		System.out.println(text);
		
	}

}
