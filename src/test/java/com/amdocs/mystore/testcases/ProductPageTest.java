package com.amdocs.mystore.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.amdocs.mystore.pageobjects.ProductPage;



public class ProductPageTest
{
	@Test
	void clickAddCart() throws IOException, InterruptedException
	{
		SearchResultPageTest searchResultPage=new SearchResultPageTest();
		searchResultPage.findProduct();
		ProductPage productPage=new ProductPage();
		productPage.addCart();
	}
	
	

}
