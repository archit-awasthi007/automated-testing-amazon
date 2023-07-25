package com.amdocs.mystore.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.amdocs.mystore.pageobjects.CheckOutPage;

public class CheckOutPageTest {
	@Test
	void placeOrder() throws IOException, InterruptedException
	{
		ShoppingCartPageTest shoppingCartPage=new ShoppingCartPageTest();
		shoppingCartPage.cartPage();
		CheckOutPage checkOutPage=new CheckOutPage();
		checkOutPage.placeOrder();
	}

}
