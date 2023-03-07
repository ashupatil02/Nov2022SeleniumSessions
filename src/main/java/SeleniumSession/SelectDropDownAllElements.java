package SeleniumSession;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

///import java.awt.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDownAllElements {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial");
		
//		 WebElement country_ele = driver.findElement(Country);
//		 Select select = new Select(driver.findElement(Country));
//		 
//		List<WebElement> countryList =  select.getOptions();
//	//	 List<WebElement> countryList = select.getOptions();
//		System.out.println(countryList.size()-1);
//		
//		for(WebElement e :  countryList) {
//			String text = e.getText();
//			System.out.println(text);
//			if(text.equals("Brazil")) {
//				e.click();
//				break;
//			}
//		}
	
//		if(getTotalDropDownOptions( Country)-1==232) {
//			System.out.println("country drop down count is correct");
//		}
//		if( getTotalDropDownOptionsTextList(Country).contains("India")) {
//			System.out.println("India is present");
//		}
//		List<String>  expCountryList = Arrays.asList("India","Brazil","Belgium");
//		if(getTotalDropDownOptionsTextList(Country).containsAll(expCountryList)) {
//			System.out.println("pass");
//		}
	By country = By.id("Form_getForm_Country");
	
	SelectDropDownValue(country ,"Greece");

	}	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
}
	
	public static List<WebElement>  getTotalDropDownOptionsList(By locator) {
		Select select = new Select(getElement( locator));
		return select.getOptions();
		}
	
	public static List<String>  getTotalDropDownOptionsTextList(By locator) {
	List<WebElement> optionsList = getTotalDropDownOptionsList (locator);
	List<String> optionsTextList = new ArrayList<String>();
	for(WebElement e : optionsList) {
		String text = e.getText();
		optionsTextList.add(text);
		
	}
	return optionsTextList;
	}
	public static void SelectDropDownValue(By locator,String expValue) {
		List<WebElement> optionsList = getTotalDropDownOptionsList(locator);
		for(WebElement e : optionsList) {
			String text = e.getText();
			System.out.println(text);
			if (text.equals(expValue)) {
				e.click();
				break;
			}
		
	}
	
}
	

	public static int getTotalDropDownOptions(By locator) {
		int optionsCount =  getTotalDropDownOptionsList(locator).size();
		System.out.println("total options ===>" +optionsCount);
		return optionsCount;
		
	}
}