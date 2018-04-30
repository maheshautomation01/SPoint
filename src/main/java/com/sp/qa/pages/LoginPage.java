package com.sp.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sp.qa.testbase.TestBase;

public class LoginPage extends TestBase{
	
	
//	@FindBy (name="j_username")
//	WebElement UserNametxt;
	
	@FindBy (css="input[name=j_username]")
	WebElement UserNametxt;
	
//	@FindBy (name="j_password")
//	WebElement Passwordtxt;
	
	@FindBy (css="input[name=j_password]")
	WebElement Passwordtxt;
	
	@FindBy (xpath="//input[@class='button']")
	WebElement Logonbtn;
	
	@FindBy (xpath="//*[contains, 'SalePoint Log On']")
	WebElement PageHeader;
	
	@FindBy (xpath="//img[contains(@class,'header_logo')]")
	WebElement WVOLogo;
	
	
	//Constructor to initialize the driver object
	public LoginPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public String Pageheaderdisplayed(){
		return PageHeader.getText();
	}
	
	public String validateLoginPageTitle(){
		return driver.getTitle();
	}
	
	public boolean validateLogo(){
		return WVOLogo.isDisplayed();
	}
		
		
	public SelectCompanyPage loginvalidation(String un, String pwd) throws Exception{
		UserNametxt.sendKeys(un);
		Thread.sleep(2000);
		Passwordtxt.sendKeys(pwd);
		Thread.sleep(2000);
		Logonbtn.submit();
		Thread.sleep(2000);
		return new SelectCompanyPage();
				
	}
	
		
}
	


