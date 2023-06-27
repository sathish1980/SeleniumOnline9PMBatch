package FileHandlings;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TxtFileHandling {
	
	String filePath = "C:\\Users\\sathishkumar\\eclipse-workspace\\SeleniumOnline9PM\\Input\\";
	String fileName = "Testdata.txt";
	
	public void ReadData() throws IOException
	{
		File F = new File(filePath+fileName);
		FileInputStream FI = new FileInputStream(F);
		System.out.println((char)FI.read());
		System.out.println((char)FI.read());
		System.out.println((char)FI.read());
		
	}
	
	public void ReadDataAllData() throws IOException
	{
		File F = new File(filePath+fileName);
		FileInputStream FI = new FileInputStream(F);
		int i=0;
		while((i= FI.read())!=-1)
		{
			System.out.print((char)i);
		}
		
	}

	public void ReadLineByLine() throws IOException
	{
		File F = new File(filePath+fileName);
		FileReader FI = new FileReader(F);
		BufferedReader BF = new BufferedReader(FI);
		String i= null;
		while((i=BF.readLine())!=null)
		{
			System.out.println(i);
		}
		
	}

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		TxtFileHandling T = new TxtFileHandling();
		T.ReadLineByLine();
	}

}
