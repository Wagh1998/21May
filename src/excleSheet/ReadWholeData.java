package excleSheet;

import java.io.File;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadWholeData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		File myfile=new File("D:\\Selenium\\21MayMorning.xlsx");
		Workbook book = WorkbookFactory.create(myfile);
		Sheet mysheet2 = book.getSheet("Sheet2");
		for(int i=0;i<=5;i++)//outer for loop row
		{
			for(int j=0;j<=1;j++)//inner for loop cell
			{
				String value = mysheet2.getRow(i).getCell(j).getStringCellValue();
				System.out.print(value+" ");
			}
			System.out.println();
		}

	}

}
