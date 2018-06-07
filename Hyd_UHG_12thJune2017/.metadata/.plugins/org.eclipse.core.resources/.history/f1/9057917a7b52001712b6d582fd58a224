package com.testBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Hashtable;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.asserts.SoftAssert;

import xls.ShineXlsReader;

public class TestBase {
	public static Properties prop;
	public static FileInputStream fip;
	public static String Browser;
	public static WebDriver driver;
	public static SoftAssert st;
	public static ShineXlsReader Mxls;
	public static Hashtable<String, String> ht;
	
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
	
	public static void ModuleDriver(){
		ht=new Hashtable<String, String>();
		Mxls=new ShineXlsReader(".\\src\\com\\excelFiles\\Moduledriver.xlsx");
		int Modulecount = Mxls.getRowCount("Mainsheet");
		for(int i=2;i<=Modulecount;i++){
			String Modulename = Mxls.getCellData("Mainsheet", 0, i);
			String exestatus = Mxls.getCellData("Mainsheet", 1, i);
			if(exestatus.equalsIgnoreCase("yes")){
				int Testcount = Mxls.getRowCount(Modulename);
				for(int j=2;j<=Testcount;j++){
				String Testid = Mxls.getCellData(Modulename, 0, j);
				String Runstatus = Mxls.getCellData(Modulename, 1, j);
				ht.put(Testid, Runstatus);
				}
			}
		}
	}
	public static void CloseBrowser(){
		driver.quit();
	}

}
