package com.amdocs.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.mystore.base.BaseClass;
import com.amdocs.mystore.base.actiondriver.Action;

public class HomePage extends BaseClass{
	@FindBy(xpath = "/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/div/span")
	WebElement hoverToSignOut;
	
	
	@FindBy(xpath = "/html/body/div[1]/header/div/div[3]/div[2]/div[2]/div/div[3]/a[13]/span")
	WebElement logOut;
	
	@FindBy(xpath = "/html/body/div[1]/header/div/div[1]/div[2]/div/form/div[2]/div[1]/input")
	WebElement searchItems;
	
	
	public HomePage()
	{
		PageFactory.initElements(driver, this);
	}
	public LogOutPage logout()
	{
		Action.hover(driver, hoverToSignOut);
		Action.waitForExecution(driver,logOut);
		Action.click(driver, logOut);
		return new LogOutPage();
		
	}
	public SearchPage clickToSearch()
	{
		Action.click(driver, searchItems);
		return new SearchPage();
	}
	
	
}
