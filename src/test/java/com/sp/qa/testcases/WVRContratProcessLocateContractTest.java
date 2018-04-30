package com.sp.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.sp.qa.pages.ContratProcessLocateContractPage;
import com.sp.qa.pages.LoginPage;
import com.sp.qa.pages.SelectCompanyPage;
import com.sp.qa.pages.WVRCompanyPage;
import com.sp.qa.pages.WVRcontProsCustInfoPage;
import com.sp.qa.testbase.TestBase;

public class WVRContratProcessLocateContractTest extends TestBase{
	
	LoginPage loginpage;
	SelectCompanyPage selectcompage;
	WVRCompanyPage wvrcomppage;
	ContratProcessLocateContractPage contprocess;
	WVRcontProsCustInfoPage  custoInfoPage;
	
	
	
	public WVRContratProcessLocateContractTest(){
		super();
		
	}
	
	@BeforeMethod
	public void setup() throws Exception{
		initialization();
		loginpage= new LoginPage();
		selectcompage = new SelectCompanyPage();
		wvrcomppage = new WVRCompanyPage();
		contprocess = new ContratProcessLocateContractPage();
		selectcompage= loginpage.loginvalidation(prob.getProperty("username"), prob.getProperty("password"));
		wvrcomppage= selectcompage.WVRLogin();	
		contprocess=wvrcomppage.selectNewContract();
		
//		selectcompage.WVRLogin();	
//		 wvrcomppage.selectNewContract();
		
	}
	
	
	@Test
	public void enterCRSno(){
		custoInfoPage = contprocess.entercrsno(prob.getProperty("WVR_CRS_NO"));
		
	}
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
	
	
	
	

}
