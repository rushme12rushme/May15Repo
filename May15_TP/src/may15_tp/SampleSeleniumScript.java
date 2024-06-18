package may15_tp;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SampleSeleniumScript {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().window().maximize();
		/*
		 * driver.findElement(By.linkText("Register")).click();
		 * driver.findElement(By.id("gender-male")).click();
		 * driver.findElement(By.id("FirstName")).sendKeys("Rashmi");
		 * driver.findElement(By.id("LastName")).sendKeys("tester");
		 * driver.findElement(By.id("Email")).sendKeys("xyz@rrr.com");
		 * driver.findElement(By.id("Password")).sendKeys("123456");
		 * driver.findElement(By.id("ConfirmPassword")).sendKeys("123456");
		 * driver.findElement(By.id("register-button")).click();
		 */
		//starts with method
		//driver.findElement(By.xpath("(//a[starts-with(text(),'Electro')])[1]")).click();
		//ends with method
		//driver.findElement(By.xpath("//input[@type='button' and @id='vote-poll-1']")).click();
driver.findElement(By.xpath("//span[@class='cart-label' or text()='Shopping cart']")).click();

		
		
		
				
	}

}
