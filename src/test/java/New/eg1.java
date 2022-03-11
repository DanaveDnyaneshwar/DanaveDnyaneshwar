package New;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Practice1.Homenew;
import Practice1.Registerne;

public class eg1 {
	static WebDriver driver;
	 static Homenew hp;
	static Registerne rp;
	@BeforeClass
	public static void beforeClass()throws IOException{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91820\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 	 driver= new ChromeDriver();
	 	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 		driver.get("https://demo.guru99.com/test/newtours/");
	 		//create an object for homepageclass
	 		hp=new Homenew(driver);
		    rp=new Registerne(driver);}
		    
		   // @AfterClass
		  //public static void afterclass() {
		  	//driver.close();
		  //}

		  	@Test
		  	public void test() {
		  		hp.clickRegister();
		  	    rp.perform_female( "danave@123.com", "Danave123", "Danave123");
		  		driver.findElement(By.linkText("Log out")).click();
		  		
}
}
