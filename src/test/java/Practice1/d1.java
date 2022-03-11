package Practice1;


	
	import static org.testng.Assert.*;

   import java.util.concurrent.TimeUnit;

	import org.junit.After;
	import org.junit.Assert;
	import org.junit.Before;
	import org.junit.Test;
	import org.openqa.selenium.By;
	 import org.openqa.selenium.WebDriver;
     import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;

	import org.openqa.selenium.support.ui.Select;

	public class d1 {
		WebDriver driver;
		@Test
		public void TC01() {
			driver.findElement(By.name("btnLogin")).click();
			driver.switchTo().alert().accept();
			System.out.println("Alert handled");
		}
		@Test
		public void TC02()
		{
			driver.findElement(By.name("uid")).sendKeys("1303");
			driver.findElement(By.name("password")).sendKeys("Guru99");
			driver.findElement(By.name("btnLogin")).click();
			driver.findElement(By.linkText("Mini Statement")).click();
			Select drop1=new Select(driver.findElement(By.name("accountno")));
		    drop1.selectByVisibleText("3309");
		    driver.findElement(By.name("AccSubmit"));
			
		}
		@Test
		public void TC03()
		{
			driver.findElement(By.name("uid")).sendKeys("1303");
			driver.findElement(By.name("password")).sendKeys("Guru99");
			driver.findElement(By.name("btnLogin")).click();
			String title=driver.getTitle();
			Assert.assertEquals("Guru99 Bank Customer HomePage",title);
		}
		@Test
		public void TC04()
		{
			driver.findElement(By.name("uid")).sendKeys("1303");
			driver.findElement(By.name("password")).sendKeys("Guru99");
			driver.findElement(By.name("btnLogin")).click();
			driver.findElement(By.linkText("Mini Statement")).click();
			WebElement gh =driver.findElement(By.linkText("Home"));
			assertTrue(gh.isDisplayed());
			//if(driver.findElement(By.linkText("Home")).isDisplayed())
					{
				//System.out.println("The link is there");
				}
			//else
			//{
				//System.out.println("The link is not there");
			//}
		}
		@Before
		public void beforeclass()
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\91820\\Downloads\\chromedriver_win32\\chromedriver.exe");
			
			 driver= new ChromeDriver();
			driver.manage().window().maximize();
		    //driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		    driver.get("http://demo.guru99.com/Agile_Project/Agi_V1/index.php");
			
		}
		@After
		public void afterclass()
		{
			driver.close();
		}
		}


