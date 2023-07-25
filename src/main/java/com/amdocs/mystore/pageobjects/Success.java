package com.amdocs.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.mystore.base.BaseClass;
import com.amdocs.mystore.base.actiondriver.Action;

public class Success extends BaseClass
{
	
	@FindBy(xpath="/html/body/div[5]/div[2]/div[1]/div/div[2]/form/div/div/div[1]/span[1]/span/input")
	WebElement placeorder;

	public Success() {
		PageFactory.initElements(driver, this);

	}
	
	public EndPage placeorder()
	{
		Action.click(driver, placeorder);
		return new EndPage();
	}
	
	
	
}
