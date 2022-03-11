package Day4;




import static org.junit.Assert.assertEquals;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Scenario6 {
WebDriver driver;

@Test
public void Testcase1(){
driver.findElement(By.linkText("Register")).click();
driver.findElement(By.id("gender-female")).click();
driver.findElement(By.name("FirstName")).sendKeys("dnyaneshwar");
driver.findElement(By.name("LastName")).sendKeys("danave");
driver.findElement(By.name("Email")).sendKeys("danave1997@gmail.com");
driver.findElement(By.name("Password")).sendKeys("Danave123");
driver.findElement(By.name("ConfirmPassword")).sendKeys("Danave123");
driver.findElement(By.name("register-button")).click();	
String actualresult= driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[1]/h1")).getText();
assertEquals("Register", actualresult);
}

@ Test
public void Testcase2() {
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.name("Email")).sendKeys("danave1997@gmail.com");
	driver.findElement(By.name("Password")).sendKeys("Danave123");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	//String actualresult= driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).getText();
	//assertEquals("Log out", actualresult);
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
