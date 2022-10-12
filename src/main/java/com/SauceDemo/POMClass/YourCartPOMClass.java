package com.SauceDemo.POMClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourCartPOMClass 
{
	WebDriver driver;
	
	public YourCartPOMClass(WebDriver driver)
	{
		this.driver = driver;
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[text()='Remove']")
	private List<WebElement> remove;
	public void clickonremove()
	{
		for(WebElement remove : remove)
		{
			remove.click();
		}
	}
	
	

}
