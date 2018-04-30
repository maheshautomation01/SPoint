package com.sp.qa.testcases;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;








import com.sp.qa.pages.LoginPage;
import com.sp.qa.pages.SelectCompanyPage;
import com.sp.qa.testbase.TestBase;

public class LoginPageTest extends TestBase{
	
	
	LoginPage loginPage;
	SelectCompanyPage selectcomp;
	
	public LoginPageTest(){
		super();
	}
	
	
	@BeforeMethod
	
	public void setup() throws Exception{
		initialization();
		loginPage = new LoginPage();
		selectcomp= new SelectCompanyPage();
			
	}
	
	
	@Test(priority=1)
	public void ValidateLoginPageTitleTest(){
		String PageTitle = loginPage.validateLoginPageTitle();
		System.out.println(PageTitle);
		Boolean logo =loginPage.validateLogo();
		if(logo.TRUE){
		System.out.println("WVO Logo is Present in the Page");
		}else{
			System.out.println("WVO Logo is NOT Present in the Page");
		}
	}
	
	
	@Test(priority=2)
	public void ValidateloginTest() throws Exception{
		selectcomp = loginPage.loginvalidation(prob.getProperty("username"), prob.getProperty("password"));
		
	}
	
		
	@AfterMethod
	
	public void teardown(){
		driver.quit();
	}
	

}
