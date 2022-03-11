package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Amazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91820\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.name("field-keywords")).sendKeys("samsung");
		
Actions act = new Actions(driver);
act.moveToElement(driver.findElement(By.name("field-keywords")))
.pause(2000)
.sendKeys(Keys.ARROW_DOWN)
.sendKeys(Keys.ARROW_DOWN)
.sendKeys(Keys.ENTER)
.build().perform();
driver.close();

	
	}

}
