package yourlogo1.vrushali1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateAccount {
	
	WebDriver driver;
	
	public CreateAccount(WebDriver Idriver){
		
		this.driver = Idriver;
		
		}
	
	@FindBy (xpath="//a[@title='Log in to your customer account']") WebElement clickSignIn ;
	@FindBy(xpath="//input[@id='email_create']")WebElement enterEmailAddress;
	@FindBy(xpath="//button[@name='SubmitCreate']")WebElement clickCreateAccountButton;
	@FindBy(xpath="(//input[@name='id_gender'])[2]")WebElement clickMrs;
	//@FindBy(xpath="(//input[@type='text'])")WebElement inputText;
	//@FindBy(xpath="(//select[@class='form-control'])")WebElement selectText;
	@FindBy(xpath="//select[@id='id_state']")WebElement selectState;
	@FindBy(xpath="//span[text()='Register']")WebElement clickRegister;
	
	
	public void test_clickSignIn(){

		try{

			clickSignIn.click();
			Thread.sleep(2500);


		}
		catch(Exception e){

			System.out.println(e.getMessage());
		}



	}
	
public void test_enterEmailAddress(){
		
		try{
			
			enterEmailAddress.click();
			Thread.sleep(2500);

	enterEmailAddress.sendKeys("vrushali.kandesar5@gmail.com");
		Thread.sleep(2500);


			
			
		}
		catch(Exception e){
			
			System.out.println(e.getMessage());
		}

	

}

public void test_clickCreateAccountButton(){
	
	try{
		clickCreateAccountButton.click();
		Thread.sleep(2500);
	}
	catch(Exception e){
		
		System.out.println(e.getMessage());
	}
}

public void test_clickMrs(){
	try{
	clickMrs.click();
	Thread.sleep(2500);}
	catch(Exception e){
		System.out.println(e.getMessage());
	}
}


public void test_inputText(){
	
	
	
	try{
String inputTextArray[] ={"","","Vrushalia", "KS", "vrushali.kandesar5@gmail.com","Vrushalia","KS","IKS",
		"Navi Mumbai","Kharghar","Navi Mumbai","00000","1234567890","9619055094",
		"vrushali@Test.com"};

for(int i=2;i<=14;i++){
	
	WebElement inputText = driver.findElement(By.xpath(("(//input[@type='text'])["+i+"]")));
	
	inputText.clear();
	Thread.sleep(2500);
	inputText.sendKeys(inputTextArray[i]);
	Thread.sleep(1000);
	
	
	}
WebElement password = driver.findElement(By.id("passwd"));
password.sendKeys("yourlogo@20");
Thread.sleep(2500);



}
	catch(Exception e){
		System.out.println(e.getMessage());
	}}



public void test_selectText(){
	
	
	try{
		
		selectState.click();
		Thread.sleep(2500);

		selectState.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		Thread.sleep(2500);
		
		
		/*String selectTextArray[] ={"2","March","1999","Al","United States"};
		
	for(int i=0;i<=4;i++){
		
		
		
		WebElement selectText = driver.findElement(By.xpath("(//select[@class='form-control'])[" +i +"]"));
		
		selectText.click();
		Thread.sleep(2500);
		
		selectText.sendKeys(selectTextArray[i],Keys.ENTER);
		Thread.sleep(3500);
		
		
		
	}*/
	
	}catch(Exception e){
		System.out.println(e.getMessage());
	}
	
	
}

public void test_clickRegister(){
	try{
	clickRegister.click();
	Thread.sleep(2500);
	}
	catch(Exception e){
		System.out.println(e.getMessage());
	}
}
}




