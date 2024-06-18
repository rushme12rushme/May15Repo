package may15_tp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowOpenPrac2 {

	public static void main(String[] args) {
		{
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame("pact");
		//get shadow host
		WebElement host = driver.findElement(By.id("snacktime"));
		SearchContext root = host.getShadowRoot();
		root.findElement(By.cssSelector("input[name='chai']")).sendKeys("NO");
		}
	}

}
