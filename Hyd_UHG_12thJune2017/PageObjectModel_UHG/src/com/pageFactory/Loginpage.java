package com.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class Loginpage extends TestBase{
	
	@FindBy(xpath="//input[@name='username']") 
	public WebElement username;
	
	@FindBy(xpath="//input[@name='pwd']") 
	public WebElement password;
	
	@FindBy(xpath="//a[@id='loginButton']") 
	public WebElement loginnow;
	
	
	public Entertimetrack login(){
		username.sendKeys(prop.getProperty("username"));
		password.sendKeys(prop.getProperty("password"));
		loginnow.click();
		return PageFactory.initElements(driver, Entertimetrack.class);
	}

}
