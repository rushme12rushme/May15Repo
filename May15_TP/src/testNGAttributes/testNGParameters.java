package testNGAttributes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class testNGParameters {
	@Parameters({"url","email"})
	@Test
	public void subscribeTest(String url,String email)
	{
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("newsletter-email")).sendKeys(email);
		driver.findElement(By.id("newsletter-subscribe-button")).click();
}
}
