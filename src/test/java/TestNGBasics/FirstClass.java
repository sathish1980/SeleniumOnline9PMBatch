package TestNGBasics;
import org.testng.annotations.*;
public class FirstClass {

@BeforeSuite(alwaysRun = true)
public void BeforeSuite()
{
	System.out.println("BeforeSuite");
}

@AfterSuite(alwaysRun = true)
public void afterSuite()
{
	System.out.println("afterSuite");
}

@BeforeTest(alwaysRun = true)
public void BeforeTest()
{
	System.out.println("BeforeTest");
}

@AfterTest(alwaysRun = true)
public void AfterTest()
{
	System.out.println("AfterTest");
}

@BeforeClass(alwaysRun = true)
public void BeforeClass()
{
	System.out.println("BeforeClass");
}

@AfterClass(alwaysRun = true)
public void AfterClass()
{
	System.out.println("AfterClass");
}

@BeforeMethod(alwaysRun = true)
public void BeforeMethod()
{
	System.out.println("BeforeMethod");
}

@AfterMethod(alwaysRun = true)
public void AfterMethod()
{
	System.out.println("AfterMethod");
}



@Test(priority=0,enabled=true,description="postive test case",timeOut=60,invocationCount=1,groups={"SIT","Sanity"})
public void Login() throws InterruptedException
{
	System.out.println("Login");
	//Thread.sleep(20000);
	//throw new ArithmeticException("Fail");
}

@Test(priority=1,dependsOnMethods="Login",groups="Sanity")
public void AddUser()
{
	System.out.println("Add user");
}

@Test(priority=2,groups={"SIT","Sanity"})
public void CreateAccount()
{
	System.out.println("CreateAccount");
}
}
