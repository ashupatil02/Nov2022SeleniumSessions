package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandle {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://www.londonfreelance.org/courses/frames/index.html");
		//driver.switchTo().frame(2);
		//driver.switchTo().frame("main");
	//	driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']")));
		
		int totalFrames = driver.findElements(By.xpath("//frame")).size();
		driver.switchTo().frame(driver.findElement(By.xpath("//frame[@src='top.html']")));
		
		Thread.sleep(3000);
		System.out.println(totalFrames);
		driver.switchTo().defaultContent();
		
		//Thread.sleep(3000);
	//	String header = driver.findElement(By.tagName("h2")).getText();
    //    System.out.println(header);

	}

}
