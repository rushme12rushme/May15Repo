package may15_tp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class relative_loc {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://practice.automationtesting.in/");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
List<WebElement> es = driver.findElements(RelativeLocator.with(By.xpath("//ul[@class='products']")).below(By.xpath("//h2[text()='new arrivals']")));
	System.out.println("number of new arrivals "+es.size());
	driver.quit();
	}

}
