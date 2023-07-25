package com.amdocs.mystore.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.amdocs.mystore.base.BaseClass;
import com.amdocs.mystore.base.actiondriver.Action;
import com.amdocs.mystore.pageobjects.SearchResultPage;

public class SearchResultPageTest extends BaseClass
{
	@Test
	public void findProduct() throws IOException, InterruptedException
	{
		SearchPageTest searchPageTest = new SearchPageTest();
		searchPageTest.searchTest();
		SearchResultPage searchResultPage=new SearchResultPage();
		searchResultPage.resultPage();
		//Action driver1=new Action();
		Action.launchNewWindow(driver);
		
	}

}
