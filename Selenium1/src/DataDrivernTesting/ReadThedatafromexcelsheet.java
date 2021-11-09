package DataDrivernTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadThedatafromexcelsheet {

	public static void main(String[] args) throws EncryptedDocumentException, Throwable {
		String filepath="./Resources/exceldata.xlsx";
		String sheetName="TC01";
		//create an object for fileinputstream class of java to pass the physical excel file path
		FileInputStream file=new FileInputStream(filepath);
		//create workbook object by calling create 
		Workbook workBook = WorkbookFactory.create(file);
		String url = workBook.getSheet(sheetName).getRow(1).getCell(0).getStringCellValue();
		String username = workBook.getSheet(sheetName).getRow(1).getCell(1).getStringCellValue();
		String password = workBook.getSheet(sheetName).getRow(1).getCell(2).getStringCellValue();
		System.out.println(url);
		System.out.println(username);
		System.out.println(password);
		
		

	}

}
