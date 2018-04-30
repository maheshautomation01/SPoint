package com.sp.qa.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.sp.qa.testbase.TestBase;
import com.sp.qa.util.TestUtil;

public class WVRCompanyPage extends TestBase {
	
	@FindBy (xpath="//*[@class ='middle']")
	WebElement contracttab;
	
	
	public WVRCompanyPage(){
		PageFactory.initElements(driver, this);
	}
	
		
	
	public String selectcontact() throws Exception{
		contracttab.click();
		String contName = contracttab.getText();
		//System.out.println(contName);
		return contName;

	}

	public ContratProcessLocateContractPage selectNewContract() throws Exception{
		contracttab.click();
		// To select the menu based on KEYBOARD input
		TestUtil.selectNewContractmenu();
		return new ContratProcessLocateContractPage();
	}
	
	
	
	public void selectEditContract() throws Exception{
		contracttab.click();
		// To select the menu based on KEYBOARD input
		TestUtil.selectEditContractmenu();

	}
	
	
	
	public void selectViewContract() throws Exception{
		contracttab.click();
		// To select the menu based on KEYBOARD input
		TestUtil.selectViewContractmenu();

	}
	

}
