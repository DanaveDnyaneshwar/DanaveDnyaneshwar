package day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard {

	public static void main(String[] args) {
		// TODO 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91820\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		//drag and drop operato 
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable")))
		.build().perform();
		

	}

}
