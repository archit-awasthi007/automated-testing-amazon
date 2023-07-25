package com.amdocs.mystore.base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass 
{ 
	public static WebDriver driver;
	public static Properties prop; 

	@BeforeTest
	public static void loadConfig()
	{
		try {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe ");
			FileInputStream path=new FileInputStream("D:\\MyFirstEcommerceProjectAutomation\\Configuration\\Config.properties");
			prop=new Properties();
			prop.load(path);
			}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	public static String getProperty(String url)
	{
		return prop.getProperty(url);
	}
	
	public static String getname(String name)
	{
		return prop.getProperty(name);
	}

	public static void waitForExecution(WebDriver driver, WebElement element) 
    {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOf(element));
    }
	public static String getitemname(String itemname)
	{
		return prop.getProperty(itemname);
	}

	public static void launchApp() 
    {
        BaseClass.loadConfig();
        String browserName = prop.getProperty("browser");
        if (browserName.contains("chrome")) {
            WebDriverManager.chromedriver().setup();
            driver=new ChromeDriver();
        } else if (browserName.contains("FireFox")) {
            WebDriverManager.firefoxdriver().setup();
            driver=new FirefoxDriver();
        } else if (browserName.contains("IE")) {
            WebDriverManager.iedriver().setup();
            driver=new InternetExplorerDriver();
        }else
        {
             throw new IllegalStateException("Invalid browser name specified in config.properties");
        }
        //Maximize the screen
        driver.manage().window().maximize();
        //Delete all the cookies
        driver.manage().deleteAllCookies();
        //Implicit TimeOuts
        driver.manage().timeouts().implicitlyWait
        (Integer.parseInt(prop.getProperty("implicitWait")),TimeUnit.SECONDS);
        //PageLoad TimeOuts
        driver.manage().timeouts().pageLoadTimeout
        (Integer.parseInt(prop.getProperty("pageLoadTimeOut")),TimeUnit.SECONDS);
        //Launching the URL
        driver.get(prop.getProperty("url"));
    }
	public static String getUsernName(String username)
	{
		return  prop.getProperty(username);
	}
	public static String getPassWord(String password)
	{
		return  prop.getProperty(password);
	}
	
	

}
