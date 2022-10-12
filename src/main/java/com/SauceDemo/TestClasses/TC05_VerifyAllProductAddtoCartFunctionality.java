package com.SauceDemo.TestClasses;


import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SauceDemo.POMClass.HomePagePOMClass;
import com.SauceDemo.UtilityClass.ScreenshotClass;

public class TC05_VerifyAllProductAddtoCartFunctionality extends BaseClass
{
	@Test
	public void VerifyAllProductAddtoCartFunctionality() throws IOException
{	
	
	//add to cart
	HomePagePOMClass m1 = new HomePagePOMClass(driver);
	//1st method add to cart-- for condition
//	m1.clickaddalltocartbutton();
	log.info("Add to cart");
	
	//2nd method add to cart - for each condition
	m1.clickaddalltocartbutton1();
	ScreenshotClass.screenshotmethod(driver, "TC05_AddtoCart");
	
	log.info("all product add to cart");
	String actualproductadd = m1.gettextaddtocart();
	String expectproductadd = "6";
	Assert.assertEquals(actualproductadd, expectproductadd);
}
	
}

