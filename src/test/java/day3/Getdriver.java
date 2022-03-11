package day3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Getdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91820\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
	driver.manage().window().maximize();
	String title= driver.getTitle();
	System.out.println("title is :"+title);
	// check titl of web page equals to demo web shop
	if(title.equals("demo Web Shop ")) {
		// fetch current url
		System.out.println(driver.getCurrentUrl());
		// fetch html source of page
		System.out.println("dd");
	}
	
	
	
	
	}

}
