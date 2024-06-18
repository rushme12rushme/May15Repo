package may15_tp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class framesPrac {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice-automation.com/iframes/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		 Thread.sleep(2000);
		driver.findElement(By.xpath("//button[text()='Login']")).click();

		Thread.sleep(3000);
		//driver.findElement(RelativeLocator.with(By.xpath("(//button[@id='close']/*[local-name()='svg']/*[name()='path'])")).near(By.xpath("//header/div[@id='logo']"))).click();
				
		//driver.findElement(By.xpath("//button[@id='close']")).click();
		//driver.findElement(By.xpath("//button[@id='close']/*[local-name()='svg']")).click();
		//driver.findElement(By.xpath("//*[local-name()='svg']")).click();


		//driver.findElement(By.xpath("(//*[local-name()='svg']/*[name()='path'])[17]")).click();
		driver.findElement(By.xpath("//button[@id='close']//*[local-name()='svg']/*[name()='path']")).click();

		driver.switchTo().defaultContent(); //switching to next frame
		driver.switchTo().frame("frame1"); Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Downloads']")).click();
		driver.switchTo().defaultContent(); String
		color=driver.findElement(By.xpath("//h1[text()='Iframes']")).getCssValue(
				"color"); System.out.println("color of the heading is "+color);

	}

}
