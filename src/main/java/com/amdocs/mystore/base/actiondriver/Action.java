package com.amdocs.mystore.base.actiondriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.amdocs.mystore.base.BaseClass;

public class Action extends BaseClass
{
	public static void scrollByVisibilityOfElement(WebDriver driver, WebElement ele)
	{
		JavascriptExecutor js =(JavascriptExecutor) driver;
		js.executeScript("argument[0].scrollIntoView();", ele);
	}
	
	public static void dropDown(WebElement element, String optionText)
    {
        Select select = new Select(element);
        select.selectByVisibleText(optionText);
        element.sendKeys(Keys.ENTER);
		
	}
	public static void launchNewWindow(WebDriver driver) {

        String currentWindowHandle = driver.getWindowHandle();

        Set<String> windowHandles = driver.getWindowHandles();

        for (String windowHandle : windowHandles) {

            if (!windowHandle.equals(currentWindowHandle)) {

                driver.switchTo().window(windowHandle);

                break;

            }

        }

    }
	
	public static void click(WebDriver ldriver, WebElement locatorName)
	{
		
		Actions act=new Actions(ldriver);
		act.moveToElement(locatorName).click().build().perform();
	}
	public static void hover(WebDriver ldriver, WebElement locatorName)
	{
		
		Actions act=new Actions(ldriver);
		act.moveToElement(locatorName).perform();
	}
	
	public static boolean findElement(WebDriver ldriver,WebElement ele)
	{
		boolean flag=false;
		try {
			ele.isDisplayed();
			flag=true;
		}
		catch(Exception e)
		{
			flag =false;
		}
		finally
		{
			if(flag)
			{
				System.out.println("successfully found element at");
			}
			else
			{
				System.out.println("unable to locate element at");
			}
		}
		return flag;
	}
	public static void wait(WebDriver driver, int sec) {
		driver.manage().timeouts().implicitlyWait(sec, TimeUnit.SECONDS);
	}
	public static boolean  isDisplayed(WebDriver ldriver,WebElement ele)
	{
		boolean flag =false;
		flag=findElement(ldriver,ele);
		if(flag)
		{
			flag=ele.isDisplayed();
			if(flag)
			{
				System.out.println("the element is displayed");
			}
			else
			{
				System.out.println("the element is not displayed");
			}
		}
		else
		{
			System.out.println("not displayed");
		}
		return flag;
	}
	public static boolean isSelected(WebDriver ldriver,WebElement ele)
	{
		boolean flag =false;
		flag=findElement(ldriver,ele);
		if(flag)
		{
			flag=ele.isSelected();
			if(flag)
			{
				System.out.println("the element is Selected");
			}
			else
			{
				System.out.println("the element is not Selected");
			}
		}
		else
		{
			System.out.println("not Selected");
		}
		return flag;
	}
	
	public static boolean isEnabled(WebDriver ldriver,WebElement ele)
	{
		boolean flag =false;
		flag=findElement(ldriver,ele);
		if(flag)
		{
			flag=ele.isEnabled();
			if(flag)
			{
				System.out.println("the element is Enabled");
			}
			else
			{
				System.out.println("the element is not Enabled");
			}
		}
		else
		{
			System.out.println("not Enabled");
		}
		return flag;
	}
	
	
	
	public static boolean type(WebElement ele, String text)
	{
		boolean flag =false;
		try
		{
			flag=ele.isDisplayed();
			ele.clear();
			ele.sendKeys(text);
			flag=true;
		}
		catch(Exception e)
		{
			System.out.println("location not found");
			flag=false;
		}
		finally
		{
			if(flag)
			{
				System.out.println("successfully enetered value");
			}
			else
			{
				System.out.println("unable to enter value");
			}
		}
		return flag;
	}
	
	public static boolean SendKeys(WebElement ele, String value)
	{
		boolean flag =false;
		try
		{
			ele.sendKeys(value);
			flag=true;
			return true;
		}
		catch(Exception e)
		{
			return false;
		}
		finally
		{
			if(flag)
			{
				System.out.println("select value from the dropdown");
			}
			else
			{
				System.out.println("not selected value from the dropdown");
			}
		}
	}
	
//	public static boolean selectByIndex(WebElement element,int index)
//	{
//		boolean flag=false;
//		try {
//			Select s=new Select(element);
//			s.selectByIndex(index);
//			flag=true;
//			return true;
//		}
//		catch(Exception e)
//		{
//			return false;
//		}
//		finally
//		{
//			if(flag)
//			{
//				System.out.println("option selected by index");
//			}
//			else
//			{
//				System.out.println("option selected by index");
//			}
//		}
//	}
//	public static boolean selectByValue(WebElement element,String value)
//	{
//		boolean flag=false;
//		try {
//			Select s=new Select(element);
//			s.selectByValue(value);
//			flag=true;
//			return true;
//		}
//		catch(Exception e)
//		{
//			return false;
//		}
//		finally
//		{
//			if(flag)
//			{
//				System.out.println("option selected by value");
//			}
//			else
//			{
//				System.out.println("option selected by value");
//			}
//		}
//	}
	
	
	
	
	
	
	
}
