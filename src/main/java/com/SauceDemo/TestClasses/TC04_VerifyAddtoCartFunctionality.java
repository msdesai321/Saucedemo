package com.SauceDemo.TestClasses;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.SauceDemo.POMClass.HomePagePOMClass;
import com.SauceDemo.POMClass.LoginPOMClass;
import com.SauceDemo.UtilityClass.ScreenshotClass;

public class TC04_VerifyAddtoCartFunctionality extends BaseClass
{
	
	
	@Test
	public void VerifyAddtoCartFunctionality()
	{
		
		//add to cart
		HomePagePOMClass m1 = new HomePagePOMClass(driver);
		m1.clickaddtocartbutton();
		
		//validation
		log.info("apply the validation");
		String Actualtext = m1.gettextaddtocart();
		String expectedtext = "1";
		Assert.assertEquals(Actualtext, expectedtext);
	}
		
	
}
