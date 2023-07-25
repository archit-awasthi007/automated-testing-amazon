package com.amdocs.mystore.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.amdocs.mystore.base.BaseClass;
import com.amdocs.mystore.pageobjects.SearchPage;

public class SearchPageTest extends BaseClass
{
	@Test
	void searchTest() throws IOException, InterruptedException{
		
		HomePageTest h = new HomePageTest();
		h.searchProduct();
		SearchPage s = new SearchPage();
		s.searchProduct();
	}
}
