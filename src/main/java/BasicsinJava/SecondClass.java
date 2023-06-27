package BasicsinJava;

public class SecondClass {
	
	private int vb= 01234567;
	float b= 1.2f;
	double c =1.255;
	char d ='a';
	String name ="sathish";
	boolean exist = true;
	int[] age = {23,45,67,89,12,23};
	char[] vowels = {'a','e','i','o','u'};
	
	private int cc= 77;
	
	protected int dd= 99;
	
	 public static int fees = 10000; //global variable /instance variable
	
	//Method without parameters/ arguments
	public void firstmethod(char expectedvalue)
	{
		System.out.println("The value we have given is : "+expectedvalue);
		for(char eachvalue : vowels) //for each loop
		{
			System.out.println(eachvalue);
			if(eachvalue==expectedvalue)
			{
				System.out.println("This is vowel");
				break;
			}
		}
		int fees = 11000; //local variable
		System.out.println("firstmethod"+11000); //Method implementation
	}
	
	//Method with parameter /arguments and With out Return
	public void addittion(int firstnumber, int secondnumber, int thirdvalue)
	{
		int c= firstnumber+secondnumber;
		System.out.println(c+11000);
	}
	
	//Method with Return Type
	public int secondmethod()
	{
		int fees = 12000;
		System.out.println("Technology"+fees);
		return 10;
	}
	
	//Method with Return Type
	public String secondmethodwithString()
	{
			System.out.println("Technology"+fees);
			return "sathish";
	}
	
	public int addtwonumber(int a, int b)
	{
		int c= a+b;
		return c;
	}
	
	private void privatevariable()
	{
		System.out.println("***!!!!!!!");
		System.out.println(cc);
	}
	
	protected void protectedvariable()
	{
		System.out.println("***!!!!!!!");
		System.out.println(dd);
	}
	
	public static void main(String[] args)
	{
		System.out.println("SAthish Kumar   *#@%#%");
		System.out.println("B.Tech");
		System.out.print("Besant");
		System.out.println("Technology");
		SecondClass second = new SecondClass();
		/*second.firstmethod(); //Method call
		second.addittion(9, 3,4);
		System.out.println(second.secondmethod());
		System.out.println(second.addtwonumber(6,5));
		
		second.privatevariable();
		second.protectedvariable();*/
		second.firstmethod('e');
	}

}
