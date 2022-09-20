package excleSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadSingleCellData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//create excel sheet and pass the path along with name and extention in file object
		File myfile=new File("D:\\Selenium\\21MayMorning.xlsx");
		
		/*//using workbookFactory class read excel sheet
		String name=WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
		System.out.println(name);
				
		//how to read numeric value 
		double number = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(3).getCell(0).getNumericCellValue();
		System.out.println(number);
		
		//how to read char
		String mychar = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(5).getCell(0).getStringCellValue();
		System.out.println(mychar);
		
		//how to boolean
		boolean myValue = WorkbookFactory.create(myfile).getSheet("Sheet1").getRow(4).getCell(0).getBooleanCellValue();
		System.out.println(myValue);

		System.out.println("=======================");*/
		
		Workbook book = WorkbookFactory.create(myfile);
		Sheet mysheet = book.getSheet("Sheet1");
		Row myrow = mysheet.getRow(3);
		Cell mycell = myrow.getCell(1);
	//	mycell.getCellType(0);
		System.out.println(mycell.getCellType());
		System.out.println("===========================");
	}

}
