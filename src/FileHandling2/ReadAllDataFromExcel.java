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

public class ReadAllDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium_Practice_Janaury_2024\\Book1.xlsx");
		
		Workbook wb = WorkbookFactory.create(file);
		
		Sheet sh = wb.getSheet("Sheet1");
		
		int lr = sh.getLastRowNum();
		
		for(int i=0;i<=lr;i++)
		{
			int lc=sh.getRow(i).getLastCellNum();
			for(int j=0; j<lc;j++)
			{
				String data = sh.getRow(i).getCell(j).toString();
				System.out.print(data+" \t");
			}
			System.out.println();
		}
		

	}

}
