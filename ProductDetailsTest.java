package yourlogo1.vrushali1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ProductDetailsTest extends TestBase {
	
	//WebDriver driver;
	
	@Test
	
	public void test_ProductDetailsFunctionality(){
		
		super.test_baseTest();
		
		ProductDetails pd = PageFactory.initElements(driver , ProductDetails.class);
		
		pd.test_clickSignIn();
		pd.test_addProduct1();
		
		driver.close();

		
		
		
		
	}

}
