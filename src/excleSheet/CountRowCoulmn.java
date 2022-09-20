package excleSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class CountRowCoulmn {

	    public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("D:\\Selenium\\21MayMorning.xlsx");
		Workbook book = WorkbookFactory.create(myfile);
		Sheet mysheet2 = book.getSheet("Sheet2");
		
		int totalNumbersOfRows = mysheet2.getLastRowNum();
		int rowscount = totalNumbersOfRows;
		{
			System.out.println("Total Number Of Rows are "+rowscount);
		}
		
		short totalNumberOfcells = mysheet2.getRow(totalNumbersOfRows).getLastCellNum();
        int cellscount = totalNumberOfcells;
        {
        System.out.println("total no of cells are "+cellscount); 
	    }
	}
}
