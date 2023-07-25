package com.amdocs.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.mystore.base.BaseClass;
import com.amdocs.mystore.base.actiondriver.Action;

public class RegisterPage extends BaseClass
{

	@FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[1]/input")
	WebElement name;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[2]/div[2]/span/input")
	WebElement email;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[3]/div[1]/input")
	WebElement password;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[3]/div[2]/input")
	WebElement re_password;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/div[2]/div/form/div/div/div[6]/span/span/input")
	WebElement register;
	
	public RegisterPage()
	{
		PageFactory.initElements(driver, this);
	}
	public HomePage register() throws InterruptedException
	{
		Action.type(name, getname("name"));
		Action.type(email,getUsernName("username"));
		Action.type(password, getPassWord("password"));
		Action.type(re_password, getPassWord("password"));
		Action.waitForExecution(driver, register);
		Action.click(driver, register);
		
		return new HomePage();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@FindBy(xpath= "//a[@_sp=\"m570.l2621\"]")
//	WebElement register;

//	@FindBy(xpath="//input[@id=\"personalaccount-radio\"]")
//	WebElement regbtn;
//	
//	@FindBy(xpath="/html/body/div[2]/div[3]/div[3]/div/div/div/div/form/div[1]/span/span[1]/span/input")
//	WebElement fname;
//	
//	@FindBy(xpath="//input[@id=\"lastname\"]")
//	WebElement lname;
//	
//	@FindBy(xpath="//input[@id=\"Email\"]")
//	WebElement email;
//	
//	@FindBy(xpath="//input[@id=\"password\"]")
//	WebElement password;
//	
//	@FindBy(xpath="//button[@id=\"EMAIL_REG_FORM_SUBMIT\"]")
//	WebElement submit;
//	public RegisterPage()
//	{
//		PageFactory.initElements(driver, this);
//	}
//	
//	public SearchPage register() throws InterruptedException
//	{
//		//Action.click(driver, register);
//		Action.click(driver, regbtn);
//		Action.type(fname, getfname("fname"));
//		
//		Action.type(lname, getlname("lname"));
//		Action.type(email, getUsernName("username"));
//		Action.type(password, getPassWord("password"));
//		Thread.sleep(8000);
//		Action.click(driver, submit);
//		return new SearchPage();
//	}
//	

}
