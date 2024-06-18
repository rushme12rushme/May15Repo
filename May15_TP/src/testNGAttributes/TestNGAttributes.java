package testNGAttributes;

import org.testng.annotations.Test;

public class TestNGAttributes {
	@Test(dependsOnMethods ="registerTest") 
	public void loginTest()
	{
		System.out.println("loginTest  method execution");
	}
	@Test 
	public void searchTest()
	{
		System.out.println("searchTest method execution");
	}
	@Test
	public void registerTest()
	{
		System.out.println("registertest  method execution");
	}
	@Test(dependsOnMethods = "searchTest")
	public void subscribeTest()
	{
		System.out.println("subscribetest  method execution");
	}

}
