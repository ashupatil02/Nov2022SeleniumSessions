package SeleniumSession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpathConcept {

	public static void main(String[] args) {
		

			WebDriver driver = new ChromeDriver();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
			
			//xpath: address of the element in html dom
			//1. absolute xpath: /html/body/div[2]/div/div/div[2]/div[1]/div/div[2]/h4/a
			//2. relative xpath: custom xpath
			
			
			//tag[@attr='value']
			//input[@id='input-email']
			//input[@placeholder='E-Mail Address']
			
			//tag[@attr1='value' and @attr2='value']
			//input[@type='text' and @name='email']
			//input[@type='text' and @name='email' and @id='input-email']
			
			//tag
			//input
			//a -- 81
			//img
			//input[@type='text' or @type='email']
			
			//xpath with text():
			//text is not an attribute, its the text content of the element
			//dont use @text....we use text() function
			//tag[text()='value']
			//h2[text()='Returning Customer']
			//h2[text()='New Customer']
			
			By newCus = By.xpath("//h2[text()='New Customer']");
			
			//check My Account links is present on the page -- two times
			By myAcc = By.xpath("//a[text()='My Account']");
			int myAccCount = driver.findElements(myAcc).size();
			if(myAccCount == 2) {
				System.out.println("PASS");
			}
			
			//text() with attribute:
			//tag[@attr='value' and text()='value']
			//h1[@class='h0-80' and text()='Love your software']
			//a[@class='list-group-item' and text()='Register']
			//a[text()='Register' and @class='list-group-item']
			
			//tag[@attr1='value' and @attr2='value' and text()='value']
			//a[text()='Register' and @class='list-group-item' and @href]
			//a[@href]
			
			//p[text()='Freshworks makes ridiculously easy-to-use marketing, sales, support and IT solutions.']
			
			//contains() with attribute:
			//tag[contains(@attr,'value')]
			//input[contains(@placeholder,'E-Mail')]
			//input[contains(@placeholder,'Address')]
			
			//input[contains(@id,'email')]
			//input[@id='input-email']
			
			//contains() with one attribute and use another attribute without contains():
			//tag[contains(@attr1,'value') and @attr2='value']
			//input[contains(@placeholder,'E-Mail') and @name='email']
			//input[contains(@placeholder,'E-Mail') and @name='email' and @type='text']
			
			//dynamic id/attribute:
//			<input id=firstname_123>
//			<input id=firstname_456>
//			<input id=firstname_989>
			
			//By.id("firstname_123");//not the right xpath
			//input[contains(@id,'firstname_')] -- right
			
			//contains() with text():
			//tag[contains(text(),'value')]
			//p[contains(text(),'marketing, sales, support')]
			//h2[contains(text(),'50,000 companies')]
			//a[contains(text(),'Amazon')]
			
			//contains() with text() and contains() with attribute:
			//tag[contains(text(),'value') and contains(@attr,'value')]
			//a[contains(text(),'Science') and contains(@href,'amazon.science')]
			
			//contains() with text() and attribute with contains():
			//tag[contains(text(),'value') and @attr='value']
			//a[contains(text(),'Science') and @class='nav_a']
			
			//starts-with():
			//tag[starts-with(text(),'value')]
			//a[starts-with(text(),'Amazon')]
			//small[starts-with(text(),'Free CRM has powerful call tracking')]
			
			//input[starts-with(@aria-labelledby,'UIFormControl') and @type='email']
			//a[starts-with(@href,'https://naveenautomationlabs.com/')]
			
			
			//ends-with() in xpath??? -- NA
			
		}

	}





	


