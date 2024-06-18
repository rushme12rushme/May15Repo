package testNGAttributes;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class TestNGAnnotation {
	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println(" before suite");
	}
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("before method");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("after method");
	}
	@Test
	public void testCase2()
	{
		System.out.println("inside testcase2");
	}
	
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("after suite");
	}
	@Test
	public void testcase1()
	{
		System.out.println("inside testcase1");
	}
	

}
