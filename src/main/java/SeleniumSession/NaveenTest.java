package SeleniumSession;

public class NaveenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String browserName = "Chrome";
		BrowserUtil brUtil = new BrowserUtil();
		
		brUtil.initDriver( browserName);
		
		brUtil.launchURL("https://www.naveenautomationlabs.com/opencart/");
		
		String actTitle = brUtil.getPageTitle();
		if(actTitle.contains("naveen")) {
			System.out.println("title-------pass");
		}
		else {
			System.out.println("title---------fail");
			
		}
		String actUrl = brUtil.getPageURL();
		if(actUrl.contains("automation")) {
			System.out.println("pass");
		}
			else {
				System.out.println("fail");
		}
		brUtil.quitBrowser();
		}

	

}
