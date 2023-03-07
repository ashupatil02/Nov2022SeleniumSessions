package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.with;

public class RelativeLocator {

	public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.aqi.in/dashboard/canada");
	Thread.sleep(3000);
	
	WebElement ele =  driver.findElement(By.linkText("Port Alberni, Canada"));
	
	String rightIndex = driver.findElement(with(By.tagName("p")).toRightOf(ele)).getText();
	System.out.println(rightIndex);
	
	String leftRank = driver.findElement(with(By.tagName("p")).toLeftOf(ele)).getText();
	System.out.println(leftRank );
	
	String aboveCity = driver.findElement(with(By.tagName("p")).above(ele)).getText();
	System.out.println(aboveCity );
	
	String belowCity = driver.findElement(with(By.tagName("p")).below(ele)).getText();
	System.out.println(belowCity );
	
	String nearCity = driver.findElement(with(By.tagName("p")).near(ele)).getText();
	System.out.println(nearCity );
	
	
	
	
	
	

	}

}
