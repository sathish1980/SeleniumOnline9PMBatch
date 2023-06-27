package BasicsinJava;

public class interfaceimplementation implements interface1{

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("addition");
		
	}

	@Override
	public void sub() {
		// TODO Auto-generated method stub
		System.out.println("substraction");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		interface1 i = new interfaceimplementation();
		i.add();
		i.sub();
		interface2 i2 = new interfaceimplementation();
		i2.add();
	}

	

}
