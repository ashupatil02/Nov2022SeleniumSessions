package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class MyWebDriverBasics {

	public static void main(String[] args) {
	String browser = "Chrome";
	WebDriver driver = null;
		
		switch (browser) {
		case "Chrome":
			 driver = new ChromeDriver();
			break;
			
		case "Firefox":
			driver = new FirefoxDriver();
			break;
		case "Safari":
			driver = new SafariDriver();
			break;
			
			default:
				System.out.println("plz find the right browser");
			break;
		}
		
		driver.get("https://www.google.com");
		String actTitle = driver.getTitle();
		System.out.println("page title :" + actTitle);
		
		if(actTitle.equals("Google")) {
			System.out.println("pass");
		}
			else {
				System.out.println("fail");
			}
		driver.quit();
		}

	}


