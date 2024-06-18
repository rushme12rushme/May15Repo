package may15_tp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class RelativeLoc {

	public static void main(String[] args) {
		/*
		 * WebDriver driver =new ChromeDriver();
		 * driver.get("https://www.flipkart.com/"); driver.manage().window().maximize();
		 * driver.findElement(RelativeLocator.with(By.xpath("//a[@title=\"Cart\"]"))
		 * .toRightOf(By.xpath("//div[text()=\"Login\"]"))).click(); driver.quit();
		 */
		WebDriver d =new ChromeDriver();
		d.get("https://m.cricbuzz.com/");	
		d.manage().window().maximize();
		//Cannot locate an element using [unknown locator]
		d.findElement(RelativeLocator.with(By.xpath("//p[contains(text(),'IPL 2024')]")).above(By.xpath("//h2[text()='LATEST NEWS']"))).click();
	
	}

}
