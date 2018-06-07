package com.testCasesForActiTime;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test3 {

	public WebDriver driver;
	public String Browser="mozilla";
	
	@Test
	public void testcase3(){
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
		//Login
		WebElement username = driver.findElement(By.xpath(".//*[@id='loginFormContainer']/tbody/tr[1]/td/table/tbody/tr[1]/td[2]/input"));
		username.sendKeys("admin");
		driver.findElement(By.xpath(".//*[@id='loginFormContainer']/tbody/tr[1]/td/table/tbody/tr[2]/td[2]/input")).sendKeys("manager");
		driver.findElement(By.xpath(".//*[@id='loginButton']")).click();
		//click on task
		driver.findElement(By.xpath(".//*[@id='topnav']/tbody/tr[1]/td[5]/a/img")).click();
		//click on pro and customer
		driver.findElement(By.xpath(".//*[@id='topnav']/tbody/tr[1]/td[5]/div/table/tbody/tr/td[6]/nobr/a")).click();
		//click on createnew customer
		driver.findElement(By.xpath(".//*[@id='customersProjectsForm']/table/tbody/tr/td/table/tbody/tr[1]/td/table/tbody/tr/td[2]/input[1]")).click();
		//create customer
		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[3]/td/table/tbody/tr[5]/td[2]/table/tbody/tr[1]/td[3]/input")).sendKeys("CustomerC");
		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[3]/td/table/tbody/tr[5]/td[2]/table/tbody/tr[2]/td[3]/textarea")).sendKeys("DescriptionC");
		driver.findElement(By.xpath(".//*[@id='add_more_customers_action']")).click();
		driver.findElement(By.xpath(".//*[@id='container']/form/table/tbody/tr[8]/td/input[1]")).click();
		//verifysuccess msg
		/*String text = driver.findElement(By.xpath(".//*[@id='SuccessMessages']/tbody/tr/td/span")).getText();
		System.out.println("text="+text);*/
		try{
		driver.findElement(By.xpath(".//*[@id='SuccessMessages']/tbody/tr/td/span")).isDisplayed();
		driver.findElement(By.xpath("//*[@id='logoutLink']")).click(); //Logout
		}catch(Throwable t){
			st.fail("Success msg does not dispalyed");
			driver.findElement(By.xpath("//*[@id='logoutLink']")).click(); //Logout
			driver.findElement(By.xpath(".//*[@id='DiscardChangesButton']")).click(); // click on cancelcreation
		}
			
		driver.quit(); //close the browser
		st.assertAll();
}
}
