package FileHandling2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteExcelFile {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium_Practice_Janaury_2024\\Book1.xlsx");
		
		Workbook wb = WorkbookFactory.create(file);
		Sheet sh = wb.getSheet("Sheet1");
		sh.getRow(3).createCell(4).setCellValue("Selenium");
		sh.createRow(4).createCell(4).setCellValue("Cypress");
		
		wb.createSheet("Automation");
		Sheet sh2 = wb.getSheet("Automation");
		sh2.createRow(0).createCell(0).setCellValue("Cypress");
		sh2.createRow(0).createCell(1).setCellValue("Cypress");
		sh2.createRow(1).createCell(0).setCellValue("Cypress");
		sh2.createRow(1).createCell(1).setCellValue("Cypress");
		
		//When we are writing in file , file should not be in open state in desktop else it will give fileNotFoundExc
		FileOutputStream fos=new FileOutputStream("C:\\Users\\HP\\eclipse-workspace\\Selenium_Practice_Janaury_2024\\Book1.xlsx");
		wb.write(fos);
	}

}
