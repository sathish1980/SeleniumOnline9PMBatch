package FileHandlings;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Propertyclass {
	
	String filepath = "C:\\Users\\sathishkumar\\eclipse-workspace\\SeleniumOnline9PM\\Input\\";
	String fileName = "Login.properties";
	
	public void readData() throws IOException
	{
		File F = new File(filepath+fileName);
		FileInputStream FS = new FileInputStream(F);
		Properties Ps = new Properties();
		Ps.load(FS);

		System.out.println(Ps.getProperty("Browser"));
		System.out.println(Ps.getProperty("name"));
		System.out.println(Ps.getProperty("department"));
		System.out.println(Ps.getProperty("grade"));
		Ps.setProperty("Time", "10");
		System.out.println(Ps.getProperty("Time"));
	}
	
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Propertyclass P = new Propertyclass();
		P.readData();
	}

}
