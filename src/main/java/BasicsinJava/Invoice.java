package BasicsinJava;

public class Invoice extends VegetableMarket {

	
	public void Discount(int amount)
	{
		double discount =amount*.12;
		System.out.println("discount amount "+discount);
	}
	
	public void Tax(int amount)
	{
		double tax =amount*.17;
		System.out.println(tax);
		double totalAmount = tax+amount;
		System.out.println("Over all amount: "+totalAmount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice I = new Invoice();
		I.MainBranch();
		I.OrganicVegetables();
		I.Discount(1000);
		I.Tax(2000);
	}

}
