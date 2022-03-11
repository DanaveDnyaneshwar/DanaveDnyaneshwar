package Day4;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class TableFetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91820\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		// implciwait
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://demo.guru99.com/test/web-table-element.php#");
	driver.manage().window().maximize();
	// fetch no of colums 
	////*[@id="leftcontainer"]/table/thead/tr/th[1]
	List<WebElement> col = driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
	System.out.println("column size is:"  +col.size());
	// fetch the no rows
	////*[@id="leftcontainer"]/table/tbody/tr[1]/td[1]
	List<WebElement> row= driver.findElements(By.xpath("//*[@id='leftcontainer']/table/tbody/tr"));
	
	System.out.println("row size is:"  +row.size());
	// fetch the specific data from table
	String cell = driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td[2]")).getText();
	if (cell.equals("A")) {
		
		System.out.println("data validation is success");
		
	}
	
	else {
		System.out.println("data validation is not success");}
		
		// check which company is on top
		
	String top =driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr[1]/td[1]")).getText();
		System.out.println("top company is:"+top);
		// fetch top 5 compnay lust
		for (int i=1;i<5;i++) {
			String list =driver.findElement(By.xpath("//*[@id='leftcontainer']/table/tbody/tr["+i+"]/td[1]")).getText();
			
System.out.println(list);


		}
	
		driver.close();
	}

}
