package Day6Registriontest;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Day6.pom.Homepage;
import Day6.pom.Loginpaage;
import Day6.pom.Register;

public class NewTest2 {
 
 
  WebDriver driver;
    Homepage hp;
   Register rp;
   Loginpaage lp;

  @BeforeClass
  public  void beforeClass()throws IOException{
  	
  	System.setProperty("webdriver.chrome.driver","C:\\Users\\91820\\Downloads\\chromedriver_win32\\chromedriver.exe");
   	 driver= new ChromeDriver();
   	 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
   		driver.get("https://demowebshop.tricentis.com/register");
   		//create an object for homepageclass
   		hp=new Homepage(driver);
  	    rp=new Register(driver);
  	    lp=PageFactory.initElements(driver, Loginpaage.class);
  }
  //@AfterClass
  //public  void afterclass() {
  	//driver.close();
 // }

  	@Test
  	public void test(String email,String p) {
  		hp.click_login();
  	    rp.perform_login(email,p);
  	    if (driver.findElement(By.linkText("log out")).isDisplayed()) {
  		System.out.println("Login success");
  	    hp.click_logout();
  	    }
  	    else {
  	    	
  	    	System.out.println("Log un");
  	    }	
}
@DataProvider
  public Object[][] data() {
    return new Object[][] {
      new Object[] { "Danave123@gmail.com", "Password123" },
      new Object[] { "mercury", "" },
      
    };
  }
  	
}	