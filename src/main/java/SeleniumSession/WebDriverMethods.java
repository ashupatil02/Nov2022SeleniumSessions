package SeleniumSession;

import javax.annotation.processing.SupportedSourceVersion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		driver.manage().window().maximize();
	//	driver.manage().window().fullscreen();
		
		driver.manage().deleteAllCookies();
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.contains("amazon.com")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		String pgSrc = driver.getPageSource();
		System.out.println(pgSrc);
		if(pgSrc.contains("/ATVPDKIKX0DER:")) {
			System.out.println("pass");
		}
		driver.quit();
		
		
		
		
		

	}

}
