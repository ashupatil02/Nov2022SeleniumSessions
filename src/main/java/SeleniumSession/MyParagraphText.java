package SeleniumSession;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.w3c.dom.Text;

public class MyParagraphText {
  static WebDriver driver;
	public static void main(String[] args) {
		driver = new ChromeDriver();
		driver.get("https://classic.crmpro.com");
		
		List<WebElement> paraList = driver.findElements(By.tagName("p"));
		int paraCoutnt = paraList.size();
		
		System.out.println("total paragraghs :" +paraCoutnt);
		
		for(WebElement e: paraList) {
			String text = e.getText();
			System.out.println(text);
//			if(text.length()==0) {
//				System.out.println("-------------");
//			}
		}
		

	}

}
