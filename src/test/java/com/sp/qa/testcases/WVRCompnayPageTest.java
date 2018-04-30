package com.sp.qa.testcases;



import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sp.qa.pages.ContratProcessLocateContractPage;
import com.sp.qa.pages.LoginPage;
import com.sp.qa.pages.SelectCompanyPage;
import com.sp.qa.pages.WVRCompanyPage;
import com.sp.qa.testbase.TestBase;

public class WVRCompnayPageTest extends TestBase {
	
	LoginPage loginpage;
	SelectCompanyPage selectcomppage;
	WVRCompanyPage wvrcomppage;
	ContratProcessLocateContractPage contprocess;
	
	
	public WVRCompnayPageTest(){
		super();
	}

	
	@BeforeMethod
	public void setup() throws Exception{
		initialization();
		loginpage= new LoginPage();
		selectcomppage = new SelectCompanyPage();
		wvrcomppage = new WVRCompanyPage();
		contprocess= new ContratProcessLocateContractPage();
		selectcomppage= loginpage.loginvalidation(prob.getProperty("username"), prob.getProperty("password"));
		wvrcomppage= selectcomppage.WVRLogin();	
		
	}
	
	
//	@Test
//	public void ClickContracttab() throws Exception{
//		String MainTabName = wvrcomppage.selectcontact();
//		Assert.assertEquals(MainTabName, "Contracts", "The Main Contract tab name is not correct");
//				
//	}
	
	@Test(priority=1)
	public void CreateNewContract() throws Exception{
		String MainTabName = wvrcomppage.selectcontact();
		Assert.assertEquals(MainTabName, "Contracts", "The Main Contract tab name is not correct");
		contprocess=wvrcomppage.selectNewContract();
				
	}
	
	@Test(priority=2)
	public void EditContract() throws Exception{
		wvrcomppage.selectEditContract();
				
	}
	
	
	@Test(priority=3)
	public void ViewContract() throws Exception{
		wvrcomppage.selectViewContract();
				
	}
	
	
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
	
	
	
	
}
