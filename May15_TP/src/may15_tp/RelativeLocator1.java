package may15_tp;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeLocator1 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login\r\n");
		driver.get("https://demowebshop.tricentis.com/");	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		//driver.findElement(By.xpath("(//*[local-name()='svg'])[1]")).click();
	//search field text box
		///driver.findElement();
	}

}
