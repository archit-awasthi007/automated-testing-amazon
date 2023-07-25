package com.amdocs.mystore.testcases;
import java.io.IOException;

import org.testng.annotations.Test;

import com.amdocs.mystore.base.BaseClass;
import com.amdocs.mystore.pageobjects.LoginPage;
public class LoginPageTest extends BaseClass{
		
		@Test
		public void login() throws IOException, InterruptedException
		{
			IndexPageTest it = new IndexPageTest();
			it.index();
			LoginPage loginPage = new LoginPage();
			loginPage.loginToHome();
		}
}
