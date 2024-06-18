package testNGAttributes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigAnnotations {
	WebDriver driver;
	@BeforeTest
	public void openBrowser()
	{
		Reporter.log("Open browser");
		driver = new ChromeDriver();
		driver.manage().window().maximize();

	}
	@BeforeMethod
	public void launchURL()
	{
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		System.out.println("Launching app");
	}

	@Test
	public void searchTestcase()
	{
		driver.findElement(By.id("small-searchterms")).sendKeys("computers");
		driver.findElement(By.xpath(" //input[@type='submit']")).click();
		Reporter.log("Search is successfull");
		System.out.println("Executing search");
	}
	@Test
	public void subscribeTestcase()
	{
		Reporter.log("Inside subscribeTestcase");
		driver.findElement(By.id("newsletter-email")).sendKeys("user1@abc.com");
	driver.findElement(By.id("newsletter-subscribe-button")).click();
	System.out.println("Executing subscribe");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Executed after each @Test case");
	}
	@AfterTest
	public void closeBrwoser()
	{
		Reporter.log("closing app");
		driver.close();
		System.out.println("closing app");
	}

}
