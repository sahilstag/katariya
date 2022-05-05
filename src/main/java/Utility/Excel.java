package Utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {
public static String gettestdata(int row, int cell, String sheet) throws EncryptedDocumentException, IOException {
		
		FileInputStream file=new FileInputStream("F:\\eclipse\\zerodha8jan\\src\\test\\resources\\Book1.xlsx");// setup coonection between outer 
																		//excel file and eclips
	String value=WorkbookFactory.create(file).getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
	return value;// by using apache POI's wokebookfactory we can fetch the data from excelsheet 
	}

}
