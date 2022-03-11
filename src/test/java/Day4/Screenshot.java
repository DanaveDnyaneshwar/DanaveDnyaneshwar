
package Day4;



import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {



	public static void main(String[] args) throws InterruptedException //IOException
, IOException
	{
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91820\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.scrollBy(0,2000)");
	// take a screen shot
	TakesScreenshot s=(TakesScreenshot)driver;
	File src= s.getScreenshotAs(OutputType.FILE);//taking ss of object
	// copy src to place it in local Systrm
	File dest=new File("C:\\SRC\\Screenshot1.png");
	FileUtils.copyFile(src,dest);
	Thread.sleep(2000);
	driver.close();
	
	}
}
