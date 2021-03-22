package allPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.baseClass.BaseClass;

public class LoginPage extends BaseClass{

	public LoginPage(WebDriver driver)
	{
		 PageFactory.initElements(driver,this);
	}
	
	public void login(String email, String password) throws Exception
	{
		System.out.println("Email and Password = "+email +" , "+password);
		
		wd.findElement(By.xpath(propconfig.getProperty("usernamelocator"))).sendKeys(propconfig.getProperty("username"));
		wd.findElement(By.xpath(propconfig.getProperty("passwordlocator"))).sendKeys(propconfig.getProperty("password"));
		wd.findElement(By.xpath(propconfig.getProperty("loginbtnlocator"))).click();
	}
	
}
