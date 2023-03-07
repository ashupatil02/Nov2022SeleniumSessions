package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyMoveToElementConcept {

	public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
		
		driver.get("http:spicejet.com");

	//	WebElement menu = driver.findElement(By.cssSelector("a.menulink"));
		
	//	Actions act = new Actions(driver);
		
	//	act.moveToElement(menu).build().perform();
		

	}

}
