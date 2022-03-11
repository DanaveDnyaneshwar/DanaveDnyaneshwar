package Day5;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SC1 {
WebDriver driver;
@Test
public void TestCase1() {
	
	WebElement registerlink= driver.findElement(By.linkText("Register"));
	WebElement login=driver.findElement(By.linkText("Log in"));
	assertTrue(registerlink.isDisplayed());
	assertTrue(registerlink.isDisplayed());
}
@Test

public void Test() {
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.name("Email")).sendKeys("danave1997@gmail.com");
	driver.findElement(By.name("Password")).sendKeys("Danave123");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	String emailtext=driver.findElement(By.linkText("danave1997@gmail.com")).getText();
	//assertTrue(emailtext.contains("danave1997"));
	//assertEquals("danave1997@gmail.com",emailtext);
	assertTrue(driver.findElement(By.linkText("danave1997@gmail.com")).isEnabled());
	
	
	
	
	
}
@Before
public void Before() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91820\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/registerresult/1");
	
	
}

@After
public void After() {
	
	driver.close();
	
	
}






}
