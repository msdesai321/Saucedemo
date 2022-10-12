package com.SauceDemo.TestClasses;

import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.SauceDemo.POMClass.HomePagePOMClass;
import com.SauceDemo.UtilityClass.ScreenshotClass;

public class TC03_VerifySortingFunctionality extends BaseClass
{
	@Test
	public void VerifySortingFunctionality() throws IOException
	{
		
		HomePagePOMClass m2 = new HomePagePOMClass(driver);
		m2.clicksortby();
		ScreenshotClass.screenshotmethod(driver,"TC03_HomePageAftersorting");
		
		//validation
		log.info("apply validation");
		
		String actualtext = m2.gettexthigherprice();
		String expectedtext = "Sauce Labs Fleece Jacket";
		Assert.assertEquals(actualtext, expectedtext);
	}
}
