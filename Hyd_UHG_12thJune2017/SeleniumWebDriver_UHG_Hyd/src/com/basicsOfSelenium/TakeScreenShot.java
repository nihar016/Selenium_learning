package com.basicsOfSelenium;


import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TakeScreenShot {

	public WebDriver driver;
	public String Browser="ie";
	
	@Test
	public void testcase1() throws Throwable{
		SoftAssert st=new SoftAssert();
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
		
        File srcFile=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile,new File("E:\\loginpage2.bmp"));
}
}