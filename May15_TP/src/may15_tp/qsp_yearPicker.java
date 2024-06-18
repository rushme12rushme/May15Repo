package may15_tp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class qsp_yearPicker {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui/datePick/datedropdown?sublist=1");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@placeholder='Select A Date']")).click();
		Thread.sleep(2000);
		JavascriptExecutor j=(JavascriptExecutor) driver;
		Thread.sleep(2000);
		j.executeScript("document.getElementsByClassName(\"react-datepicker__month-read-view--down-arrow\")[0].click();");
		Thread.sleep(2000);
		j.executeScript("document.getElementsByClassName(\"react-datepicker__month-option\")[11].click();");
		j.executeScript("document.getElementsByClassName(\"react-datepicker__day react-datepicker__day--012\")[0].click();");
	}

}
