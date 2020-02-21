package yourlogo.vrushali;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogIn {
	
	WebDriver driver;
	
	
	public LogIn(WebDriver Idriver){
		this.driver =Idriver;
	}
	

	@FindBy(xpath="//input[@id='email']")WebElement enterUserName;
	@FindBy(xpath="//input[@id='passwd']")WebElement enterPassword;
	@FindBy(xpath="//button[@id='SubmitLogin']")WebElement clickLogIn;
	
	
	
	public void test_Login(){
		
		try{
			
			enterUserName.sendKeys("vrushali.kandesar");
			Thread.sleep(2500);
			
			enterPassword.sendKeys("yourlogo@20");
			Thread.sleep(2500);
			
			clickLogIn.click();
			Thread.sleep(2500);
			
			
			
			
			
		}
		
		catch(Exception e){
			
			System.out.println(e.getMessage());
		}
	}
	
}
