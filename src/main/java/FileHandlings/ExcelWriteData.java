package FileHandlings;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class ExcelWriteData {
	
	String filepath = "C:\\Users\\sathishkumar\\eclipse-workspace\\SeleniumOnline9PM\\Input\\";
	String filename = "output.xls";
	
	public void WriteData() throws IOException
	{
		File F = new File(filepath+filename);
		FileOutputStream FS = new FileOutputStream(F);
		//XSSFWorkbook workbook = new XSSFWorkbook(FS);
		HSSFWorkbook workbook = new HSSFWorkbook();
		Sheet outsheet = workbook.createSheet("out");
		Row outrow =  outsheet.createRow(0);
		Cell outcell = outrow.createCell(0);
		outcell.setCellValue("Sathish");
		workbook.write(FS);
		workbook.close();
		
	}
	
	public void WriteDatamultiplevalue() throws IOException
	{
		String[] name= {"sathish","kumar","R","BTech", "Beasant"};
		int totalValue = name.length;
		File F = new File(filepath+filename);
		FileOutputStream FS = new FileOutputStream(F);
		//XSSFWorkbook workbook = new XSSFWorkbook(FS);
		HSSFWorkbook workbook = new HSSFWorkbook();
		Sheet outsheet = workbook.createSheet("out");
		Row outrow =  outsheet.createRow(0);
		for (int i=0;i<totalValue;i++)
		{
			Cell outcell = outrow.createCell(i);
			outcell.setCellValue(name[i]);
		}
		workbook.write(FS);
		workbook.close();
		
	}
	
	public void WriteDatamultiplevalueinRow() throws IOException
	{
		String[] name= {"sathish","kumar","R","BTech", "Beasant"};
		int totalValue = name.length;
		File F = new File(filepath+filename);
		FileOutputStream FS = new FileOutputStream(F);
		//XSSFWorkbook workbook = new XSSFWorkbook(FS);
		HSSFWorkbook workbook = new HSSFWorkbook();
		Sheet outsheet = workbook.createSheet("out");
		Row outrow =  outsheet.createRow(3);
		
		for (int i=0;i<totalValue;i++)
		{
			Cell outcell = outrow.createCell(i);
			outcell.setCellValue(name[i]);
		}
		
		workbook.write(FS);
		workbook.close();
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ExcelWriteData E = new ExcelWriteData();
		E.WriteDatamultiplevalueinRow();
	}

}
