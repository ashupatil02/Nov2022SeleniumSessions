package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MyLocatorInSel {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
	//1st method	
//		driver.findElement(By.id("input-firstname")).sendKeys("Ashwini");
//		driver.findElement(By.id("input-lastname")).sendKeys("Patil");
//		driver.findElement(By.id("input-email")).sendKeys("ashupatil02@gmail.com");
//		driver.findElement(By.id("input-telephone")).sendKeys("2016471473");
//		driver.findElement(By.id("input-password")).sendKeys("ashu123");
//		driver.findElement(By.id("input-confirm")).sendKeys("ashu123");
	//2nd method	
//		WebElement Fname = driver.findElement(By.id("input-firstname"));
//		WebElement Lname = driver.findElement(By.id("input-lastname"));
//		WebElement Eid =  driver.findElement(By.id("input-email"));
//		WebElement Tphone = driver.findElement(By.id("input-telephone"));
//		WebElement Pwd = driver.findElement(By.id("input-password"));
//		WebElement ForgotPwd = driver.findElement(By.id("input-confirm"));
//		
//		
//		Fname.sendKeys("Ashwini");
//		Lname.sendKeys("Patil");
//		Eid.sendKeys("ashupatil02@gmail.com");
//		Tphone.sendKeys("2016471473");
//		Pwd.sendKeys("ashu123");
//		ForgotPwd.sendKeys("ashu123");
		
		
		
		
		
	//3rd method	
//		By fname = By.id("input-firstname");
//		By lname = By.id("input-lastname");
//		By eid =  By.id("input-email");
//		By tphone = By.id("input-telephone");
//		By pwd =  By.id("input-password");
//		By Fpwd = By.id("input-confirm");
//		
//		WebElement Fname = driver.findElement(fname);
//		WebElement Lname = driver.findElement(lname);
//		WebElement Email = driver.findElement(eid);
//		WebElement phoneno = driver.findElement(tphone);
//		WebElement password = driver.findElement(pwd);
//		WebElement Forgotpass = driver.findElement(Fpwd);
//		
//		Fname.sendKeys("Ashwini");
//		Lname.sendKeys("Patil");
//		Email.sendKeys("ashupatil02@gmail.com");
//		phoneno.sendKeys("2016471473");
//		password.sendKeys("ashu123");
//		Forgotpass.sendKeys("ashu123");
		
//	4th method
		
//		By fname = By.id("input-firstname");
//		By lname = By.id("input-lastname");
//		By eid =  By.id("input-email");
//		By tphone = By.id("input-telephone");
//		By pwd =  By.id("input-password");
//		By Fpwd = By.id("input-confirm");
//		
//		
//		 getElement(fname).sendKeys("Ashwini");
//		 getElement(lname).sendKeys("patil");
//		 getElement(eid).sendKeys("ashupatil02@gmail.com");
//		 getElement(tphone).sendKeys("2016471473");
//		 getElement(pwd).sendKeys("Ashu123");
//		 getElement(Fpwd).sendKeys("Ashu123");
	// 5th method
		
//		By fname = By.id("input-firstname");
//		By lname = By.id("input-lastname");
//		By eid =  By.id("input-email");
//		By tphone = By.id("input-telephone");
//		By pwd =  By.id("input-password");
//		By Fpwd = By.id("input-confirm");
//		
//		doSendKeys(fname,"Ashwini");
//		doSendKeys(lname,"patil");
//		doSendKeys(eid,"ashupatil02@gmail.com");
//		doSendKeys(tphone,"2016471473");
//		doSendKeys(pwd,"Ashu123");
//		doSendKeys(Fpwd,"Ashu123");
//		
//		
		//6th method
		
		By fname = By.id("input-firstname");
		By lname = By.id("input-lastname");
		By eid =  By.id("input-email");
		By tphone = By.id("input-telephone");
		By pwd =  By.id("input-password");
		By Fpwd = By.id("input-confirm");
		
		ElementUtil eleUtil = new ElementUtil(driver);
		
		 eleUtil.doSendKeys(fname,"Ashwini");
		 
		 eleUtil.doSendKeys(lname,"patil");
		 eleUtil.doSendKeys(eid,"ashupatil02@gmail.com");
		 eleUtil.doSendKeys(tphone,"2016471473");
		 eleUtil.doSendKeys(pwd,"Ashu123");
		 eleUtil.doSendKeys(Fpwd,"Ashu123");
		 
		By accCreate =  By.linkText("Your Account Has Been Created!");
		System.out.println("accCreate");
		 
		

	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator , String value) {
	getElement(locator).sendKeys(value);
	}


}
