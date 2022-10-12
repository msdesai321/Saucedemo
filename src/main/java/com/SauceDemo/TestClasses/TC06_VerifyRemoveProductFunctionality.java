package com.SauceDemo.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClass.HomePagePOMClass;
import com.SauceDemo.POMClass.YourCartPOMClass;



public class TC06_VerifyRemoveProductFunctionality extends BaseClass
{
	@Test
	public void TRemoveProductFunctionality()
	{
		HomePagePOMClass m1 = new HomePagePOMClass(driver);
		
		m1.clickcartButton();
		
		YourCartPOMClass m2 = new YourCartPOMClass(driver);
		
		m2.clickonremove();
		
		log.info("apply the validation");
		String actualresult = m1.gettextaddtocart();
		String expectedresult = "";
		Assert.assertEquals(actualresult, expectedresult);	
	}

}
