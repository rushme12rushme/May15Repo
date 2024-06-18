package may15_tp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datePicker {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/datePick?sublist=0");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@placeholder='Select A Date']")).click();
		Thread.sleep(2000);
		JavascriptExecutor j=(JavascriptExecutor) driver;
		j.executeScript("document.getElementsByClassName(\"react-datepicker__navigation-icon react-datepicker__navigation-icon--next\")[0].click()");

	}

}
