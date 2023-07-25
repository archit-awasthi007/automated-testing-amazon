package com.amdocs.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.mystore.base.BaseClass;
import com.amdocs.mystore.base.actiondriver.Action;

public class SearchResultPage extends BaseClass
{
	@FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")
	WebElement selectitem;
	
//	@FindBy(xpath = "/html/body/div[2]/div[2]/div[5]/div[1]/div[1]/div[2]/div[2]/div/div/div[2]/div[3]/div/div[1]/div/div/div/form/div/div/div/div/div[3]/div/div[33]/div[1]/span/span/span/input")
//	WebElement addcartbtn;
	
	public SearchResultPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public ProductPage resultPage() throws InterruptedException
	{
		Thread.sleep(5000);

        Action.click(driver, selectitem);

        return new ProductPage();
	}
}
