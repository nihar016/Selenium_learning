package com.basicsOfSelenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class MouseoverExample {
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
		driver.get("http://www.drikpanchang.com/"); //Open url
		driver.manage().window().maximize(); // maximize the window
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Mouseover
	/*	WebElement pan = driver.findElement(By.xpath(".//*[@id='dpPgIntrctv']/div[1]/div[2]/div[1]/div[2]/div/table/tbody/tr/td/ul/li[2]/a"));
		Actions action=new Actions(driver);
		action.moveToElement(pan).build().perform();*/
		
		//Rightclick
		WebElement ritual = driver.findElement(By.xpath(".//*[@id='dpPgIntrctv']/div[1]/div[2]/div[3]/div[8]/div[22]/div[1]/img"));
		Actions action=new Actions(driver);
		//action.moveToElement(ritual).build().perform();
		action.contextClick(ritual).build().perform();
		/*action.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		Thread.sleep(2000);*/
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		
	//	action.dragAndDrop(source, target)
		
}
}