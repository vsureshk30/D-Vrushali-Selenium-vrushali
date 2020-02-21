package yourlogo.vrushali;

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
	@FindBy(xpath="(//select[@class='form-control'])")WebElement selectText;
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

	enterEmailAddress.sendKeys("vrushali.kandesar@gmail.com");
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
String inputTextArray[] ={"Vrushali", "KS", "vrushali.kandesar@gmail.com","yourlogo@20","Vrushali","KS","IKS",
		"Navi Mumbai","Kharghar","Navi Mumbai","410210","Test","1234567890","9619055084",
		"vrushali@Test.com"};

for(int i=0;i<=15;i++){
	
	
	
//WebElement inputText = driver.findElement(By.xpath(("(//input[@type='text']) +'[' i +"]"));
	Thread.sleep(2500);By.xpath("");
	//inputText.sendKeys(inputTextArray[i]);
	
	
}}
	catch(Exception e){
		System.out.println(e.getMessage());
	}}



public void test_selectText(){
	
	String selectTextArray[] ={"2","March","1999","Alaska"};
	
	for(int i=1;i<=4;i++){
		
		selectText.sendKeys(selectTextArray[i],Keys.ENTER);
		
		
		
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




