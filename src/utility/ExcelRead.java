package utility;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelRead {
	public static String excelRead(int r,int c) throws EncryptedDocumentException, IOException {
		FileInputStream file=new FileInputStream("C:\\Users\\91966\\Desktop\\SelUtility\\file\\New Microsoft Excel Worksheet.xlsx");
		String data=WorkbookFactory.create(file).getSheet("Sheet1").getRow(r).getCell(c).getStringCellValue();
	     return data;
	}

}
