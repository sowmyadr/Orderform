package Script;

import org.testng.annotations.Test;

import Generic.BaseTest;
import POM.LoginPage;

public class VerifyLoginPage {
	
	public class verifyLoginPage extends BaseTest{
		@Test
		public void testVerifyLoginPage(){
			
			LoginPage l=new LoginPage(driver);
			l.SetText("sowmya@trueinfluence.in", "sowmya");
			l.LoginButton();
			
			
		}
		
	}

}
