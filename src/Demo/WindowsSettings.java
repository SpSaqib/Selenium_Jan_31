package Demo;

import java.awt.Dimension;
import java.awt.Point;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsSettings {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		Dimension d =new Dimension(150,250);
		

//		Options opt = driver.manage();
//		Window win = opt.window();
//		win.setSize(d);
		

	//driver.manage().window().setSize(d);
		
//		Point p = new Point(150,300);
//		driver.manage().window().setPosition(p);
		
		driver.manage().window().fullscreen();
		
	}

}
