package may15_tp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSSelector {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//span[contains(text(),'Delivering to Bengaluru')]")).click();
		boolean id=driver.findElement(By.id("glow-ingress-block")).isDisplayed();
		System.out.println(id);
		//driver.findElement(By.id("glow-ingress-block")).click();


		boolean hash_id = driver.findElement(By.cssSelector("#glow-ingress-block")).isDisplayed();
		
		System.out.println(hash_id);
		driver.findElement(By.cssSelector("#glow-ingress-block")).click();

		
	}

}
