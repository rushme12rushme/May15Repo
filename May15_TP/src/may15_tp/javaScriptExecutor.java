package may15_tp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.idealized.Javascript;

public class javaScriptExecutor {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript("document.getElementById('small-searchterms')"
				+ ".value='mobiles';");
		WebElement searchbtn=driver.findElement(By.xpath("//input[@type='submit']"));
		j.executeScript("arguments[0].click();",searchbtn);
		
	}

}
