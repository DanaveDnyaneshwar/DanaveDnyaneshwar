package Day6;
import java.io.*;
import java.util.concurrent.TimeUnit;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Properties {
static WebDriver driver;
static FileInputStream fis;
static Properties prop;
@BeforeClass
public static void before() throws IOException {

	// create an object for Properties
	fis=new FileInputStream(new File("C:\\Users\\91820\\Downloads\\java core\\LTIWebDriver\\config.properties"));
	prop=new Properties();
	prop.load(fis);
	
	System.setProperty("webdriver.chrome.driver",(String) prop.getProperty("ChromeDriverpath"));
	driver=new ChromeDriver();
    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    //open apllication
    //driver."newtoursurl")));
}



private void load(FileInputStream fis2) {
	// TODO Auto-generated method stub
	
}



private Object getProperty(String string) {
	// TODO Auto-generated method stub
	return null;
}



@Test
public void Test () { 
	//driver.findElement(By.name("userName")).sendKeys(prop.getProperty)("un");
    //driver.findElement(By.name("password")).sendKeys(prop.getProperty)("psd");
	
	
}


}
