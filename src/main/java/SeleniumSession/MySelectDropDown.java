package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MySelectDropDown {
	
 static WebDriver driver;
 
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		By cele = By.id("Form_getForm_Country");
		
		WebElement ele = driver.findElement(cele);
		
		Select select = new Select(ele);
		
		 select.selectByIndex(7);
		 select.selectByIndex(5);
		 select.selectByValue("Australia");
		 select.selectByVisibleText("India");
		// doSelectDropDoownByIndex(cele,5);
		 
		 List<WebElement> cList = select.getOptions();
		 System.out.println( cList.size()-1);
		 for(WebElement e:cList ){
			 String text= e.getText();
			 System.out.println(text);
			 if(text.equals("India")) {
				 e.click();
				 break;
			 }
		 }

	}
	
//	public static WebElement getElement(By locator) {
//		return driver.findElement(locator);
//	}
//	
//	public static void doSelectDropDoownByIndex(By locator,int index) {
//		 Select select = new Select(getElement(locator));
//		 select.selectByIndex(index);
//	}
//		
//	
//	public static void doSelectDropDoownByValue(By locator,String value) {
//		 Select select = new Select(getElement(locator));
//		 select.selectByValue(value);
//	}
//	public static void doSelectDropDoownByVisibleText(By locator,String text) {
//		 Select select = new Select(getElement(locator));
//		 select.selectByVisibleText(text);
//	}

}
