package may15_tp;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class select {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.partialLinkText("Books")).click();
		WebElement sortby = driver.findElement(By.id("products-orderby"));
	Select s=new Select(sortby);
	List<WebElement> sort_options = s.getOptions();
	for(WebElement e:sort_options)
	{
		System.out.println(e.getText());
		
	}
	}

}
