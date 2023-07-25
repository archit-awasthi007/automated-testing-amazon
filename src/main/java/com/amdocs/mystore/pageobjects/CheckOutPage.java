package com.amdocs.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.mystore.base.BaseClass;
import com.amdocs.mystore.base.actiondriver.Action;

public class CheckOutPage extends BaseClass
{
	public CheckOutPage() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//*[@id=\"orderSummaryPrimaryActionBtn\"]/span/input")
	WebElement address;
	
	@FindBy(xpath="/html/body/div[5]/div[1]/div/div[2]/div/div/div[1]/div[1]/div/div[5]/div/div[3]/div/div/div[2]/div/div[2]/div/div/form/div/div[1]/div/div/div[6]/div/div/div/div/div[1]/div/label/input")
	WebElement payment;
	@FindBy(xpath="/html/body/div[5]/div[1]/div/div[2]/div/div/div[1]/div[1]/div/div[5]/div/div[3]/div/div/div[2]/div/div[2]/div/div/form/div/div[2]/div/span/span/input")
	WebElement paymentclick;
	
	@FindBy(xpath="/html/body/div[5]/div[1]/div/div[2]/div/div/div[2]/div/div[1]/div/div[1]/div[1]/div/span/span/input")
	WebElement placeOrder;
	public Success placeOrder() throws InterruptedException
	{
		Thread.sleep(5000);
		Action.click(driver, address);
		Thread.sleep(10000);
		Action.click(driver, payment);
		Thread.sleep(2000);
		Action.click(driver, paymentclick);
		Thread.sleep(10000);
		Action.click(driver, placeOrder);
		return new Success();
	}
	
}
