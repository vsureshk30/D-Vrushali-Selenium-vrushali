package yourlogo1.vrushali1;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class OrderHistoryTest extends LogInTest {
	
	@Test
	
public void test_OrderHistoryTest(){
		
		
		
		OrderHistoryTest oh = PageFactory.initElements(driver, OrderHistoryTest.class);
		
		oh.test_LogInFunctionality();
		oh.test_OrderHistoryTest();
		driver.close();
		
	}

	private void test_clickSignIn() {
		// TODO Auto-generated method stub
		
	}
}
