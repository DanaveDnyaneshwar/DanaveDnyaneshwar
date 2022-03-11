package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dragand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91820\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		//drag and drop operato 
		driver.manage().window().maximize();
		Actions act= new Actions(driver);
		WebElement src=driver.findElement(By.xpath("//div[@id ='products']/div/ul/li[2]/a"));
		
		WebElement target= driver.findElement(By.id(""));
		act.dragAndDrop(src,target)
		.build().perform();
		
		WebElement src1=driver.findElement(By.xpath(""));
		WebElement target1= driver.findElement(By.xpath("//*[@id='bank']/li"));
		
		act.dragAndDrop(src1,target1)

		.build().perform();
	
	
	}

}
