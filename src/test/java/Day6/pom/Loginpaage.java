package Day6.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Loginpaage {
WebDriver driver;
public Loginpaage (WebDriver driver) {
	this.driver=driver;

}

// locatores
@FindBy(name="Email") public WebElement email;
@FindBy(name="Password") public WebElement psd;
@FindBy(xpath="//imput[@value='Log in]") public WebElement loginbutton;
///Functio
public void perform_login(String un,String p){
	email.sendKeys(un);
	psd.sendKeys(p);
	loginbutton.click();
	
}


}
