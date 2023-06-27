package BasicsinJava;

import java.io.IOException;

public class Division {
	
	public void div(int a, int b)
	{
		try
		{
		int c=a/b;
		System.out.println(c);
		}
		catch(ArithmeticException e)
		{
			System.out.println("This is an airthmetic exception");
		}
		catch(Exception e)
		{
			System.out.println("This is exception");
		}
		finally
		{
			System.out.println("finally");
		}
	}
	
	public void add(int a, int b) throws IOException,ArithmeticException
	{
		int c= a+b;
		System.out.println(c);
		throw new ArithmeticException("Hi this is sathish");
	}

	public static void main(String[] args) throws ArithmeticException, IOException {
		// TODO Auto-generated method stub
		Division D = new Division();
		D.div(10, 5);
		D.add(3, 4);
	}

}
