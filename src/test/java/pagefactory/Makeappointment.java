package pagefactory;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Makeappointment {

	 WebDriver driver;
	
	    @FindBy(id="combo_facility")
		WebElement facilitydropdown;
	    
	    @FindBy(id="chk_hospotal_readmission")
        WebElement checkbox;
	    
	    @FindBy (id="radio_program_medicaid")
	    WebElement rdmedicaid;
	    
	    @FindBy(id="txt_visit_date")
	    WebElement datepicker;
	    
	    @FindBy(id="txt_comment")
	    WebElement comment;
	    
	    @FindBy(id="btn-book-appointment")
	    WebElement bkappointment;
	   
	    @FindBy(xpath="//h2[normalize-space()='Appointment Confirmation']")
	    WebElement headappointconfirm;
	    
	    @FindBy(xpath="//p[@class='lead']")
	    WebElement loginpageverify;
		
		public Makeappointment(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}

		
		public  void selectfacilityDropDown(String facility) {
			Select drp=new Select(facilitydropdown);
			drp.selectByVisibleText(facility);

		}
		
		public void checkboxhospitalreadmission() {
			checkbox.click();
		}
		
		public void rdhealthcrprg() {
			rdmedicaid.click();
		}
		
		public void visitdate(String dt) {
			datepicker.sendKeys(dt);
			Actions action = new Actions(driver);
			action.moveByOffset(0, 0).click().build().perform();
			
		}
		
		public void addComment(String cmt) {
			comment.sendKeys(cmt);
		}
		
		public void booked() {
			bkappointment.click();
		}
		
		public void confirmappointment() {
			String ActualTitle=driver.getTitle();
			String ExpectedTitle="Logged In Successfully | Practice Test Automation";
			Assert.assertEquals(ExpectedTitle, ActualTitle);
			driver.close();
		}
		
		public void headconfirmappointment() {
			String Actualtext=headappointconfirm.getText();
			String Expectedtext="Appointment Confirmation";
			Assert.assertEquals(Expectedtext, Actualtext);
			
			//driver.close();
		}
		
		public void onloginpage() {
			String Actualtext=loginpageverify.getText();
			String Expectedtext="Please login to make appointment.";
			Assert.assertEquals(Expectedtext, Actualtext);
			
			//driver.close();
		}
}
