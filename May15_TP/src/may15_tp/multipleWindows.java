package may15_tp;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class multipleWindows {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demowebshop.tricentis.com/");
		String pwh=driver.getWindowHandle();
		driver.findElement(By.partialLinkText("Facebook")).click();

		Set<String> windows = driver.getWindowHandles();
		
		for(String s:windows)
		{
			driver.switchTo().window(s);
			System.out.println(driver.getTitle());
			if(driver.getTitle().contains("Facebook"))
			{
				driver.findElement(By.xpath("(//input[@name='email'])[2]")).sendKeys("user@abc.com");
				driver.close();
			}
			
		}
		driver.switchTo().window(pwh);
		driver.findElement(By.name("q")).sendKeys("mobiles");
		
	}

}
