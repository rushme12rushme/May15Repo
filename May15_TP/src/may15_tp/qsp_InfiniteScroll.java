package may15_tp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class qsp_InfiniteScroll {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://shopping.google.com/m/bestthings/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Thread.sleep(2000);
		Actions a=new Actions(driver);
		for(;;)
		{
			Thread.sleep(2000);
			a.scrollByAmount(0,5000).perform();

		}
	}

}
