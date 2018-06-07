package com.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class Opentask extends TestBase{
	
	@FindBy(xpath=".//*[@id='topnav']/tbody/tr[1]/td[5]/div/table/tbody/tr/td[6]/nobr/a")
	public WebElement proandcust;
	
	public Activeprojectandcustomer clickonproandcust(){
		proandcust.click();
		return PageFactory.initElements(driver, Activeprojectandcustomer.class);
	}

}
