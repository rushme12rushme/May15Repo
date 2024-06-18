package may15_tp;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class shadowOpenPrac {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://practice.expandtesting.com/shadowdom");
		WebElement shadow_host = driver.findElement(By.cssSelector("div[id='shadow-host']"));
		SearchContext root = shadow_host.getShadowRoot();
		root.findElement(By.id("my-btn")).click();
		System.out.println(root.findElement(By.id("my-btn")).isEnabled());
		
	}

}
