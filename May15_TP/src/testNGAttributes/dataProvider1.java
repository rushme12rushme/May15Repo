package testNGAttributes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class dataProvider1 {
	@Test(dataProvider="searchtestdata",dataProviderClass=dataProvider.class)
	public void searchTest1(String url,String text)
	{
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("small-searchterms")).sendKeys(text);
	driver.findElement(By.xpath("//input[@value='Search']")).click();
	}
}
