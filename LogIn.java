package yourlogo1.vrushali1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogIn {

	WebDriver driver;


	public LogIn(WebDriver Idriver){
		this.driver =Idriver;
	}

	@FindBy (xpath="//a[@title='Log in to your customer account']") WebElement clickSignIn ;
	@FindBy(xpath="//input[@id='email']")WebElement enterUserName;
	@FindBy(xpath="//input[@id='passwd']")WebElement enterPassword;
	@FindBy(xpath="//button[@id='SubmitLogin']")WebElement clickLogIn;

	public void test_clickSignIn(){

		try{

			clickSignIn.click();
			Thread.sleep(2500);


		}
		catch(Exception e){

			System.out.println(e.getMessage());
		}



	}


	public void test_Login(){

		try{

			enterUserName.sendKeys("vrushali.kandesar5@gmail.com");
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
