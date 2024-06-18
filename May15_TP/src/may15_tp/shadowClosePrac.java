package may15_tp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowClosePrac {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.htmlelements.com/demos/menu/shadow-dom/index.htm");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	WebElement shadow_host = driver.findElement(By.className("smart-ui-component"));
	SearchContext root = shadow_host.getShadowRoot();
	root.findElement(By.cssSelector("div[class='smart-menu-item-label-element']")).click();
	
	}

}
