package may15_tp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class autoSuggestion {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		//we can inspect the auto suggestions
		//driver.get("https://demowebshop.tricentis.com/");
		//driver.findElement(By.id("small-searchterms")).sendKeys("compu");
	//driver.findElement(By.xpath("//a[contains(text(),'Build your own computer')]")).click();
	//we cant inspect the auto suggestions
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("puma");
		driver.findElement(By.xpath("(//span[text()='puma'])[2]")).click();
	
	
	}

}
