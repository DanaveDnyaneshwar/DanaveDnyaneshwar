package Day6.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Register {
WebDriver driver;
public Register(WebDriver driver) {
	this.driver=driver;}
// locators
	By male=By.id("gender-male");	
	By female=By.name("gender-female");
	By fn=By.name("FirstName");
	By ln=By.name("LastName");
	By email=By.name("Email");
	By psd=By.name("Password");
	By cpsd=By.name("onfirmPassword");
	By reistraionbutton=By.id("register-button");
	
	//Register function
	public void perform_female(String f,String l,String e,String p,String cp) {
		driver.findElement(female).click();
		driver.findElement(fn).sendKeys(f);
		driver.findElement(ln).sendKeys(l);
		driver.findElement(email).sendKeys(e);
		driver.findElement(psd).sendKeys(p);
		driver.findElement(cpsd).sendKeys(cp);
		driver.findElement(reistraionbutton).click();		
	
	}

	public void perform_login(String e, String p) {
	
		driver.findElement(email).sendKeys(e);
		driver.findElement(psd).sendKeys(p);
	}
}
