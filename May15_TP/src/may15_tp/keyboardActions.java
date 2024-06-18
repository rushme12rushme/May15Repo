package may15_tp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class keyboardActions {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		Actions a =new Actions(driver);
		  WebElement searchtextfield = driver.findElement(By.id("small-searchterms"));
		a.moveToElement(searchtextfield).click().sendKeys("tv").build().perform();
		searchtextfield.clear();
		a.moveToElement(searchtextfield).click().keyDown(Keys.SHIFT).sendKeys("TV").keyUp(Keys.SHIFT).build().perform();
		
		

	}

}
