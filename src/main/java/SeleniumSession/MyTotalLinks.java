package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyTotalLinks {
	
  private static final String text = null;
static WebDriver driver;
  
	public static void main(String[] args) {
		driver= new ChromeDriver();
		driver.get("https://www.Costco.com/");
		
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		
	int linkscount =	linksList.size();
		System.out.println("total links :"  +linkscount);
		
		for(int i=0;i<linkscount;i++) {
			String text = linksList.get(i).getText();
			System.out.println(i+ " " +text);
			
		}
	

		
	}
			
		}
	


