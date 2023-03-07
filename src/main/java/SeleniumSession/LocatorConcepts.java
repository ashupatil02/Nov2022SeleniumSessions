package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcepts {

	private static final By driver = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//create a web element+perform action(click,sendKeys,getText,isDisplayed.......)
		//create web element we need locator
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		
		//1. id
		//1st
		//  driver.findElement(By.id("input-email")).sendKeys("naveengmail.com");
        //  driver.findElement(By.id("input-password")).sendKeys("naveen@123");		
		
		//2nd:
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//
//		emailId.sendKeys("naveen@gmail.com");
//		password.sendKeys("naveen@123");
//		
	//	emailId.sendKeys("ashu@gmail.com");
	//	password.sendKeys("ashu@123");
		
		
		
		//3rd: By locator
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");

//		WebElement eId =  driver.findElement(emailId);
//		WebElement pwd =  driver.findElement(password);
		
//		eId.sendKeys("naveen@gmail.com");
//		pwd.sendKeys("naveen@123");
		
		
		//4th: By locator + generic method for webelement
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		getElement(emailId).sendKeys("naveen@gmail.com");
//		getElement(password).sendKeys("naveen@123");
		
		//5th: By locator + generic methods for webelement and actions
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		doSendKeys(emailId, "naveen@gmail.com");
//		doSendKeys(password, "naveen@123");
		
		//6th: By locator + generic methods for webelement and actions in a ElementUtil class
		By emailId = By.id("input-email");
		By password = By.id("input-password");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		eleUtil.doSendKeys(emailId, "naveen@gmail.com");
		eleUtil.doSendKeys(password, "naveen@123");
	}
	
	
	public static  WebElement getElement(By locator) {
	return driver.findElement((SearchContext) locator);
	}
	
	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
}

	


