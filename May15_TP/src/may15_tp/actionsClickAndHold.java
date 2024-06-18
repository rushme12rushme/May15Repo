package may15_tp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsClickAndHold {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		WebElement rome = driver.findElement(By.xpath("(//div[text()='Rome'])[2]"));
		WebElement italy=driver.findElement(By.id("box106"));
		Actions a =new Actions(driver);
				a.clickAndHold(rome).moveToElement(italy).click().build().perform();
	}

}
