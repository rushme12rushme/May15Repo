package may15_tp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsClass {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement computers = driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[1]"));
		Actions a =new Actions(driver);
		a.moveToElement(computers).build().perform();
		WebElement desktop = driver.findElement(By.xpath("(//a[contains(text(),'Desktop')])[1]"));
		a.moveToElement(desktop).click().build().perform();
	}

}
