package may15_tp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class qspScroll {

	public static void main(String[] args) throws InterruptedException  {
WebDriver driver=new ChromeDriver();
driver.get("https://demoapps.qspiders.com/ui/scroll?scenario=1");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
driver.findElement(By.partialLinkText("Open In New Tab")).click();
String pwh =driver.getWindowHandle();
	Set<String> handles=driver.getWindowHandles();
	//script to check accept button
	/*
	 * for(String s:handles) { if(s.equals(pwh)==false) {
	 * driver.switchTo().window(s);
	 * driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	 * driver.findElement(By.xpath("//button[text()='Accept Our Policy']")).click();
	 * String msg=driver.findElement(By.xpath("//div[@role='status']")).getText();
	 * 
	 * System.out.println(msg); } }
	 */
	
	for(String s:handles)
	{ 
		if(s.equals(pwh)==false) {
			 driver.switchTo().window(s);
			 System.out.println(driver.getTitle());
			 JavascriptExecutor js=(JavascriptExecutor) driver;
			 Thread.sleep(2000);
			 js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		js.executeScript("window.scrollTo(0,document.body.scrollHeight);");
		}
	}
		
	}

}
