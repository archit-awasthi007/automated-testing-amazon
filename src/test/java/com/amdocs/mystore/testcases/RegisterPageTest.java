package com.amdocs.mystore.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.amdocs.mystore.base.BaseClass;
import com.amdocs.mystore.pageobjects.RegisterPage;

public class RegisterPageTest extends BaseClass {
	@Test
	void registerTest() throws InterruptedException, IOException
	{
		IndexPageTest indexPageTest = new IndexPageTest();
		indexPageTest.index();
		RegisterPage registerPage = new RegisterPage();
		registerPage.register();
	}
}
