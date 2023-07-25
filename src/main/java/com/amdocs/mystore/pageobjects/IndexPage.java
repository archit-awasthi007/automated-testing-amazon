package com.amdocs.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.mystore.base.BaseClass;
import com.amdocs.mystore.base.actiondriver.Action;

public class IndexPage extends BaseClass
{
	
	@FindBy(xpath="/html/body/div[1]/header/div/div[3]/div[2]/div[2]/div/div[1]/div/a/span")
	WebElement signInBtn;
	
	@FindBy(xpath = "/html/body/div[1]/header/div/div[1]/div[3]/div/a[2]/div/span")
	WebElement hoverToSignIn;
	
	@FindBy(xpath = "/html/body/div[1]/header/div/div[3]/div[2]/div[2]/div/div[1]/div/a/span")
	WebElement registerPath;
	
	
	
	public IndexPage()
	{
		PageFactory.initElements(driver,this);
	}
	public LoginPage clickToSignIn()
	{
		Action.hover(driver, hoverToSignIn);
		Action.click(driver, signInBtn);
		return new LoginPage();
	}
	public RegisterPage clickToRegister()
	{
		
		Action.hover(driver, hoverToSignIn);
		Action.click(driver, registerPath);
		return 	new RegisterPage();
	}
	
	
	
	
	

//	@FindBy(xpath="//a[@_sp=\"m570.l1524\"]")
//
//    WebElement signInBtn;
//
//    
//
//    @FindBy(xpath = "//a[@_sp=\"m570.l2621\"]")
//
//    WebElement registerPath;
//	
//	public  IndexPage()
//	{
//		PageFactory.initElements(driver, this);
//	}
//	public LoginPage clickOnSignIn()
//	{
//		Action.click(driver, signInBtn);
//		return new LoginPage();
//	}
//	public RegisterPage clickOnReg() throws InterruptedException
//	{
//		Thread.sleep(9000);
//		Action.click(driver, registerPath);
//		return new RegisterPage();
//	}
}
