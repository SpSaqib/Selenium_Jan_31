package FileHandling2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadExcelFile1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {

		FileInputStream file=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium_Practice_Janaury_2024\\Book1.xlsx");
		
//		Workbook wb = WorkbookFactory.create(file);
//		
//		Sheet sh = wb.getSheet("Sheet1");
//		Row r = sh.getRow(1);
//		Cell c = r.getCell(1);
//		String data = c.toString();
//		System.out.println(data);
		
		String data1 = WorkbookFactory.create(file).getSheet("Sheet1").getRow(0).getCell(2).toString();
		System.out.println(data1);
	}

}
