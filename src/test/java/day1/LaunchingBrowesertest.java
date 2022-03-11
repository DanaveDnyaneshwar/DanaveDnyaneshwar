package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchingBrowesertest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// launch chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91820\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	
	// close browser
	//driver.close();
	driver.get("https://demo.guru99.com/test/newtours/");
	// click on Register link
	driver.findElement(By.linkText("REGISTER")).click();
	//enter username as danave
	driver.findElement(By.name("email")).sendKeys("Danave");
	//enter password as pass123
	driver.findElement(By.name("password")).sendKeys("pass123");
	// enter confirm password
	driver.findElement(By.name("confirmPassword")).sendKeys("pass123");
	//click on submit
	driver.findElement(By.name("submit")).click();
	
	driver.findElement(By.linkText("SIGN-ON")).click();
	driver.findElement(By.name("userName")).sendKeys("Danave");
	driver.findElement(By.name("Password")).sendKeys("pass123");
	driver.findElement(By.name("Submit")).click();
	// close browser
	
		driver.close();
	}

}
