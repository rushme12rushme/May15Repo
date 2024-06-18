package testNGAttributes;

import org.testng.annotations.Test;

public class groupsAttributeTestClass2 {

	@Test
	public void voteTest()
	{
	System.out.println("vote test case");	
	}
	@Test
	public void addToCartTest()
	{
	System.out.println("addToCart Test case");	
	}
	@Test(groups="smoketest")
	public void registerTest()
	{
	System.out.println("registerTest Test case");	
	}
}

