package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Homenew {
WebDriver driver;


	
	public Homenew(WebDriver driver2) {
		this.driver=driver;
	// TODO Auto-generated constructor stub
}
	By registerlink=By.linkText("REGISTER");
	//By loginlink=By.linkText("Log in");
	//By Searchbox=By.name("q");
	//By Searchbutton=By.xpath("//input[@value='Search]");
    //By logout=By.name("Log out");
	
	// methids
	//public void click_login() {
		//driver.findElement(loginlink).click();
	//}
		
	public void clickRegister() {
		driver.findElement(registerlink).click();
	}
	//public void search_product(String productname) {
		//driver.findElement(Searchbox).sendKeys(productname);
		//driver.findElement(Searchbutton).click();
	}
	
	//public void click_logout() {
		//driver.findElement(logout).click();
	////}
	




