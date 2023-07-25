package com.amdocs.mystore.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.amdocs.mystore.base.BaseClass;
import com.amdocs.mystore.base.actiondriver.Action;

public class SearchPage extends BaseClass
{
	
	
	@FindBy(xpath = "//*[@id=\"twotabsearchtextbox\"]")
	WebElement searchProduct;
	
	@FindBy(xpath = "//*[@id=\"nav-search-submit-button\"]")
	WebElement search;
	
	
	public SearchPage()
	{
		PageFactory.initElements(driver, this);
		
	}
	public SearchResultPage searchProduct()
	{
		 //Action.wait(driver, 15);
		Action.type(searchProduct, getitemname("itemname"));
		Action.click(driver, search);
		return new SearchResultPage();
	}
	
	
	
	
	
	
	
	
//	@FindBy(xpath="//input[@class=\"gh-tb ui-autocomplete-input\"]")
//	WebElement searchbar;
//	
////	@FindBy(xpath="//select[@id=\"gh-cat\"]")
////	WebElement searchCategory;
//	
////	@FindBy(xpath="/html/body/header/table/tbody/tr/td[3]/form/table/tbody/tr/td[2]/div/select/option[4]")
////	WebElement selectCategory;
////	
//	@FindBy(xpath="//input[@class='btn btn-prim gh-spr']")
//	WebElement searchbtn;
//
//	public SearchPage() 
//	{
//		PageFactory.initElements(driver, this);
//	}
//	
//	public WishListPage search()
//	{
//		Action.wait(driver, 15);
//		Action.type(searchbar, getitemname("itemname"));
////		Action.click(driver, searchCategory);
////		Action.click(driver, selectCategory);
//	
//		Action.click(driver, searchbtn);
//		
//		return new WishListPage();
//	}
}
