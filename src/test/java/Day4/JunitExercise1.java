package Day4;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JunitExercise1 {
	WebDriver driver;
@Test
public void Testcase1() {
	System.out.println("Test Case1");
	driver.manage().window().maximize();
	//enter username
	driver.findElement(By.name("userName")).sendKeys("mercury");
	driver.findElement(By.name("password")).sendKeys("mercury");
	driver.findElement(By.name("submit")).click();
// log is successcheck whather
	 String actualresult = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3")).getText();
     Assert.assertEquals("Login Successfully", actualresult);

} 
@Test
public void Testcase2() throws InterruptedException{
	System.out.println("flights search");
	driver.findElement(By.linkText("Flights")).click();
	Thread.sleep(5000);
	//driver.findElement(By.xpath("//input[@value='oneway']")).click();
	
}
	
@Before
public void Before() {
	System.out.println("Test Case2");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91820\\Downloads\\chromedriver_win32\\chromedriver.exe");
 driver= new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/");
	// click on Register link
	//driver.findElement(By.linkText("REGISTER")).click();
}
@After
public void Testca2() {
	System.out.println("Test Case3");
	//driver.close();
	
}
}