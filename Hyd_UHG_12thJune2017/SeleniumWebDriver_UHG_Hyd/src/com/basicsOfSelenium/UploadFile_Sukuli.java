package com.basicsOfSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

public class UploadFile_Sukuli {
	public WebDriver driver;
	public String Browser="mozilla";
	
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
		driver.get("https://www.shine.com/registration/parser/"); //Open url
		driver.manage().window().maximize(); // maximize the window
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//click on browse
		driver.findElement(By.xpath(".//*[@id='id_file']")).click();
		
		Pattern f=new Pattern("C:\\Users\\tmc\\Desktop\\UHG_Sikuli_Snaps\\P1.PNG");
		Pattern o=new Pattern("C:\\Users\\tmc\\Desktop\\UHG_Sikuli_Snaps\\P2.PNG");
		
		Screen s=new Screen();
		s.type(f, "C:\\Users\\tmc\\Desktop\\Appiumcontents.txt");
		s.click(o);
		
		
		
		
		
		
		
		
		
		
		
}
}
