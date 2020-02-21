package yourlogo.vrushali;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class CreateAccountTest extends TestBase {
	
	//WebDriver driver;
	
	@Test
	
	public void test_AccountCreation(){
		
		super.test_baseTest();
		CreateAccount ca = PageFactory.initElements(driver, CreateAccount.class);
		
		ca.test_clickSignIn();
		ca.test_enterEmailAddress();
		ca.test_clickCreateAccountButton();
		ca.test_clickMrs();
		ca.test_inputText();
		ca.test_selectText();
		ca.test_clickRegister();
		
		driver.close();
		
		
		
		
		
	}

}
