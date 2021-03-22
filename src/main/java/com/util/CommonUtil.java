package com.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.baseClass.BaseClass;

public class CommonUtil extends BaseClass{

	public CommonUtil(WebDriver driver)
	{
		 PageFactory.initElements(driver,this);
	}
	
	public void elementPresent()
	{
		if(wd.findElement(By.xpath(propconfig.getProperty("usernamelocator"))) != null && 
				wd.findElement(By.xpath(propconfig.getProperty("passwordlocator"))) != null)
		{
			System.out.println("Username and password are present");
		}
		else
		{
			System.out.println("Username and password are not present");
		}
	}
	
	public void textPresent(String expectedText)
	{
		Assert.assertEquals(expectedText, wd.findElement(By.xpath(propconfig.getProperty("userprofileText"))).getText().trim(), "User Profile Not Matched" );
	}
	
	public void logout()
	{
		wd.findElement(By.xpath(propconfig.getProperty("logoutlocator"))).click();
	}
	
}
