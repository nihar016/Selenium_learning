package com.pageFactory;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Activeprojectandcustomer {
	@FindBy(xpath=".//*[@id='customersProjectsForm']/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[2]/input[1]")
	public WebElement createnewcustomer;
	
	@FindBy(xpath=".//*[@id='customersProjectsForm']/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[2]/input[2]")
	public WebElement createnewproject;
	
	public void clickoncreatenewcustomer(){
		createnewcustomer.click();
	}
	
	public void clickoncreatenewproject(){
		createnewproject.click();
	}
}
