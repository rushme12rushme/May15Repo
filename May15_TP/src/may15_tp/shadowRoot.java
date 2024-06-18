		package may15_tp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowRoot {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[contains(text(),'Shadow')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//section[contains(text(),'Shadow')])[2]")).click();
		Thread.sleep(2000);
//identify the shadow host
		
		SearchContext shadowhost = driver.findElement(By.xpath("//form/div[1]")).getShadowRoot();
		shadowhost.findElement(By.cssSelector("input[type='text']")).sendKeys("user1");
		
	
	}

}
