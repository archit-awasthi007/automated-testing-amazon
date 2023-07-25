package com.amdocs.mystore.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.amdocs.mystore.pageobjects.AddedtoCart;

public class AddedtoCartPageTest 
{
	@Test
	void addCart() throws IOException, InterruptedException
	{
		ProductPageTest productPageTest=new ProductPageTest();
		productPageTest.clickAddCart();
		AddedtoCart addedtoCart =new AddedtoCart();
		addedtoCart.clicktoCart();
		
	}
	

}
