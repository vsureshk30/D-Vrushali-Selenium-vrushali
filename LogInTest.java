package yourlogo.vrushali;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class LogInTest extends TestBase {
	
//	WebDriver driver;
	
	@Test
	
	public void test_LogInFunctionality(){
		
		super.test_baseTest();
		
		LogIn login = PageFactory.initElements(driver, LogIn.class);
		
		login.test_Login();
		driver.close();
		
	}

}
