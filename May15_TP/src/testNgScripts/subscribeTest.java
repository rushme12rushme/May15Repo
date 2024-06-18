package testNgScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class subscribeTest {
@Test
public void subscribetest()
{
	WebDriver driver=new ChromeDriver();
	driver.get("https://demowebshop.tricentis.com/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.findElement(By.id("newsletter-email")).sendKeys("test@abc.com");
	driver.findElement(By.id("newsletter-subscribe-button")).click();
	Reporter.log("Subcsription test case done");
}

}
