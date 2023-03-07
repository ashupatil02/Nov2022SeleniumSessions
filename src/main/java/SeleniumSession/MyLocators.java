package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyLocators {
	
	 static WebDriver driver;

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
//       driver.findElement(By.name("email")).sendKeys("ashupatil02@gmail.com");
//   
//         By Email = By.name("email");
		
//		driver.findElement(By.className("form-control")).sendKeys("ashupatil02@gmail.com");
//		 By Email = By.className("form-control");
//		
		
	//	driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("ashupatil02@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("ashu123");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		
		
//		By Email = By.xpath("//*[@id=\"input-email\"]");
//		By pwd = By.xpath("//*[@id=\"input-password\"]");
//		By loginBtn = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
//		doSendKeys(Email ," ashupatil02@gmail.com" );
//		doSendKeys(pwd ,"ashu123" );
//		doClick(loginBtn);
		
//		driver.findElement(By.linkText("Register")).click();
//		    By registerLink = By.linkText("Register");
//		doClick(  registerLink);
//		
		
//		driver.findElement(By.partialLinkText("Forgotten")).click();
		
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
	}
	
	public static WebElement  getElement(By locator) {
	 return driver.findElement(locator);
	}
	
	public static void doClick( By locator) {
		getElement(locator).click();
		
	}
	
	public static void doSendKeys(By locator , String value) {
		getElement(locator).sendKeys(value);
		
	}
	public static void doElementGetText(By locator) {
		getElement(locator).getText();
	}
	

}
