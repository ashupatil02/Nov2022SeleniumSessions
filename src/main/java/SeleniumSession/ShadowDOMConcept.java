package SeleniumSession;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDOMConcept {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		Thread.sleep(5000);
		//driver.findElement(By.id("pizza")).sendKeys("veg pizza");
		
		//browser --> page --> shadowDOM --> shadow DOM ---> input element
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement un = (WebElement)js.executeScript("return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#kils\")");
		
		un.sendKeys("Ashwini");
		
	WebElement pizza = (WebElement)js.executeScript("return document.querySelector(\"#userName\").shadowRoot.querySelector(\"#app2\").shadowRoot.querySelector(\"#pizza\")");
		
		pizza.sendKeys("veg pizza");
		
	WebElement destiny = (WebElement)js.executeScript("return document.querySelector(\"#glaf\")");
		
		destiny.sendKeys("Edison");
		
		
	}

		

	}


