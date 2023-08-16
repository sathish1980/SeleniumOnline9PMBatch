package TestNGBasics;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class thirdClass {
	
	@BeforeClass
	public void BeforeClass()
	{
		System.out.println("BeforeClass in third class");
	}
	@Test
	public void Testcase5()
	{
		System.out.println("Testcase5 in third class");
	}
}
