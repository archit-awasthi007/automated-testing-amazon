package com.amdocs.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.mystore.base.BaseClass;
import com.amdocs.mystore.base.actiondriver.Action;

public class AddedtoCart extends BaseClass
{
	@FindBy(xpath="//*[@id=\"add-to-cart-button\"]")
	WebElement gotokart;

	public AddedtoCart() {
		PageFactory.initElements(driver, this);
	}
	public ShoppingCart clicktoCart() throws InterruptedException
	{
		Thread.sleep(5000);
		Action.click(driver, gotokart);
		return new ShoppingCart();
	}
	
}
