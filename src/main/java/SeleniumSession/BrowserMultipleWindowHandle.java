package SeleniumSession;

import java.util.Iterator;
import java.util.Set;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserMultipleWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		WebElement twEle = driver.findElement(By.xpath("//a[contains(@href,'twitter.com')]"));
		twEle.click();
		Set<String> handles = driver.getWindowHandles();
		handles.iterator();
		Iterator<String> it = handles.iterator();
		
		String parentWindoeId = it.next();
		System.out.println("parent window id: " + parentWindoeId);
		
		String childWindoeId = it.next();
		System.out.println("parent window id: " + childWindoeId);
		
		driver.switchTo().window(childWindoeId);
		System.out.println("child window url ; " +driver.getCurrentUrl());
		driver.close();
		
		driver.switchTo().window(parentWindoeId);
		System.out.println("parent window url :" +driver.getCurrentUrl());
		driver.quit();
		
		
		

		
	}

}
