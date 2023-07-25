package com.amdocs.mystore.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.amdocs.mystore.pageobjects.ShoppingCart;

public class ShoppingCartPageTest 
{
	@Test
	void cartPage() throws IOException, InterruptedException
	{
		AddedtoCartPageTest addedtoCartPage=new AddedtoCartPageTest();
		addedtoCartPage.addCart();
		ShoppingCart shoppingcart=new ShoppingCart();
		shoppingcart.proceed();
	}
}
