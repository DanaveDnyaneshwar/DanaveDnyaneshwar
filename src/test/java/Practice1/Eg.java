package Practice1;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.*;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Eg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrome.driver", "C:\\Users\\91820\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
	driver.get("https://demo.guru99.com/test/newtours/index.php");
    driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
	List<WebElement> links = driver.findElements(By.tagName("a"));
    System.out.println("The number of links is"+ links.size());
    
    Iterator<WebElement> iterator = links.iterator();
    while (iterator.hasNext()) {
  	  String links1  = iterator.next().getText();
  	  System.out.println(links1);
    }

    
    
    driver.close();
		
		
	}

}
