package FileHandlings;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelFileReadData {
	
	String filepath = "C:\\Users\\sathishkumar\\eclipse-workspace\\SeleniumOnline9PM\\Input\\";
	String filename = "Sample.xls";
	
	public void ReadData() throws IOException
	{
		File F = new File(filepath+filename);
		FileInputStream FS = new FileInputStream(F);
		//XSSFWorkbook workbook = new XSSFWorkbook(FS);
		HSSFWorkbook workbook = new HSSFWorkbook(FS);
		Sheet sheet = workbook.getSheet("Input");
		int totalRows = sheet.getPhysicalNumberOfRows();
		for(int i=0 ;i <totalRows;i++)
		{
			Row row = sheet.getRow(i);
			int totalColumn = row.getLastCellNum();
			for (int j =0 ;j<totalColumn;j++)
			{
				Cell eachCell = row.getCell(j);
				System.out.print(eachCell.getStringCellValue());
				System.out.print("\t");
			}
			System.out.println("");
			
		}
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelFileReadData E = new ExcelFileReadData();
		E.ReadData();
	}

}
