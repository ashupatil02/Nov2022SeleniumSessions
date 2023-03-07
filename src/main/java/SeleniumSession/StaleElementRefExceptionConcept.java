package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementRefExceptionConcept{

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		WebElement fn = driver.findElement(By.id("input-email"));
		
		fn.sendKeys("ashupatil02@gmail.com");
		driver.navigate().refresh();
		
		 fn = driver.findElement(By.id("input-email"));
		fn.sendKeys("naveen@gmail.com");
	//	driver.navigate().refresh();
		
		
	 
		
		
		}

	}


