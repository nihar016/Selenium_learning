package com.testBase;

import java.io.FileInputStream;

import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.asserts.SoftAssert;



public class TestBase {
	public static Properties prop;
	public static FileInputStream fip;
	public static String Browser;
	public static WebDriver driver;
	public static SoftAssert st;

	
	public static void OpenBrowser() throws Throwable{
		st=new SoftAssert();
		fip=new FileInputStream(".\\src\\com\\config\\Or.Properties");
		prop=new Properties();
		prop.load(fip);
		Browser=prop.getProperty("browsertype");
		if(Browser.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
			driver=new ChromeDriver(); // Open Browser
		}else if(Browser.equalsIgnoreCase("ie")){
			System.setProperty("webdriver.ie.driver", "IEDriverServer.exe");
			 driver=new InternetExplorerDriver();
		}else if(Browser.equalsIgnoreCase("mozilla")){
			System.setProperty("webdriver.firefox.marionette", "geckodriver.exe");
			driver=new FirefoxDriver(); // Open Browser
		}
		driver.get("http://localhost:9000/login.do"); //Open url
		driver.manage().window().maximize(); // maximize the window
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
	}
	

	public static void CloseBrowser(){
		driver.quit();
	}

}
