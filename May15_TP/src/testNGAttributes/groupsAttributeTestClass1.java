package testNGAttributes;

import org.testng.annotations.Test;

public class groupsAttributeTestClass1 {

	@Test(groups="smoketest")
	public void loginTest()
	{
	System.out.println("login test case");	
	}
	@Test
	public void subscribeTest()
	{
	System.out.println("subscribe Test case");	
	}
	@Test
	public void searchTest()
	{
	System.out.println("search Test case");	
	}
}

