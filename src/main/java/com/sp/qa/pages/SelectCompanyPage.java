package com.sp.qa.pages;



import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sp.qa.testbase.TestBase;
import com.sp.qa.util.TestUtil;

public class SelectCompanyPage extends TestBase {
	
	
	@FindBy (xpath="//*[@class ='Location Verification']")
	WebElement pageHeader;
	
	@FindBy (id="companyList")
	WebElement companyList;
	
	@FindBy (xpath="//input[@name='ok']")
	WebElement okbtn;
	
	@FindBy (xpath="//input[@name='logoff']")
	WebElement logoffbtn;
	
	@FindBy (id="entityName")
	WebElement siteLocation;
	
	
	
	public SelectCompanyPage(){
		PageFactory.initElements(driver, this);
	}
	

	public int countTheNoOfCompany() throws Exception{
		Select companyDropDown = new Select(companyList);
		List<WebElement> Companycount = companyDropDown.getOptions();
		int totalCompCount = Companycount.size();
		
		for(int i=0; i<totalCompCount; i++){
			companyDropDown.selectByIndex(i);
			Thread.sleep(2000);
			System.out.println(Companycount.get(i).getText());
		}
		
		return totalCompCount;
	}
	
	
	
	public String WVRDropdownDeatils() throws Exception{
		Select companyDropDown1 = new Select(companyList);
		List<WebElement> wvrno = companyDropDown1.getOptions();
		String WVRCompany = wvrno.get(1).getText();
		companyList.click();
		Thread.sleep(1000);
		companyDropDown1.selectByValue("001");
		Thread.sleep(3000);
		System.out.println(siteLocation.getText());
		return WVRCompany;
	}
	
	
	
	public String WBWDropdownDeatils() throws Exception{
		Select companyDropDown2 = new Select(companyList);
		List<WebElement> wbwno = companyDropDown2.getOptions();
		String WBWCompany = wbwno.get(0).getText();
		companyList.click();
		Thread.sleep(1000);
		companyDropDown2.selectByValue("000");
		Thread.sleep(3000);
		System.out.println(siteLocation.getText());
		return WBWCompany;
		
	}
	
	
	
	public String WVRAPDropdownDeatils() throws Exception{
		Select companyDropDown3 = new Select(companyList);
		List<WebElement> wvrapno = companyDropDown3.getOptions();
		String WVRAPCompany = wvrapno.get(2).getText();
		companyList.click();
		Thread.sleep(1000);
		companyDropDown3.selectByValue("002");
		Thread.sleep(3000);
		System.out.println(siteLocation.getText());
		return WVRAPCompany;
	}
	
	
	
	
	
	
	
	
	public WVRCompanyPage WVRLogin() throws Exception{
		Select companyDropDown1 = new Select(companyList);
		companyList.click();
		Thread.sleep(1000);
		companyDropDown1.selectByValue("000");
		Thread.sleep(3000);
		System.out.println(siteLocation.getText());
		okbtn.click();
		Thread.sleep(2000);
		TestUtil.closealert();
		return new WVRCompanyPage();
		
	}
	
	
	public WBWCompanyPage WBWLogin() throws Exception{
		Select companyDropDown2 = new Select(companyList);
		companyList.click();
		Thread.sleep(1000);
		companyDropDown2.selectByValue("001");
		Thread.sleep(3000);
		System.out.println(siteLocation.getText());
		okbtn.click();
		Thread.sleep(2000);
		TestUtil.closealert();
		return new WBWCompanyPage();
		
	}
	
	
	public WVRAPCompanyPage WVRAPLogin() throws Exception{
		Select companyDropDown3 = new Select(companyList);
		companyList.click();
		Thread.sleep(1000);
		companyDropDown3.selectByValue("002");
		Thread.sleep(3000);
		System.out.println(siteLocation.getText());
		okbtn.click();
		Thread.sleep(2000);
		TestUtil.closealert();
		return new WVRAPCompanyPage();
		
	}
	
	
	
	
	
	
}
