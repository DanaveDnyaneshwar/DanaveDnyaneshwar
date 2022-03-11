package Practice1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Registerne {
	WebDriver driver;
	public Registerne(WebDriver driver) {
		this.driver=driver;}
	
	By email=By.name("email");
	By psd=By.name("password");
	By cpsd=By.name("confirm Password");
	By reistraionbutton=By.id("submit");
	
	public void perform_female(String e,String p,String cp) {
		driver.findElement(email).sendKeys(e);
		driver.findElement(psd).sendKeys(p);
		driver.findElement(cpsd).sendKeys(cp);
		driver.findElement(reistraionbutton).click();		
	
	
}}
