package com.SauceDemo.POMClass;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePagePOMClass 
{
	//Variable Declare
	WebDriver driver;
	Select s;
	public Actions act;
	
	//constructor
	public HomePagePOMClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
		s = new Select(sortby);	
		act = new Actions(driver);
	
	}
	
	
	//find WebElement
	//menu button
	@FindBy(id="react-burger-menu-btn")
	private WebElement menubutton;
	public void clickmenubutton()
	{
		menubutton.click();
	}
	
	//all items button
	@FindBy(id="inventory_sidebar_link")
	private WebElement allitems;
	public void clickallitems()
	{
		allitems.click();
	}
	
	//about button
	@FindBy(id="about_sidebar_link")
	private WebElement about;
	public void clickabout()
	{
		about.click();
	}
	
	// logout button 
	@FindBy(id="logout_sidebar_link")
	private WebElement logout;
	public void clicklogout()
	{
		logout.click();
	}
	
	//reset button 
	@FindBy(id="reset_sidebar_link")
	private WebElement reset;
	public void clickreset()
	{
		reset.click();
	}
	
	//single bag add to cart
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	private WebElement bagelment;
	public void clickaddtocartbutton()
	{
		bagelment.click();
	}
	
	// 1st method of all product add to cart ------for condition
	@FindBy(xpath="//button[text()='Add to cart']")
	private List<WebElement> allproductadd;
	public void clickaddalltocartbutton()
	{
		for(int i=0; i<allproductadd.size(); i++)
		{
			allproductadd.get(i).click();
		}
	}
	
	//2nd page of add to cart ------for each condition
	@FindBy(xpath="(//button[text()='Add to cart'])")
	
	private List<WebElement> allproductadd1;
	
	public void clickaddalltocartbutton1()
	{
		for(WebElement add :allproductadd1)
		{
			add.click();
		}
	}
	

	//click on sort drop down
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement sortby;
	public void clicksortby() 
	{
		sortby.click();
//		s = new Select(sortby);
		s.selectByVisibleText("Price (high to low)");
				
	}
	
	//validation for drop down
	@FindBy(xpath="//div[text()='Sauce Labs Fleece Jacket']")
	private WebElement jacket;
	public String gettexthigherprice()
	{
		String highpriceproduct =jacket.getText();
		return highpriceproduct;
//		return "mahesh";
	}
	
	
	
	//validation for add to cart
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement addtocart;
	public String gettextaddtocart()
	{
		String totalproduct = addtocart.getText();
		return totalproduct;
	}
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	WebElement addtocart1;
	public void clickcartButton()
	{
		 addtocart1.click();
		 		
	}
	
	

	
	
	
	
}
