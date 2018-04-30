package com.sp.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sp.qa.pages.LoginPage;
import com.sp.qa.pages.SelectCompanyPage;
import com.sp.qa.pages.WBWCompanyPage;
import com.sp.qa.testbase.TestBase;

public class WBWCompnayPageTest extends TestBase {
	
	LoginPage loginpage;
	SelectCompanyPage selectcompage;
	WBWCompanyPage wbwcomppage;
	
	
	
	public WBWCompnayPageTest(){
		super();
		
	}
	
	@BeforeMethod
	public void setup() throws Exception{
		initialization();
		loginpage = new LoginPage();
		wbwcomppage = new WBWCompanyPage();
		selectcompage= loginpage.loginvalidation(prob.getProperty("username"), prob.getProperty("password"));
		selectcompage.WBWLogin();		
	}
	
	
	
	@Test
	public void validateWVOLogo(){
		boolean logo = wbwcomppage.WVOLogocheck();
		Assert.assertTrue(logo, "WVO Logo is not displayed in WBW HomePage");
	}
	
	@Test
	public void clickWorldMarkMenu() throws Exception{
		wbwcomppage.selectWorkMarkContractMenu();
		
	}
	
	@Test
	public void clickEditWorldMarkMenu() throws Exception{
		wbwcomppage.selectWorkMarkContractMenu();
		
	}
		
	
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
	
	
	
	

}
