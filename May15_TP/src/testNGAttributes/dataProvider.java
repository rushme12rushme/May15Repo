package testNGAttributes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataProvider {
	@DataProvider(name="searchtestdata")
	public Object[][] dataProviderMethod()
	{
		Object[][]data=new Object[3][2];
		data[0][0]="https://demowebshop.tricentis.com/";
		data[0][1]="mobiles";
		data[1][0]="https://demowebshop.tricentis.com/";
		data[1][1]="books";
		data[2][0]="https://demowebshop.tricentis.com/";
		data[2][1]="tv";
		return data;
		
	}
	@Test(dataProvider="searchtestdata")
	public void searchTest(String url,String text)
	{
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.id("small-searchterms")).sendKeys(text);
	driver.findElement(By.xpath("//input[@value='Search']")).click();
	}

}
