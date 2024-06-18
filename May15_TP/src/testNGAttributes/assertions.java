package testNGAttributes;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class assertions {
	@Test
	public void dws_assert() {
SoftAssert s=new SoftAssert();
WebDriver driver = new ChromeDriver();
driver.get("https://demowebshop.tricentis.com/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
String actual=driver.getTitle();
String exp="Demo Web hop";
s.assertEquals(actual, exp,"Wrong title displayed");
driver.findElement(By.id("small-searchterms")).sendKeys("books");
driver.findElement(By.xpath("//input[@value='Search']")).click();
String actual_searchtext=driver.findElement(By.id("Q")).getText();
String exp_searchtext="books";
s.assertEquals(actual_searchtext, exp_searchtext);
driver.close();
s.assertAll();
	}
}
