package generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExelDate implements Constant
{
	public static String exelsheet(String path,String sheet,int row,int cell)

	{
		String s1="";
		try
		{
			Workbook wb =WorkbookFactory.create(new FileInputStream(path));
			 s1 =wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		}
		catch (Exception e)
		{
		System.out.println("File not found");	
		}
	
	return s1;
	}
	
}
