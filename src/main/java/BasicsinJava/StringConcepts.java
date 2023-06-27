package BasicsinJava;

public class StringConcepts {
	
	String name = " Sathish Kumar.R ";
	String name1 = " Sathish Kumar.R sa ";
	
	String[] food = {"Idly-10","doas-40","egg-15"};
	
	public void stringimplementation()
	{
		System.out.println(name.length());
		System.out.println(name.charAt(7));
		System.out.println(name.indexOf("."));
		System.out.println(name.compareTo(name1)); //mathced return 0 or it will return postive or negative value
		System.out.println(name.equals(name1));
		System.out.println(name.equalsIgnoreCase(name1));
		System.out.println(name1.contains(name));
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.trim());
		System.out.println(name.replace("Kum", "_"));
		for(String eachvalue : food)
		{
			System.out.println(eachvalue);
			String[] iteamandValues = eachvalue.split("-");
			System.out.println("item name : "+iteamandValues[0]);
			System.out.println("item Value : "+iteamandValues[1]);
			for (String eachitems : iteamandValues)
			{
				System.out.println(eachitems);
			}
			
		}
		System.out.println(name.substring(0,5));
		System.out.println(name.substring(5));
		System.out.println(name.startsWith(" Sathish"));
		System.out.println(name.endsWith("R"));
		char[] convertcharfromstring = name.toCharArray();
		for( char eachvalue : convertcharfromstring)
		{
			System.out.println(eachvalue);
		}
	}
	
	String filename = "sathishkumarR.txt";
	public void filetype()
	{
		
	// txt =textfile , xlsx =excel ,json =json file
	int charposition = filename.indexOf(".");
	String fileExtension =filename.substring(charposition);
	if(fileExtension.equalsIgnoreCase(".txt"))
	{
		System.out.println("This it txt file");
	}
	else if(fileExtension.equalsIgnoreCase(".xlsx"))
	{
		System.out.println("This it excel file");
	}
	else if(fileExtension.equalsIgnoreCase(".json"))
	{
		System.out.println("This is json file");
	}
	else
	{
		System.out.println("this is not a valid fil");
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringConcepts s = new StringConcepts();
		s.stringimplementation();
		s.filetype();
	}

}
