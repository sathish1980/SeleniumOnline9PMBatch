package BasicsinJava;

public class SuperMarket
{
	
	String name = "ABC Super Market";
	public void MainBranch()
	{
		System.out.println("I am Main Branch");
		System.out.println("Located At chennai");
		//System.out.println(vegStall);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SuperMarket s = new SuperMarket();
		s.MainBranch();
		//s.OrganicVegetables();
		// s.greenleaves();
	}

}
