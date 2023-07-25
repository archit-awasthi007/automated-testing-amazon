package com.amdocs.mystore.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.amdocs.mystore.base.BaseClass;
import com.amdocs.mystore.pageobjects.HomePage;

public class HomePageTest extends BaseClass{

	@Test
	void logoutTest() throws IOException, InterruptedException {
		LoginPageTest loginPageTest = new LoginPageTest();
		loginPageTest.login();
		HomePage homePage = new HomePage();
		homePage.logout();	
	}
	@Test
	void searchProduct() throws IOException, InterruptedException
	{
		LoginPageTest loginPageTest = new LoginPageTest();
		loginPageTest.login();
		HomePage homePage = new HomePage();
		homePage.clickToSearch();
	}
}