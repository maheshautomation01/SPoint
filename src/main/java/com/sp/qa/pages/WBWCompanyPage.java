package com.sp.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sp.qa.testbase.TestBase;
import com.sp.qa.util.TestUtil;

public class WBWCompanyPage extends TestBase  {
	
	@FindBy (xpath="//*[@class='middle']")
	WebElement wbwcontracttab;
	
	@FindBy (xpath="//img[@id='fairfieldImgId']")
	WebElement wvologoWBW;
	
	
	public WBWCompanyPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	
	public boolean WVOLogocheck(){
		return wvologoWBW.isDisplayed();
	}
	
	
	public WorldMarkTourInfoPage selectWorkMarkContractMenu() throws Exception{
		wbwcontracttab.click();
		TestUtil.selectWMContractmenu();
		return new WorldMarkTourInfoPage();
		
	}
	
	public ContratProcessLocateContractPage selectWMEditContractMenu() throws Exception{
		wbwcontracttab.click();
		TestUtil.selectWMEditContractmenu();
		return new ContratProcessLocateContractPage();
	}
	
	
	

}
