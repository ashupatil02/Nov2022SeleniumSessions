package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserUtil {

	private WebDriver driver;
	/**
	 * This method is used to initialize the driver on the basis of given browser name
	 * @param browserName
	 * @return This returns the specific browser driver
	 */

	public WebDriver initDriver(String browserName) {
		System.out.println("broweser name is ; " + browserName);

		switch (browserName.toLowerCase().trim()) {
		case "chrome":
			driver = new ChromeDriver();
			break;

		case "firefox":
			driver = new FirefoxDriver();
			break;

		case "safari":
			driver = new SafariDriver();
			break;

		case "edge":
			driver = new EdgeDriver();
			break;
		case "ie":
			driver = new InternetExplorerDriver();
			break;

		default:
			System.out.println("plz pass the right browser :" +browserName);
			
			break;
		}
		
         driver.manage().window().fullscreen();
		
		driver.manage().deleteAllCookies(); 
		
		return driver;
		
	}
		
       
		
		

	
	public void launchURL(String url) {
		if (url==null) {
			System.out.println("url cannot be null");
		}
		if(url.indexOf("https")==0) {
			driver.get(url);
		}
		
		}
	
	public String getPageTitle() {
		String title = driver.getTitle();
		System.out.println("page title : " + title);
		return title;
	}

	public String getPageURL() {
		String url = driver.getCurrentUrl();
		System.out.println("page current url : " + url);
		return url;
	}

	public void closeBrowser() {
		if (driver != null) {
			driver.close();
		}
	}

	public void quitBrowser() {
		if (driver != null) {
			driver.quit();
		}
	
			
	}
}


