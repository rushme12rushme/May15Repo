package may15_tp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class qspMouse {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToMultiple?sublist=2");
		WebElement lch = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement lco = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		Actions a =new Actions(driver);
		WebElement	dropzone=driver.findElement(By.id("dropZone1"));
		a.click(lch).click(lco).dragAndDrop(lch, dropzone).build().perform();
		
		WebElement mch = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement mco = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement	dropzone1=driver.findElement(By.id("dropZone2"));
		a.click(mch).click(mco).dragAndDrop(mch, dropzone1).build().perform();
	}

}

