package com.amdocs.mystore.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.amdocs.mystore.pageobjects.Success;

public class SuccessPageTest {
	
	@Test
	void placeOrder() throws IOException, InterruptedException
	{
		CheckOutPageTest check=new CheckOutPageTest();
		check.placeOrder();
		Success success=new Success();
		success.placeorder();
	}
}
