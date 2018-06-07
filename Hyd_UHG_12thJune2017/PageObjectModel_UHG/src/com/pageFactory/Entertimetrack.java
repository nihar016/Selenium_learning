package com.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class Entertimetrack extends TestBase{
	
	@FindBy(xpath=".//*[@id='topnav']/tbody/tr[1]/td[5]/a/img")
	public WebElement task;
	
	public Opentask clickontask(){
		task.click();
		return PageFactory.initElements(driver, Opentask.class);
	}

}