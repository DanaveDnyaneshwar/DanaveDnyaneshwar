package Day7practice;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {

	  WebDriver webDriver;
	@Test
	public void TC1() {
		
	}
	@Before
	public  void Before() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91820\\Downloads\\chromedriver_win32\\chromedriver.exe");
		webDriver= new ChromeDriver();
		
		// close browser
		//driver.close();
		webDriver.get("https://demo.guru99.com/test/newtours/");
		//to maximize
		webDriver.manage().window().maximize();
		
	}
	
	
}
