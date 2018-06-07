package com.basicsOfSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class WorkWithFrame {
	public WebDriver driver;
	public String Browser="chrome";
	
	@Test
	public void workwithAlert() throws Throwable{
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
		driver.get("https://www.goibibo.com/"); //Open url
		driver.manage().window().maximize(); // maximize the window
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		//click on signin
		driver.findElement(By.xpath(".//*[@id='get_sign_in']")).click();
		//swith to frame
		driver.switchTo().frame("authiframe");
		//enter mobile number
		driver.findElement(By.xpath("//*[@id='authMobile']")).sendKeys("9923232323");
		//switch to main page
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath(".//*[@id='authOverlay']/div/a")).click();
		
}
}