package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyWebDriverMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("amazon")) {
			System.out.println("pass");
		}
			else {
				System.out.println("fail");
			}
		String pgSrc = driver.getPageSource();
		System.out.println(pgSrc);
		if(pgSrc.contains(".parentNode")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		}
		
		

	}


