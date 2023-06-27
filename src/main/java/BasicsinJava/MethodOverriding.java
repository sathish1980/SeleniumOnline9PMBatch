package BasicsinJava;

public class MethodOverriding extends SuperMarket{

	
	
	
	public void name()
	{
		super.MainBranch();
		System.out.println(name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding M = new MethodOverriding();
		M.MainBranch();
		M.name();
	}

}
