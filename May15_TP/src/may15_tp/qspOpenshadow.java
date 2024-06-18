package may15_tp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class qspOpenshadow {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/shadow?sublist=0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement shadow_host = driver.findElement(By.xpath("//form/div[1]"));
SearchContext root = shadow_host.getShadowRoot();
root.findElement(By.cssSelector("input[type='text'")).sendKeys("abc");
	//accessing password
WebElement shadow_host1 = driver.findElement(By.xpath("//form/div[2]"));
SearchContext root1 = shadow_host1.getShadowRoot();
root1.findElement(By.cssSelector("input[type='text'")).sendKeys("ddd");
	
	}

}
