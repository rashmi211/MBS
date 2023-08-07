package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Parameterization {
	public static String getData() throws EncryptedDocumentException, IOException {
		FileInputStream file =new FileInputStream("F:\\Arise\\Test Data.xlsx");
	   String data=WorkbookFactory.create(file).getSheet("Test1").getRow(1).getCell(0).getStringCellValue();
	   return data;
	  
	
	
	}

}
