package may15_tp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class closedShadowRoot {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/shadow/closed?sublist=1");
		driver.findElement(By.xpath("//h1[contains(text(),'Login')]")).click();	
		Actions a =new Actions(driver);
		a.sendKeys(Keys.TAB).build().perform();
		a.sendKeys("user1").build().perform();
		
		
	}

}
