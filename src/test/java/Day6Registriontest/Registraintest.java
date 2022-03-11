package Day6Registriontest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import Day6.pom.Homepage;
import Day6.pom.Loginpaage;
import Day6.pom.Register;

public class Registraintest {
static WebDriver driver;
 static Homepage hp;
static Register rp;
static Loginpaage lp;

@BeforeClass
public static void beforeClass()throws IOException, InterruptedException{
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91820\\Downloads\\chromedriver_win32\\chromedriver.exe");
 	 driver= new ChromeDriver();
 	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
 	 Thread.sleep(10000);
 		driver.get("https://demowebshop.tricentis.com");
 		//create an object for homepageclass
 		hp=new Homepage(driver);
	    rp=new Register(driver);
	    lp=PageFactory.initElements(driver, Loginpaage.class);
}
//@AfterClass
//public static void afterclass() {
	//driver.close();
//}

	@Test
	public void test() {
		hp.clickRegister();
	    rp.perform_female("d", "dd", "danave@123.com", "Danave123", "Danave123");
		driver.findElement(By.linkText("Log out")).click();
		
//String text=driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[1]/h1").getText();		
	//	assertTrue
		
		
		
	}
}


