package com.sp.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sp.qa.pages.ContratProcessLocateContractPage;
import com.sp.qa.pages.LoginPage;
import com.sp.qa.pages.SelectCompanyPage;
import com.sp.qa.pages.WVRCompanyPage;
import com.sp.qa.pages.WVRPrimeOwnerPage;
import com.sp.qa.pages.WVRcontProsCustInfoPage;
import com.sp.qa.testbase.TestBase;
import com.sp.qa.util.ExcelReader;

public class WVRcontProsCustInfoTest extends TestBase{
	
	LoginPage loginpage;
	SelectCompanyPage selectcompage;
	WVRCompanyPage wvrcomppage;
	ContratProcessLocateContractPage contprocess;
	WVRcontProsCustInfoPage custoInfoPage;
	WVRPrimeOwnerPage wvrprimepage;
	
	
	public WVRcontProsCustInfoTest(){
		super();
		
	}
	
	@BeforeMethod
	public void setup() throws Exception{
		initialization();
		loginpage		 = new LoginPage();
		selectcompage	 = new SelectCompanyPage();
		wvrcomppage		 = new WVRCompanyPage();
		contprocess 	= new ContratProcessLocateContractPage();
		custoInfoPage 	= new WVRcontProsCustInfoPage();
		wvrprimepage 	= new WVRPrimeOwnerPage();
		selectcompage	= loginpage.loginvalidation(prob.getProperty("username"), prob.getProperty("password"));
		wvrcomppage		= selectcompage.WVRLogin();	
		contprocess		=wvrcomppage.selectNewContract();
//		selectcompage.WVRLogin();	
//		wvrcomppage.selectNewContract();
		custoInfoPage = contprocess.entercrsno(prob.getProperty("WVR_CRS_NO"));
	}
	
	
	
	@Test(dataProvider="ExceldataRead")
	public void ValidateWVRContractCreationTest(String a, String b,String c,String d,String e,String f,String g,String h,String i,String j,String k,String l,String m,String n,String o,String p,String q,String r){
		
		custoInfoPage.enterspname(a);
		custoInfoPage.entermemberno();
		custoInfoPage.enterssn(b);
		custoInfoPage.entercompname(c);
		custoInfoPage.enterscore("600");
		custoInfoPage.enterfirstname(d);
		custoInfoPage.enterlastname(e);
		custoInfoPage.enteradd1(k);
		custoInfoPage.enteradd2(l);
		custoInfoPage.enteradd2(m);
		custoInfoPage.entercity(n);
		custoInfoPage.enterstate(o);
		custoInfoPage.enterpostcode(r);
		custoInfoPage.entercountry(q);
		custoInfoPage.enterhphone(f);
		custoInfoPage.enterwphone(g);
		custoInfoPage.enterdatedetails(h);
		custoInfoPage.selectsexradiobtn(i);
		custoInfoPage.enterinformalname("Name");
		custoInfoPage.enterinhouse2();
		custoInfoPage.entersaletype1();
//		custoInfoPage.enterpodiumsale2();
		custoInfoPage.entersolicited2();
		custoInfoPage.enterreservationcode(j);
		custoInfoPage.entersolicatedstate(o);
		//wvrprimepage= custoInfoPage.savecutomeradd();
	}
	
	
	
	@DataProvider
	public Object[][] ExceldataRead() throws Exception{
		Object data[][]=ExcelReader.dataread("C:\\Users\\C20222\\Desktop\\TestData\\Sample_200_Address_List.xlsx", "USA_Address");
		return data;
		
		
	}

	
	
	
	
	@AfterMethod
	public void teardown(){
		driver.quit();
	}
	
	

}
