package FileHandling2;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetNoRowsAndColumns {

	public static void main(String[] args) throws EncryptedDocumentException, IOException{
		FileInputStream file=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium_Practice_Janaury_2024\\Book1.xlsx");
		
	    Workbook wb = WorkbookFactory.create(file);
		
	     org.apache.poi.ss.usermodel.Sheet sh = wb.getSheet("Sheet1");
	     
	     //Last of the sheet---->> it will start from 0th index
	     int lastRow = sh.getLastRowNum();
	     System.out.println(lastRow);
	     
	     
		Row r = sh.getRow(2);
		short lastColumn = r.getLastCellNum();
		System.out.println(lastColumn);

	}

}
