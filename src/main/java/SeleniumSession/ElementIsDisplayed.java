package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementIsDisplayed {
	static WebDriver driver;


	public static void main(String[] args) {
		

		 driver = new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			
//			boolean flagImg = driver.findElement(By.className("img-responsive")).isDisplayed();
//			if( flagImg) System.out.println("pass");
//			
//			
//			boolean flagSearch = driver.findElement(By.name("search")).isDisplayed();
//			if( flagSearch) { 
//				System.out.println("pass");
//				driver.findElement(By.name("search")).sendKeys("macbook");
//				
//			}

			By logoImage = By.className("img-responsive");
			By search = By.name("search");
			By searchIcon = By.cssSelector("#search > span > button");
			
			
			if(doElementDisplayed(logoImage)){
				System.out.println("image is present-------pass");
			}
			if(doElementDisplayed(search)){
				System.out.println("search is present-------pass");
			doSendKeys(search , "macbook");
			doClick(searchIcon);
			
			driver.quit();
			
			}
	}
	
	
	
	
      public static WebElement getElement(By locator) {
    	  return driver.findElement(locator);
      }
      public static boolean doElementDisplayed(By locator) {
    	  return getElement( locator).isDisplayed();
      }
      public static void doSendKeys(By locator,String value) {
    	  getElement(locator).sendKeys(value);
      
      }
      public static void doClick(By locator) {
    	  getElement(locator).click();
      }
}
