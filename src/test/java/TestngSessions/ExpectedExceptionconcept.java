package TestngSessions;

import org.testng.annotations.Test;

public class ExpectedExceptionconcept {
	
	@Test(expectedExceptions = NullPointerException.class)
	public void loginTest() {
		System.out.println("login test");
		int i = 9/0;
	}

}
