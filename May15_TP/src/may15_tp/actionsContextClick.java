package may15_tp;

import java.awt.event.ActionEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsContextClick {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
	WebElement cc = driver.findElement(By.xpath("//span[text()='right click me']"));
	Actions a =new Actions(driver);
	a.contextClick(cc).build().perform();
	WebElement cut = driver.findElement(By.xpath("//span[text()='Cut']"));
	a.moveToElement(cut).click().build().perform();
	}

}
