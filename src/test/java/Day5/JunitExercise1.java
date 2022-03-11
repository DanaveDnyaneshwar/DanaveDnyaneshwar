package Day5;

import org.junit.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class JunitExercise1 {
	WebDriver driver;

	ExtentSparkReporter htmlreportloc;
    ExtentReports report;
    ExtentTest test;
@Test
public void Testcase1() {
	//ExtentSparkReporter htmlreportloc;
    //xtentReports report;
    //ExtentTest test;
	test = report.createTest("Login TC");
	System.out.println("Test Case1");
	driver.manage().window().maximize();
	//enter username
	driver.findElement(By.name("userName")).sendKeys("mercury");
	driver.findElement(By.name("password")).sendKeys("mercury");
	driver.findElement(By.name("submit")).click();
// log is successcheck whather
	String actualresult = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/h3")).getText();
Assert.assertEquals("Login Successfully", actualresult);
System.out.println(actualresult);
if(driver.getTitle().contains("Login")){
    test.log(Status.PASS, "Login Success");

}else{
    test.log(Status.FAIL, "Login Unsucess");
}

} 
@Test
public void Testcase2() throws InterruptedException{
	System.out.println("flights search");
	driver.findElement(By.linkText("Flights")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//input[@value='oneway']")).click();
	
}
	
@Before

public void Before() {
	
  htmlreportloc = new ExtentSparkReporter("C:\\SRC\\MyReport.html");
     //create ExtentReports class
     report = new ExtentReports();
     report.attachReporter(htmlreportloc);
     //to beautfy the report
     htmlreportloc.config().setTheme(Theme.DARK);
	System.out.println("Test Case2");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\91820\\Downloads\\chromedriver_win32\\chromedriver.exe");
 driver= new ChromeDriver();
	driver.get("https://demo.guru99.com/test/newtours/");
	// click on Register link
	//driver.findElement(By.linkText("REGISTER")).click();
}
@After
public void Testca2() {
	System.out.println("Test Case3");
	driver.close();
	
}
}