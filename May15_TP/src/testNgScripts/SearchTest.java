package testNgScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class SearchTest {
	@Test
	public void searchTestcase()
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("small-searchterms")).sendKeys("computers");
		driver.findElement(By.xpath(" //input[@type='submit']")).click();
		Reporter.log("Search is successfull");
		driver.close();
	}

}
