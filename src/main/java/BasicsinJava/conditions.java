package BasicsinJava;

public class conditions {
	
	public void ifconditions(String color,String vehicleType,String PatientInOrNot)
	{
		if (color.equals("Red"))
		{
			if(vehicleType.equals("Ambulance"))
			{
				if(PatientInOrNot=="Yes")
				{
				System.out.println("Give a Way for ME !! I am ambulance");
				}
			}
			else
			{
			System.out.println("You have to stop the vehicle");
			}
		}
		else if (color.equals("Green"))
		{
			System.out.println("You are good to go");
			
		}
		else if (color.equals("Orange"))
		{
			System.out.println("You are about to go");
			
		}
		else
		{
			System.out.println("This is not a valid color");
		}
	}
	
	public void switchstatment(String Gender)
	{
		switch(Gender)
		{
			case "M":
				System.out.println("You are male");
				// break;
			case "F":
				System.out.println("You are Female");
				break;
			default:
				System.out.println("You are Transgender");
				break;
				
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		conditions c = new conditions();
		c.ifconditions("Red","Ambulance","No");
		c.switchstatment("M");
	}

}
