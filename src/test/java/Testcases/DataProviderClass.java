package Testcases;

import java.io.IOException;

import org.testng.annotations.DataProvider;

import Utils.ExcelFileHandling;

public class DataProviderClass {
	
	@DataProvider
	public Object[][] SearchData() throws IOException {
		ExcelFileHandling E = new ExcelFileHandling();
		return E.ExcelReaddata("MakeMyTrip.xls", "SearchValid");
	}
	
	@DataProvider
	public Object[][] SearchInvalidData() throws IOException {
		ExcelFileHandling E = new ExcelFileHandling();
		return E.ExcelReaddata("MakeMyTrip.xls", "Searchinvalid");
	}

}
