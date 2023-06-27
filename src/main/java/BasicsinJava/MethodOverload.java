package BasicsinJava;

public class MethodOverload {
	
	public void add(int a, int b)
	{
		int c=a+b;
		System.out.println(c);
	}
	
	public void add(double a, int b)
	{
		System.out.println("2 param with data type");
		double c=a+b;
		System.out.println(c);
	}
	
	public void add(int a, double b)
	{
		System.out.println("2 param with b data type");
		double c=a+b;
		System.out.println(c);
	}
	
	public void add(int a, int b,int c)
	{
		System.out.println("3 param");
		int d=a+b+c;
		System.out.println(d);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverload M = new MethodOverload();
		M.add(4, 5,5);
	}

}
