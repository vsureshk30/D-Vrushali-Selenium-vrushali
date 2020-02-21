package yourlogo1.vrushali1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.google.common.base.Verify;

public class ProductDetails {
	
	WebDriver driver;
	
	public ProductDetails(WebDriver Idriver){
		
		this.driver =Idriver;
	}
	@FindBy (xpath="//a[@title='Log in to your customer account']") WebElement clickSignIn ;

	
	@FindBy(xpath="//a[@title='Women']")WebElement clickWomenLink;
	@FindBy(xpath="(//*[@id='center_column'])//a[@title='Faded Short Sleeve T-shirts']")WebElement product1;
	@FindBy(xpath="(//a[@itemprop='url'])[3]")WebElement clickProduct1;
	@FindBy(xpath="//input[@id='quantity_wanted']")WebElement clickQnty;
	@FindBy(xpath="//button[@name='Submit']") WebElement addToCart;
	@FindBy(xpath="//a[@title='Proceed to checkout']")WebElement clickProceed2Checkout;
	@FindBy(xpath="(//a[@title='Proceed to checkout'])[2]")WebElement finalProceed2Checkout;
	@FindBy(xpath="(//span[text()='$35.02'])[2]")WebElement expectedCost;
	@FindBy(xpath="//input[@type='checkbox']")WebElement clickCheckBox;
	@FindBy(xpath="//a[@title='Pay by check.']")WebElement clickPayByCheck;
	@FindBy(xpath="(//button[@type='submit'])[2]")WebElement clickConfirmOrder;
	
	public void test_clickSignIn(){

		try{

			clickSignIn.click();
			Thread.sleep(2500);


		}
		catch(Exception e){

			System.out.println(e.getMessage());
		}



	}
	
	public void test_addProduct1(){
		
		try{
		
		clickWomenLink.click();
		Thread.sleep(2500);
		
	
		Actions oAction = new Actions(driver);
		oAction.moveToElement(product1).build().perform();		
		//Thread.sleep(2500);
		
		clickProduct1.click();
		Thread.sleep(2500);
		
		
		clickQnty.click();
		Thread.sleep(2500);
		
		clickQnty.clear();
		Thread.sleep(2500);
		
		clickQnty.sendKeys("2");
		Thread.sleep(2500);

		
		addToCart.click();
		Thread.sleep(2500);
		clickProceed2Checkout.click();
		Thread.sleep(2500);
		
		String actualCost = "$35.02";
		String getCost = expectedCost.getText();
		
		if(actualCost.contains(getCost)){
			
			System.out.println("Pass");
			
		}
		else{
			System.out.println("Fail");
		}
		
		for(int i=0;i<1;i++){
			
			finalProceed2Checkout.click();
			Thread.sleep(3500);
		}
		clickCheckBox.click();
		Thread.sleep(2500);
		finalProceed2Checkout.click();
		Thread.sleep(2500);
		
		clickConfirmOrder.click();
		Thread.sleep(2500);
		}
		catch(Exception e){
			System.out.println(e.getMessage());
		}
	}
	
	
	
		
		


}
