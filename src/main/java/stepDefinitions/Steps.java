package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.baseClass.BaseClass;
import com.util.CommonUtil;
import allPages.LoginPage;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Steps extends BaseClass{

	LoginPage loginObj = new LoginPage(wd);
	CommonUtil cu = new CommonUtil(wd);
	
	@Given("^user is on Login Page$")				
    public void user_is_on_Login_Page()	throws Throwable						
    {		
        System.out.println("user is on Login Page");
        
        System.setProperty(propconfig.getProperty("drivername"), propconfig.getProperty("driverpath"));
        wd = new ChromeDriver();
        wd.get(propconfig.getProperty("weburl"));
        wd.manage().window().maximize();
    }
	
	@When("^email and password text box are visible$")				
    public void email_and_password_text_box_are_visible() throws Throwable							
    {		
        System.out.println("email and password text box are visible");	
        
        cu.elementPresent();
    }
	
	@Then("^user enters username and passowrd$")				
    public void user_enters_username_and_passowrd() throws Throwable							
    {		
        System.out.println("user enters username and passowrd");
        
        String user = propconfig.getProperty("username");
		String pass = propconfig.getProperty("password");
		loginObj.login(user, pass);
    }
	
	@And("^user verifies the username displayed on home page$")				
    public void user_verifies_the_username_displayed_on_home_page() throws Throwable							
    {		
        System.out.println("user verifies the username displayed on home page");
        
        String expectedText = propconfig.getProperty("expectedText");
        cu.textPresent(expectedText);
    }
	
	@And("^user logs out$")				
    public void user_logs_out() throws Throwable							
    {		
        System.out.println("user logs out");					
        
        cu.logout();
    }
}
