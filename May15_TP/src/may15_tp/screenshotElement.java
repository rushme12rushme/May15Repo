package may15_tp;

import java.time.Duration;
import  java.io.*;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class screenshotElement {

	public static void main(String[] args) throws IOException {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		WebElement namefield = driver.findElement(By.xpath("//input[@id='name']"));
	File src=namefield.getScreenshotAs(OutputType.FILE);
	File dest=new File ("./Screenshot/namefield.png");
	FileHandler.copy(src, dest);
	
	
	
	}

}
