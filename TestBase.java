package yourlogo1.vrushali1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBase {
	
	WebDriver driver;
	
	public void test_baseTest(){
		
		System.setProperty("webdriver.driver.chrome", "D://Sel_WebDriver_reeuiredfiles//Selenium//WebDriver//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
	}

	
}
