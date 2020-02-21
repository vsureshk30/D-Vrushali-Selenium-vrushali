package yourlogo.vrushali;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductDetails {
	
	WebDriver driver;
	
	public ProductDetails(WebDriver Idriver){
		
		this.driver =Idriver;
	}
	
	@FindBy(xpath="//a[@title='Women']")WebElement clickWomenLink;
	@FindBy(xpath="(//*[@id='center_column'])//a[@title='Faded Short Sleeve T-shirts']")WebElement product1;
	@FindBy(xpath="//a[@title='Add to cart']")WebElement clickProduct1;
	@FindBy(xpath="(//*[@id='center_column'])//a[@title='Blouse']")WebElement product2;
	@FindBy(xpath="//a[@title='Add to cart']")WebElement clickProduct2;
	@FindBy(xpath="//span[@title='Close window']")WebElement clickClose;
	@FindBy(xpath="//a[@title='Proceed to checkout']")WebElement clickProceed2Checkout;
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")WebElement finalProceed2Checkout;
	
	
	
	public void test_addProduct1(){
		
		try{
		
		clickWomenLink.click();
		Thread.sleep(2500);
		
		product1.click();
		Thread.sleep(2500);
		
		clickProduct1.click();
		Thread.sleep(2500);
		
		clickClose.click();
		Thread.sleep(2500);
				
		
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	
	public void test_addProduct2(){
		try{
		product2.click();
		Thread.sleep(2500);
		
		clickProduct2.click();
		Thread.sleep(2500);
		
		clickProceed2Checkout.click();
		Thread.sleep(2500);
		
		finalProceed2Checkout.click();
		Thread.sleep(2500);
				
		
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
		
		
	}
	

}
