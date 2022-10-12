package com.SauceDemo.TestClasses;

import org.testng.Assert;

import org.testng.annotations.Test;

public class TC01_VerifyLoginFunctionality extends BaseClass
{
	
	
	
	@Test
	public void verifyLoginFunctionality()
	{
		//home page
		log.info("apply the validation");
		
		String actualpagetitle = driver.getTitle();
		String expectedpagetitle = "Swag Labs";
		Assert.assertEquals(actualpagetitle, expectedpagetitle);
		
	}
	


}
