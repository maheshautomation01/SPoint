package com.sp.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sp.qa.testbase.TestBase;

public class ContratProcessLocateContractPage extends TestBase{
	
	@FindBy (xpath="//*[text() ='Enter Customer Account Number From CRS']")
	WebElement pagetitle;
	
	@FindBy (xpath="//input[@id='customerNumber' and @class='textBox' and @name='customerNumber']")
	WebElement crsaccountno;

	@FindBy (xpath="//input[@name='next']")
	WebElement nextbtn;
	
	
	public ContratProcessLocateContractPage(){
		PageFactory.initElements(driver, this);
		
	}
	
	
	public boolean checkpagetitle(){
		return pagetitle.isDisplayed();
	}
	
	
	public WVRcontProsCustInfoPage entercrsno(String crsno){
		crsaccountno.sendKeys(crsno);
		nextbtn.click();
		return new WVRcontProsCustInfoPage();
	}
	
	
	
	
	
	
	
	
	

}
