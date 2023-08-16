package TestNGBasics;

import org.testng.annotations.Test;

public class SecondClass {

	@Test(groups="Sanity")
	public void Testcase3()
	{
		System.out.println("Testcase3 in second class");
	}
	@Test(groups="SIT")
	public void Testcase4()
	{
		System.out.println("Testcase4 in second class");
	}

}
