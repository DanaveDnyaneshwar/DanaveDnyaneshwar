package day3;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91820\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
	driver.manage().window().maximize();
	// handel alert with ok
	String oldpage=driver.getWindowHandle();
	System.out.println("currently opened page window ID:"+oldpage);
	driver.findElement(By.linkText("Click Here")).click();
	// stch frm old windoe to new wnidow
	// to get the window ID of newly opend tab, use below syntax
	Set<String> newpage=driver.getWindowHandles();
	for(String name:newpage) {
		driver.switchTo().window(name);
		System.out.println("windo id of newly opend tab is:"+name);
		
	}
	// enter email 
	driver.findElement(By.name("emailid")).sendKeys("danave201997@gmail.com");
	
	// click on submit
	driver.findElement(By.name("btnLogin")).click();
	// switch from newpage to old
	driver.switchTo().window(oldpage);
	// driver.close--> clode only active tab
	driver.quit();
		
		
		
		
		
	}

}
