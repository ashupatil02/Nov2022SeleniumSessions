package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectTagDropdownHandle {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
	//	By Country = By.id("Form_getForm_Country");
//		 WebElement country_ele = driver.findElement(Country);
//		 Select select = new Select(country_ele);
//		 
//		 select.selectByIndex(5);
//		 select.selectByValue("India");
//		 select.deselectByVisibleText("Belgium");
//	
		By Country = By.id("Form_getForm_Country");
		 doSelectDropDoownByIndex( Country,5); 
		 Thread.sleep(2000);
		 doSelectDropDoownByValue(Country,"Belgium");
		 Thread.sleep(2000);
		 doSelectDropDoownByVisibleText(Country, "India");
		 Thread.sleep(2000);

	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSelectDropDoownByIndex(By locator,int index) {
		 Select select = new Select(getElement(locator));
		 select.selectByIndex(index);
	}
		
	
	public static void doSelectDropDoownByValue(By locator,String value) {
		 Select select = new Select(getElement(locator));
		 select.selectByValue(value);
	}
	public static void doSelectDropDoownByVisibleText(By locator,String text) {
		 Select select = new Select(getElement(locator));
		 select.selectByVisibleText(text);
	}

}
