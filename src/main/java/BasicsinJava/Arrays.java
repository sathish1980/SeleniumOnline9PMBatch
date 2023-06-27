package BasicsinJava;

public class Arrays {
	
	int[] age = {2,3,45,6,7};
	String[] fruits= {"Apple","Orange","Banana","chiku"};
	
	public void arrayimplementation()
	{
		System.out.println(age[4]+"," +age[3]); // index will start from 0
		System.out.println(age.length);
		for(int i=0;i<age.length;i++)
		{
			System.out.println(age[i]);
		}
		
		//or 
		for (int a :age)
		{
			System.out.println(a);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arrays A = new Arrays();
		A.arrayimplementation();
	}

}
