package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyCustomXpath {
	static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		By myPass = By.xpath("//a[text()='Forgotten Password']");
//		int myPassword = driver.findElements(myPass).size();
//		if(myPassword==2) {
//			System.out.println("pass");
//		}
		
		driver.get("https://www.amazon.com");
		List<WebElement>linksList =  driver.findElements(By.xpath("//a[contains(text(),'Amazon')]")); 
		 int linksCount=linksList.size();
         System.out.println("total links :"+ linksCount);
         System.out.println("actual list :" +linksList);
	}

}
