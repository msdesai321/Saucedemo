package com.SauceDemo.POMClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPOMClass 
{
	WebDriver driver;
	Actions act;
	
	@FindBy(id="user-name")
	WebElement username;
	
	public void sendusername()
	{
		username.sendKeys("standard_user");
	}
	
	@FindBy(id="password")
	WebElement password;
	
	public void sendpassword()
	{
		password.sendKeys("secret_sauce");
	}
	
	@FindBy(id="login-button")
	WebElement loginbutton;
	
//	direct click
	public void clickloginbutton()
	{
		loginbutton.click();
	}
	
	//by mouse action
//	public WebElement clickloginbutton()
//	{
//		act.click().perform();
//		return loginbutton;
//	}
	
	
	//constructor
	public LoginPOMClass(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		act = new Actions(driver);
		
		
	}
	
	
	
	
	
	
	
	
	
	

}
