package yourlogo1.vrushali1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderHistory {
	
	WebDriver driver;
	
	public OrderHistory(WebDriver Idriver){
		
		this.driver =Idriver;
	}
	@FindBy (xpath="//a[@title='Log in to your customer account']") WebElement clickSignIn ;

	@FindBy(xpath="//span[text()='abc de']")WebElement clickProfile;
	@FindBy(xpath="//a[@title='Orders']")WebElement clickOrderHostoryAndDetails;
	@FindBy(xpath="//td[@class='history_price']")WebElement getTotalPrice;
	
	public void test_clickSignIn(){

		try{

			clickSignIn.click();
			Thread.sleep(2500);


		}
		catch(Exception e){

			System.out.println(e.getMessage());
		}



	}
	
	public void test_OrderHistory(){
		
		try{
			
			clickProfile.click();
			Thread.sleep(2500);
			
			clickOrderHostoryAndDetails.click();
			Thread.sleep(2500);
			
			String actualCost = "$35.02";
			String getCost = getTotalPrice.getText();
			
			if(actualCost.contains(getCost)){
				
				System.out.println("Pass");
				
			}
			else{
				System.out.println("Fail");
			}
			
			
			
		}
		
		catch(Exception e){
			System.out.println(e.getMessage());
			
		}
		
		
	}
	
	
	

}
