package may15_tp;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class qsp_actions {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://demoapps.qspiders.com/ui/keyboard?sublist=0&scenario=3");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	Actions a =new Actions(driver);
	WebElement emailfield = driver.findElement(By.id("email"));
	a.click(emailfield).sendKeys("abc@abc.com").build().perform();
	WebElement pwdfield = driver.findElement(By.id("password"));
	a.click(pwdfield).sendKeys("Password2017!").build().perform();
	WebElement cnfrmpwdfield = driver.findElement(By.id("confirmPassword"));
	
	a.click(cnfrmpwdfield).sendKeys("Password2017!").build().perform();
	WebElement submitbtn = driver.findElement(By.xpath("//button[text()='Press Enter to Submit']"));
	a.click(submitbtn).build().perform();
	String status_msg = driver.findElement(By.xpath("//div[@role='status']")).getText();
	System.out.println(status_msg);
	///enter uppercase letters in email field
	/*
	 * driver.navigate().refresh(); WebElement emailfield1 =
	 * driver.findElement(By.id("email")); a.click(emailfield1).build().perform();
	 * a.keyDown(Keys.SHIFT).sendKeys("abc").build().perform();
	 */
	driver.navigate().refresh();
	WebElement pwdfield1 = driver.findElement(By.id("password"));
	a.click(pwdfield1).sendKeys("Password2017!").build().perform();
	WebElement cnfrmpwdfield1 = driver.findElement(By.id("confirmPassword"));
	a.click(pwdfield1).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
	a.click(pwdfield1).keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	a.click(cnfrmpwdfield1).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();


	}

}
