package Day7practice;
import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Demo1 {
 static WebDriver driver;
 //WebElement textbox;
	@Test
	public void TC1(){
	WebElement	textbox=driver.findElement(By.name("q"));
	WebElement	searchbox=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]"));	
	assertTrue(textbox.isDisplayed());
	assertTrue(searchbox.isDisplayed());
	}
	@Test
	public void TC2() {
		driver.findElement(By.name("q")).sendKeys("testing");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();	
		
		//int listsize=driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul[1]/div/ul/li[1]/div/div[")).size();
		assertTrue(driver.getTitle().contains("testing"));
	}
	@Test
	public void TC3(){
		//driver.findElement(By.name("q")).sendKeys("");
		driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[3]/center/input[1]")).click();
		assertTrue(driver.getTitle().contains("Google"));	
	}
	@Test
	public void TC4() {
		int linksize=driver.findElements(By.tagName("a")).size();
		assertTrue(linksize>0);
		}
	@Before
	public void beforemethod() {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91820\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 	 driver= new ChromeDriver();
	 	 //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 		driver.get("https://www.google.com/");
	}
	
	@After
	public void after(){
		driver.close();
	}
	
}
