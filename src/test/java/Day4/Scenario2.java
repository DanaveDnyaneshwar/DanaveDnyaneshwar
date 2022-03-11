package Day4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Scenario2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\91820\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
	
	driver.manage().window().maximize();
	driver.findElement(By.xpath("//input[@value='Search'")).click();
	// wait for 2 seconds for alert to apper on the screen
	WebDriverWait wait= new WebDriverWait(driver,2);
	wait.until(ExpectedConditions.alertIsPresent());
	 
	driver.switchTo().alert().accept();
	driver.close();
	
	
		
		
	}

}
