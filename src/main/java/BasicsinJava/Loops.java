package BasicsinJava;

public class Loops {
	
	public void forloop(int j)
	{
		for(int i=j;i<10;i++)
		{
			System.out.println(i);
		}
	}
	
	public void whileloop(int i)
	{
		System.out.println("%%%%%%%%%%%%%%");
		while(i<10)
		{
			System.out.println(i);
			i=i+2;
		}
	}
	
	public void dowhileloop(int i)
	{
		System.out.println("%%%%%%%%%%%%%%");
		do
		{
			System.out.println(i);
			i=i+2;
		}while(i<10);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loops L = new Loops();
		L.forloop(3);
		L.dowhileloop(45);
	}

}
