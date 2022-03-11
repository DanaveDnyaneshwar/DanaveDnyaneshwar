package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex2downloadshop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91820\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
		// click on register link
		driver.findElement(By.linkText("Register")).click();
		driver.findElement(By.id("gender-female")).click();
	driver.findElement(By.name("FirstName")).sendKeys("dnyaneshwar");
	driver.findElement(By.name("LastName")).sendKeys("danave");
	driver.findElement(By.name("Email")).sendKeys("danave1997@gmail.com");
	driver.findElement(By.name("Password")).sendKeys("Danave123");
	driver.findElement(By.name("ConfirmPassword")).sendKeys("Danave123");
	driver.findElement(By.name("register-button")).click();
	driver.findElement(By.linkText("Log in")).click();
	driver.findElement(By.name("Email")).sendKeys("danave1997@gmail.com");
	driver.findElement(By.name("Password")).sendKeys("Danave123");
	driver.findElement(By.xpath("//input[@value='Log in']")).click();
	driver.findElement(By.id("small-searchterms")).sendKeys("Build your own cheap computer");
	driver.findElement(By.linkText("Build your own cheap computer")).click();
	driver.findElement(By.xpath("//input[@value='65']")).click();
	driver.findElement(By.xpath("//input[@value='91']")).click();
	driver.findElement(By.xpath("//input[@value='58']")).click();
	driver.findElement(By.xpath("//input[@value='93']")).click();
	driver.findElement(By.xpath("//input[@value='94']")).click();
	driver.findElement(By.xpath("//input[@value='95']")).click();
	driver.findElement(By.id("add-to-cart-button-72")).click();

	
	//
	//driver.close(); 
	}
}
