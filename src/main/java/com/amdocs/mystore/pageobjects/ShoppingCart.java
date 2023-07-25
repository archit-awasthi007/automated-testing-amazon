package com.amdocs.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.mystore.base.BaseClass;
import com.amdocs.mystore.base.actiondriver.Action;

public class ShoppingCart extends BaseClass
{
	@FindBy(xpath="//*[@id=\"attach-sidesheet-checkout-button\"]/span/input")
	WebElement proceedtopay;

	public ShoppingCart() {
		PageFactory.initElements(driver, this);
	}
	
	public CheckOutPage proceed() throws InterruptedException
	{
		Thread.sleep(5000);
		Action.click(driver, proceedtopay);
		return new CheckOutPage();
	}
	 
	

}
