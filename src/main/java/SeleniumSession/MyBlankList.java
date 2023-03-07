package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyBlankList {
	
	static WebDriver driver;

	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://www.costco.com/");
		
		//find all the links on the page
		
	List<WebElement> linksList = driver.findElements(By.tagName("a"));
	
	//print the total links count 
	   int linksCount =  linksList.size();
	   
		System.out.println("total links:" + linksCount);
		
	
		int count = 0;
		for( int i=0; i<linksCount; i++) {
		String text = linksList.get(i).getText();
//			System.out.println(text);
//			if(text.length()>0) {
//				System.out.println(i + ":"  +text);
//				System.out.println(text);
//			}
			
			if(text.length()==0) {
				count++;
				
			}
				System.out.println(count);
			}
			System.out.println(linksCount-count);
			
//		}
		
//		int count = 0;
//		int bcount = 0;
//		for(WebElement e: linksList) {
//		String text = e.getText();
//			if(text.length()>0) {
//				System.out.println(text);
//			}
//			if(text.length()==0) {
//				//bcount++;
//			System.out.println( text);
//			}
	}

}


