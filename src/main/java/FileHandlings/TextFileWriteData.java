package FileHandlings;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TextFileWriteData {

	String outputfilePath = "C:\\Users\\sathishkumar\\eclipse-workspace\\SeleniumOnline9PM\\Input\\";
	String outputfileName = "OutTestdata.txt";
	String filePath = "C:\\Users\\sathishkumar\\eclipse-workspace\\SeleniumOnline9PM\\Input\\";
	String fileName = "Testdata.txt";
	
	
	String outputString = "Sathish Kumar R";
	
	public void Writedata() throws IOException
	{
		File F = new File(outputfilePath+outputfileName);
		FileOutputStream FO = new FileOutputStream(F);
		
		FO.write(outputString.getBytes());
		FO.close();
		System.out.println("Done");
		
	}
	
	public void WritedataFileWrite() throws IOException
	{
		File F = new File(outputfilePath+outputfileName);
		FileWriter FO = new FileWriter(F);
		
		FO.write(outputString);
		FO.close();
		System.out.println("Done");
		
	}
	
	public void WritedataFromonefileintoAnotherFile() throws IOException
	{
		File F = new File(filePath+fileName);
		FileReader FI = new FileReader(F);
		File FOut = new File(outputfilePath+outputfileName);
		FileWriter FO = new FileWriter(FOut);
		BufferedReader BF = new BufferedReader(FI);
		String i= null;
		while((i=BF.readLine())!=null)
		{
			FO.write(i);
		}
		
		FO.close();
		System.out.println("Done");
		
	}
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		TextFileWriteData T = new TextFileWriteData();
		T.WritedataFromonefileintoAnotherFile();
	}

}
