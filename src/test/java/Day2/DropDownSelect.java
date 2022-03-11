package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownSelect {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91820\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		
		// close browser
		//driver.close();
		driver.get("https://demo.guru99.com/test/newtours/");
		//to maximize
	driver.manage().window().maximize();
		//enter user name
	driver.findElement(By.name("userName")).sendKeys("mercury");
	//enter password
	driver.findElement(By.name("password")).sendKeys("mercury");
	//click on submit
	driver.findElement(By.name("submit")).click();
	//click on one way
	driver.findElement(By.linkText("Flights")).click();
	//click on one way
	Thread.sleep(10000);
	driver.findElement(By.xpath("//input[@value='oneway']")).click();
	// selecg passenger count
	Select p=new Select(driver.findElement(By.name("passCount")));
	p.selectByVisibleText("4");
	// select city
	Select d=new Select(driver.findElement(By.name("fromPort")));
	d.selectByVisibleText("London");
	// select month 
	Select c=new Select(driver.findElement(By.name("fromMonth")));
	c.selectByIndex(2);
	Select b=new Select(driver.findElement(By.name("fromDay")));
	b.selectByVisibleText("11");
	Select a=new Select(driver.findElement(By.name("toPort")));
	a.selectByVisibleText("New York");
	//returning
	Select e=new Select(driver.findElement(By.name("toMonth")));
	e.selectByVisibleText("April");
	// day return
	Select w=new Select(driver.findElement(By.name("toDay")));
	w.selectByVisibleText("4");
	//serviceclass
	driver.findElement(By.xpath("//input[@value='Business']")).click();
	//airline
	
	Select r=new Select(driver.findElement(By.name("airline")));
	r.selectByVisibleText("Blue Skies Airlines");
	//continue
	driver.findElement(By.name("findFlights")).click();
	driver.close();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
