package Practice1;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Brokenlink {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
		List<WebElement> links = driver.findElements(By.tagName("a"));
		//count no.of links on page
		System.out.println(links.size());
		for(int i=0;i<links.size();i++) {
	//by using href attribute we can get URL of requried link
			WebElement element=links.get(i);
			String url=element.getAttribute("href");
			URL link=new URL(url);
		//create a connection using url object 'link'
			HttpURLConnection httpConn = (HttpURLConnection) link.openConnection();
			//wait for 2sec
			Thread.sleep(2000);
			//establish connection
			httpConn.connect();
			int rescode=httpConn.getResponseCode();
			//return response code.if res code is above 400: broken
			if(rescode>=400) {
				System.out.println(url +"---"+"is broken link");	
			}else
			{
				System.out.println(url +"---"+"is valid link");
			}	
		}
	}

}
