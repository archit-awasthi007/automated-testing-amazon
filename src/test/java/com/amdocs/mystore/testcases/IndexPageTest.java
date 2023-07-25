package com.amdocs.mystore.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.amdocs.mystore.base.BaseClass;
import com.amdocs.mystore.pageobjects.IndexPage;


public class IndexPageTest extends BaseClass
{

    		@Test
    		public void index() throws IOException  
    		{
    			// TODO Auto-generated method stub
    			//IndexPageTest b = new IndexPageTest();
    			
    				BaseClass.launchApp();
    			IndexPage index = new IndexPage();
    			index.clickToSignIn();
    		}
}


