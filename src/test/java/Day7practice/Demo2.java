package Day7practice;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {
WebDriver driver;
	@Test
	public void TC1() {
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Before
	public void beforemethod() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91820\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 	 driver= new ChromeDriver();
	 	 //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 		driver.get("https://www.google.com/");
	}
	
	@After
	public void aftermethod() {
		
		
		
	}
	
	
	
	
	
}
