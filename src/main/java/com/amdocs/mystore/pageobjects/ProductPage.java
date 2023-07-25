package com.amdocs.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.mystore.base.BaseClass;
import com.amdocs.mystore.base.actiondriver.Action;

public class ProductPage  extends BaseClass
{
	//@FindBy(xpath="//select[@id='quantity']")
	//WebElement dropdown;
	
	@FindBy(xpath = "//*[@id=\"add-to-cart-button\"]")
	WebElement addcartbtn;

	public ProductPage() {
		PageFactory.initElements(driver, this);
	}
	public AddedtoCart addCart() throws InterruptedException
	{
		Thread.sleep(10000);
		//Action.dropDown(dropdown, "3");
		Thread.sleep(10000);
		Action.click(driver, addcartbtn);
		return new AddedtoCart();
	}

}
