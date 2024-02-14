package stepDefinations;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.*;
import pagefactory.Loginphealthpf;
import pagefactory.Makeappointment;

public class LoginPageSteps {

	WebDriver driver;
	Loginphealthpf ob;
	Makeappointment ma;
	
	@Given("open the browser")
	public void open_the_browser() {

		System.out.println("I am inside pagefactory");
		System.out.println("browser open");
		System.setProperty("webdriver.chrome.driver","D:/SeleniumProject Live/src/test/resources/Driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Given("User is on Home Page")
	public void user_is_on_home_page() {

		driver.navigate().to("https://katalon-demo-cura.herokuapp.com/");
		
	}

	@When("User Click on Make Oppointment")
	public void user_click_on_make_oppointment() throws InterruptedException  {
		ob = new Loginphealthpf(driver);
          ob.clkmakeappointment();
         Thread.sleep(5000);
	}
	
	

	@Then("user go to login page")
	public void user_go_to_login_page() {
		String ActualTitle=driver.getTitle();
		String ExpectedTitle="CURA Healthcare Service";
		Assert.assertEquals(ExpectedTitle, ActualTitle);
		System.out.println("Enter to login page");
	}

	@When("^user enters (.*) and (.*)$")
	public void user_enters_username_and_password(String username,String password) {
		ob.enterUsername(username);
		ob.enterPassword(password);
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@When("user click on login")
	public void user_click_on_login() {
		ob.clkLogin();
	}

	@Then("user navigated to book Appointment page")
	public void user_navigated_to_book_appointment_page() {
		System.out.println("Appointment booked");
		//driver.quit();
	}
	
	@When("user is on Make Appointment Page")
	public void user_is_on_make_appointment_page() {
	   
		System.out.println("Make appoint");
		driver.navigate().to("https://katalon-demo-cura.herokuapp.com/#appointment");
		System.out.println("Make appoint---1");
	}

	@And("user select {string} from facility drpdown")
	public void user_select_from_facility_drpdown(String facility) {
		ma=new Makeappointment(driver);
	 ma.selectfacilityDropDown(facility);
	}

	@When("user select checkbox apply for hospital readmission")
	public void user_select_checkbox_apply_for_hospital_readmission() {
	   ma.checkboxhospitalreadmission();
	}

	@When("user select Medicaid radio button")
	public void user_select_medicaid_radio_button() {
	    ma.rdhealthcrprg();
	}

	@Then("user select the date {string}")
	public void user_select_the_date(String dt) {
		ma.visitdate(dt);
		
	}
	

	@And("user add comment to the box as {string}")
	public void user_add_comment_to_the_box_as(String comment) {
	    ma.addComment(comment);
	    
	}

	@And("user click on book appointment")
	public void user_click_on_book_appointment() {
	 ma.booked();
	}

	@Then("user navigated to Appointment confirmation page")
	public void user_navigated_to_appointment_confirmation_page() {
		System.out.println("----Success Booked-----");
	    ma.headconfirmappointment();
	    System.out.println("----Success Booked-----");  
	}
	
	
	
	@Then("user is on login page")
	public void user_is_on_login_page() {
		ma=new Makeappointment(driver);
  ma.onloginpage();
	}

	@Then("user enter username as {string} and password as {string}")
	public void user_enter_username_as_and_password_as(String string1, String string2) {
		ob.enterUsername(string1);
		ob.enterPassword(string2);
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}

	@Then("Click on login button")
	public void click_on_login_button() {
		ob.clkLogin();
	}

}
