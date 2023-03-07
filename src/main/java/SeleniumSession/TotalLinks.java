package SeleniumSession;

import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {
	
	static WebDriver driver;
	// static String text;


	public static void main(String[] args) {
		// find all the links on the page and print the total links count and print text of each link
		
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		
		//find all the links on the page
		
	List<WebElement> linksList = driver.findElements(By.tagName("a"));
	
	//print the total links count 
	   int linksCount =  linksList.size();
	   
		System.out.println("total links:" + linksCount);
//		
//		for( int i=0; i<linksCount; i++) {
//			String text = linksList.get(i).getText();
//		//	System.out.println(text);
//			if(text.length()>0) {
//				System.out.println( i + ":" + text);
//			}
//			}


//		for(WebElement e : linksList) {
//			String text = e.getText();
//				if(text.length()>0) {
//					System.out.println(text);
//				}
//		
//	}
		
		int count = 0;
		for(WebElement e : linksList) {
			String text = e.getText();
				if(text.length()>0) {
					System.out.println( count+ ":" + text);
				}
				count++;
		
	}

	}
}


