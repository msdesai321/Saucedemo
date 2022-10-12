package com.SauceDemo.TestClasses;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClass.HomePagePOMClass;
import com.SauceDemo.UtilityClass.ScreenshotClass;



public class TC02_VerifyLogoutFunctionality extends BaseClass
{
	@Test
	public void VerifyLogoutFunctionality() throws IOException
	{
		//home page
		HomePagePOMClass m1 = new HomePagePOMClass(driver);
		m1.clickmenubutton();
		m1.clicklogout();
		
		log.info("Logout is done");
		
		ScreenshotClass.screenshotmethod(driver,"TC02_Logout");
		
		log.info("apply the validation");
		
		String expectedURL = "https://www.saucedemo.com/";
		String actualURL = driver.getCurrentUrl();
		Assert.assertEquals(actualURL, expectedURL);

	}
	
	

}
