package pagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginphealthpf {

	@FindBy(id="txt-username")
	WebElement txt_username;
	
	@FindBy(id="txt-password")
	WebElement txt_password;
	
	@FindBy(id="btn-login")
	WebElement btn_login;
	
	@FindBy(id="btn-make-appointment")
	WebElement btn_makeappointment;
	
	WebDriver driver;
	
	public Loginphealthpf(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	public void enterUsername(String username) {
		txt_username.sendKeys(username);
	}
	
	public void enterPassword(String password) {
		txt_password.sendKeys(password);
	}
	
	public void clkLogin() {
		btn_login.click();
	}
	
	public void clkmakeappointment() {
		btn_makeappointment.click();
	}
	
}
