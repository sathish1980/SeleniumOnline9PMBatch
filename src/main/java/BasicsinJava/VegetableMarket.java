package BasicsinJava;

public class VegetableMarket extends SuperMarket{

	String vegStall = "BCB VEg STall";
	public void OrganicVegetables()
	{
		String[] organicVeg = {"onion","tomato","Potato"};
		for(String eachValue :organicVeg )
		{
			System.out.println(eachValue);
		}
	}
	
	public void greenleaves()
	{
		String[] greens = {"palak","tomatoleaves"};
		for(String eachValue :greens )
		{
			System.out.println(eachValue);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VegetableMarket v = new VegetableMarket();
		v.OrganicVegetables();
		v.greenleaves();
		v.MainBranch();
	}

}
