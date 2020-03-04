package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class exceldataread 
{

	XSSFWorkbook workbook;
	public exceldataread()
	{
		FileInputStream fis;
		try {
			fis = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\data.xlsx");
			try {
				workbook = new XSSFWorkbook(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String getstringdata(String sheetname, int row, int column)
	{
		return workbook.getSheet(sheetname).getRow(row).getCell(column).getStringCellValue();
	}
	
	public double getnumericdata(String sheetname, int row, int column)
	{
		return workbook.getSheet(sheetname).getRow(row).getCell(column).getNumericCellValue();
	}
	
}
