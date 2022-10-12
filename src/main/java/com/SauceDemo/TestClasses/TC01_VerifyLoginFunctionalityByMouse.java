package com.SauceDemo.TestClasses;


import org.testng.Assert;

import org.testng.annotations.Test;


public class TC01_VerifyLoginFunctionalityByMouse extends BaseClass
{
	
	
	@Test
	public void loginFunctionality2()
	{
		
		
		log.info("apply the validation");
		
		String actualpagetitle = driver.getTitle();
		String expectedpagetitle = "Swag Labs";
		Assert.assertEquals(actualpagetitle, expectedpagetitle);
		
	}
	
	

}
