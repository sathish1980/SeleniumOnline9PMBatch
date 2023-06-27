package BasicsinJava;

public class FruitMArket  extends SuperMarket{
	
	public void OrganicFruits()
	{
		String[] organicVeg = {"Banana","Grapes","Mango"};
		for(String eachValue :organicVeg )
		{
			System.out.println(eachValue);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FruitMArket F = new FruitMArket();
		F.MainBranch();
		F.OrganicFruits();
		// F.OrganicVegetables();
	}

}
