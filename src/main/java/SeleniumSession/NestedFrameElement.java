package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NestedFrameElement {

	
		public static void main(String[] args) {
			WebDriver driver = new ChromeDriver();
			driver.get("https://selectorshub.com/iframe-scenario/");
			
			//nested iframes
				//f1 -- ele
					//f2  -- ele
						//f3 -- ele
			
			
			driver.switchTo()
			.frame("pact1")
				.switchTo().frame("pact2")
			//	.sendKeys("ABC")
						.findElement(By.id("jex"))
							.sendKeys("PQR");;//f2
			//driver.findElement(By.id("jex")).sendKeys("PQR");

			
			
//			driver.switchTo().frame("pact1");
//			driver.findElement(By.id("inp_val")).sendKeys("ABC");
//			
//			driver.switchTo().frame("pact2");
//			driver.findElement(By.id("jex")).sendKeys("PQR");
//			
//			driver.switchTo().parentFrame();//sel 4.x -- f1
//			driver.findElement(By.id("inp_val")).sendKeys("ABC--new");
	//
//			
//			driver.switchTo().frame("pact2");//f2
//			driver.switchTo().frame("pact3");//f3
//			driver.findElement(By.id("glaf")).sendKeys("Naveen");
//			
//			driver.switchTo().parentFrame();//sel 4.x -- f2
//			driver.switchTo().parentFrame();//sel 4.x -- f1
//			//driver.switchTo().defaultContent();//page
//			driver.findElement(By.id("inp_val")).sendKeys("ABC---456");
//			
//			driver.switchTo().defaultContent();


		}

	}


