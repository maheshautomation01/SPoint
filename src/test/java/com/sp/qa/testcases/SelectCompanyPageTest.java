package com.sp.qa.testcases;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;





















import com.sp.qa.pages.LoginPage;
import com.sp.qa.pages.SelectCompanyPage;
import com.sp.qa.pages.WBWCompanyPage;
import com.sp.qa.pages.WVRAPCompanyPage;
import com.sp.qa.pages.WVRCompanyPage;
import com.sp.qa.testbase.TestBase;

public class SelectCompanyPageTest extends TestBase {
	
	LoginPage loginPage;
	SelectCompanyPage selectcomppage;
	WVRCompanyPage wvrcomppage;
	WBWCompanyPage wbwcomppage;
	WVRAPCompanyPage wvrapcomppage;
	
	
	public SelectCompanyPageTest(){
		super();
	}
	
	
	//@BeforeMethod
	@BeforeClass
	public void setup() throws Exception{
		initialization();
		loginPage 		= new LoginPage();
		selectcomppage = new SelectCompanyPage();
		wvrcomppage = new WVRCompanyPage();
		wbwcomppage = new WBWCompanyPage();
		wvrapcomppage = new WVRAPCompanyPage();
		selectcomppage= loginPage.loginvalidation(prob.getProperty("username"), prob.getProperty("password"));
	}
	
	
//	@Test
//	public void ValidateLoginWVREntity() throws Exception{
//		System.out.println(selectcomppage.countTheNoOfCompany());
//
//	}
	
	@Test
	public void ValidateMultipleCompanyNameTest() throws Exception{
		String WVRCompName =selectcomppage.WVRDropdownDeatils();
		System.out.println(WVRCompName+ " Company is Present");
		
		String WBWCompName =selectcomppage.WBWDropdownDeatils();
		System.out.println(WBWCompName+ " Company is Present");
		
		String WVRAPCompName =selectcomppage.WVRAPDropdownDeatils();
		System.out.println(WVRAPCompName+ " Company is Present");
		
	}
	
	
	
//	@Test(priority=1)
//	public void ValidateWVRinCompanyListTest() throws Exception{
//		wvrcomppage = selectcomppage.WVRLogin();
//		System.out.println("WVR Entity Login is Successfull");
//	}
//	
//	
//	@Test(priority=2)
//	public void ValidateWBWinCompanyListTest() throws Exception{
//		wbwcomppage = selectcomppage.WBWLogin();
//		System.out.println("WBW Entity Login is Successfull");
//	}
//	
//	@Test(priority=3)
//	public void ValidateWVRAPinCompanyListTest() throws Exception{
//		wvrapcomppage = selectcomppage.WVRAPLogin();
//		System.out.println("WVRAP Entity Login is Successfull");
//	}
//	
//	
	
	//@AfterMethod
	@AfterClass
	public void teardown(){
		driver.quit();
	}
	

}
