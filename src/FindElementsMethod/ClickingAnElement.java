package FindElementsMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickingAnElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///E:/HTML/ABABABABAB.html");
		List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
//		for (  WebElement checkBoxe : checkBoxes)
//		{
//			checkBoxe.click();
//			Thread.sleep(1000);
//		}
		
		int length = checkBoxes.size();
		
		
		//reverse clicking
//		for(int i=length-1; i>=0;i--)
//		{
//			WebElement checkBox = checkBoxes.get(i);
//			checkBox.click();
//			Thread.sleep(1000);
//		}
		
		for(int i=0; i<length;i++)
		{
			if(i%2!=0)
			{
				WebElement checkBox = checkBoxes.get(i);
				checkBox.click();
				
			}
			
		}
	

	}

}
