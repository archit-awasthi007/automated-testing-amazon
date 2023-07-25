package com.amdocs.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.mystore.base.BaseClass;
import com.amdocs.mystore.base.actiondriver.Action;

public class LoginPage extends BaseClass
{
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[1]/input[1]")
	WebElement userInput;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[2]/span/span/input")
	WebElement clickToContinue;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div/form/div/div[1]/input")
	WebElement password;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div/form/div/div[2]/span/span/input")
	WebElement signInButton;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div/form/div/div[1]/input")
	WebElement password1;
	
	@FindBy(xpath="/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div/div/form/div/div[4]/span/span/input")
	WebElement SIGNINBTN;
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	public HomePage loginToHome() throws InterruptedException
	{
		Action.type(userInput, getUsernName("username"));
		Action.waitForExecution(driver, clickToContinue);
		Action.click(driver, clickToContinue);
		Action.type(password, getPassWord("password"));
		Action.waitForExecution(driver,  signInButton);
		Action.click(driver, signInButton);
//		Action.type(password1, getPassWord("password"));
//		Thread.sleep(9000);
//		Action.click(driver, SIGNINBTN);
		return new HomePage();
	}
}
