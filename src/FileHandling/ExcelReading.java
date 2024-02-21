package FileHandling;
import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
//Import below line for Cell c =r.getCell(0);
import org.apache.poi.ss.usermodel.Cell;



public class ExcelReading 
{
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream f = new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium_Practice_Janaury_2024\\Book1.xlsx");
			Workbook wb = WorkbookFactory.create(f);
	        Sheet s = wb.getSheet("Sheet1");
	        Row r = s.getRow(1);
	        Cell c =r.getCell(1);
	        String data = c.toString();
	        System.out.println(data);
	        
	        Sheet s1 = wb.getSheet("Sheet1");
	        Row r1 = s1.getRow(0);
	        Cell c1 =r1.getCell(1);
	        String data1 = c.toString();
	        System.out.println(data1);
	        //or
//	        String data2 = WorkbookFactory.create(f).getSheet("Sheet1").getRow(1).getCell(1).toString();
//	        System.out.println(data2);
	      
		
	}
}
