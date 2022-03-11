package Day2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxbrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.gecko.driver","C:\\Users\\91820\\Downloads\\geckodriver-v0.30.0-win64\\geckodriver.exe");
        WebDriver ffdriver=new FirefoxDriver();
        ffdriver.quit();
	}

}
