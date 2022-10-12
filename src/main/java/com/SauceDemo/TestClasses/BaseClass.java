package com.SauceDemo.TestClasses;

import java.io.IOException;
import java.time.Duration;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import com.SauceDemo.POMClass.LoginPOMClass;
import com.SauceDemo.UtilityClass.ScreenshotClass;

public class BaseClass 
{
WebDriver driver;
Logger log = Logger.getLogger("SauceDemo");

	@Parameters("browsername")
	@BeforeMethod
	public void setUp(String browsername) throws IOException 
	{
		if(browsername.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",
					"./DriverFile\\geckodriver.exe");
			driver = new FirefoxDriver();
			log.info("Browser is opened");
		}
		else if(browsername.equals("opera"))
		{
			System.setProperty("webdriver.opera.driver",
					"./DriverFile\\operadriver.exe");
			driver = new OperaDriver();
			log.info("Browser is opened");
		}
		else
		{
			System.setProperty("webdriver.chrome.driver",
					"./DriverFile\\chromedriver.exe");
			driver = new ChromeDriver();
			log.info("Browser is opened");		
		}
		
		PropertyConfigurator.configure("log4j.properties");		
	
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.saucedemo.com/");
		log.info("URL is Opened");
		ScreenshotClass.screenshotmethod(driver,"TC01_LoginPage1");
		
		//in loginpage
		LoginPOMClass m = new LoginPOMClass(driver);
		m.sendusername();
		m.sendpassword();
		m.clickloginbutton();
		log.info("Home page is opened");
		ScreenshotClass.screenshotmethod(driver,"TC01_HomePage");
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		
		log.info("end of the program");
		driver.quit();
		log.info("Browser is closed");
		
	}

}
