package SeleniumSession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NaveenAutomationTest {
 WebDriver driver;
	public static void main(String[] args) {
		BrowserUtil brUtil = new BrowserUtil();
		
		String browserName = "edge";
		brUtil.initDriver(browserName);
		brUtil.launchURL("https://naveenautomationlabs.com/opencart/");
		
		
		String actTitle = brUtil.getPageTitle();
		System.out.println(actTitle);
		if(actTitle.contains("Store")){
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		String actUrl =  brUtil.getPageURL();
		if(actUrl.contains("naveen")) {
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		brUtil.quitBrowser();
	}

}
