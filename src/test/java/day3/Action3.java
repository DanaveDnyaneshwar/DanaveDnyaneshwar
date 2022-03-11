package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91820\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com");
	driver.manage().window().maximize();
	WebElement comp = driver.findElement(By.xpath("//div[@class='header-menu']/ul[1]/li[2]/a"));
	//WebElement comp1 = driver.findElement(By.xpath("//a[contains(text(),'Accessories')]"));
	
	WebElement comp1 = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[2]/ul[1]/li[2]/ul/li[3]/a"));
	
	Actions act= new Actions(driver);
	
	act.moveToElement(comp).moveToElement(comp1).click().build().perform();
	
	
	
	}

}
