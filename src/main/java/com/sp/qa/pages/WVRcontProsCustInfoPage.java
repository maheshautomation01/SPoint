package com.sp.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.sp.qa.testbase.TestBase;
import com.sp.qa.util.DateMonthYearSplit;

public class WVRcontProsCustInfoPage extends TestBase{
	
	@FindBy (name="non_title_holding_spouse")
	WebElement spousetxt;
	
	@FindBy (name="ssn")
	WebElement ssntxt;
	
	@FindBy (name="fico")
	WebElement beconscoretxt;
	
	@FindBy (name="memberNumber")
	WebElement membernotxt;
	
	@FindBy (name="company_name")
	WebElement companytxt;
	
	@FindBy (name="first_name")
	WebElement firstnametxt;
	
	@FindBy (name="last_name")
	WebElement lastnametxt;
	
	@FindBy (name="address1")
	WebElement address1txt;
	
	@FindBy (name="address2")
	WebElement address2txt;
	
	@FindBy (name="city")
	WebElement citytxt;
	
	@FindBy (name="state")
	WebElement statedropdown;
	
	@FindBy (xpath="//input[@name='postalCode']")
	WebElement postalcodetxt;
	
	@FindBy (name="country")
	WebElement countrytxt;
	
	@FindBy (name="home_phone")
	WebElement homephonetxt;
	
	@FindBy (name="work_phone")
	WebElement workphonetxt;
	
	@FindBy (name="emailAddress")
	WebElement emailtxt;
	
	@FindBy (name="dobmonth")
	WebElement monthdropdown;
	
	@FindBy (name="dobday")
	WebElement daydropdown;
	
	@FindBy (name="dobyear")
	WebElement yeardropdown;
	
	@FindBy (xpath="//input[@name='sex' and @value='M']")
	WebElement maleradiobtn;
	
	@FindBy (xpath="//input[@name='sex' and @value='F']")
	WebElement femaleradiobtn;
	
	@FindBy (name="informal_name")
	WebElement informal_nametxt;
	
	@FindBy (xpath="//input[@name='inHouse' and @value='yes']")
	WebElement inhous1radiobtn;
	
	@FindBy (xpath="//input[@name='inHouse' and @value='no']")
	WebElement inhouse2radiobtn;
	
	@FindBy (xpath="//input[@name='fvl_saleType' and @value='I']")
	WebElement inhousSaletype1eradiobtn;
	
	@FindBy (xpath="//input[@name='fvl_saleType' and @value='M']")
	WebElement inhousSaletype2eradiobtn;
	
	@FindBy (xpath="//input[@name='fvl_saleType' and @value='E']")
	WebElement inhousSaletype3eradiobtn;
	
	@FindBy (xpath="//input[@name='fvl_podiumSale' and @value='Y']")
	WebElement podiumsale1radiobtn;
	
	@FindBy (xpath="//input[@name='fvl_podiumSale' and @value='N']")
	WebElement podiumsale2radiobtn;
	
	@FindBy (xpath="//input[@name='solicited' and @value='yes']")
	WebElement solicited1radiobtn;
	
	@FindBy (xpath="//input[@name='solicited' and @value='no']")
	WebElement solicited2radiobtn;
	
	@FindBy (name="reservation_code")
	WebElement reservationtxt;
	
	@FindBy (name="solicitedState")
	WebElement solicitedStatedropdown;
	
	@FindBy (xpath="//input[@value='Next']")
	WebElement nextbtn;
	
	
	
	public WVRcontProsCustInfoPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	public void enterspname(String spname){
		spousetxt.sendKeys(spname);
	}
	
	public void enterssn(String ssn){
		ssntxt.sendKeys(ssn);
	}
	
	public void enterscore(String score){
		beconscoretxt.sendKeys(score);
	}
	
	public void entermemberno(){
		membernotxt.clear();
	}
	
	public void entercompname(String compname){
		companytxt.sendKeys(compname);
	}
	
	public void enterfirstname(String firstname){
		firstnametxt.sendKeys(firstname);
	}
	
	public void enterlastname(String lastname){
		lastnametxt.sendKeys(lastname);
	}
	
	public void enteradd1(String add1){
		address1txt.sendKeys(add1);
	}
	
	public void enteradd2(String add2){
		address2txt.sendKeys(add2);
	}
	
	public void entercity(String city){
		citytxt.sendKeys(city);
	}
	
	public void enterstate(String state){
		//statedropdown.sendKeys(state);
		
		Select stateval= new Select(statedropdown);
		stateval.selectByVisibleText(state);
	}
	
	public void enterpostcode(String postcode){
		postalcodetxt.sendKeys(postcode);
	}

	
	public void entercountry(String country){
		countrytxt.sendKeys(country);
	}
	
	public void enterhphone(String hphone){
		homephonetxt.sendKeys(hphone);
	}
	
	public void enterwphone(String wphone){
		workphonetxt.sendKeys(wphone);
	}
	
	public void enteremail(String email){
		workphonetxt.sendKeys(email);
	}
	
	public void enterdatedetails(String mmddyyyy){
		String[] datevalue =DateMonthYearSplit.getMMDDYYYvalue(mmddyyyy);	
		Select month  = new Select(monthdropdown);
		System.out.println(datevalue[0]);
		monthdropdown.click();
		month.selectByValue(datevalue[0]);
		
		
		Select day  = new Select(daydropdown);
		System.out.println(datevalue[1]);
		daydropdown.click();
		day.selectByValue(datevalue[1]);
		
		
		Select year  = new Select(yeardropdown);
		System.out.println(datevalue[2]);
		yeardropdown.click();
		year.selectByValue(datevalue[2]);
//		
//		
//		daydropdown.sendKeys(datevalue[1]);
//		monthdropdown.sendKeys(datevalue[0]);
//		yeardropdown.sendKeys(datevalue[2]);
	}
	
//	public void enterday(String date){
//		String[] datevalue =DateMonthYearSplit.getMMDDYYYvalue(date);	
//		daydropdown.sendKeys(datevalue[1]);
//	}
//	
//	public void enteryear(String year){
//		yeardropdown.sendKeys(year);
//	}
	
	public void selectsexradiobtn(String male){
		if(male.equals("Male")){
			maleradiobtn.click();
		}else if(male.equals("Female")){
			femaleradiobtn.click();
		}
		
	}
	
	public void enterinformalname(String infname){
		informal_nametxt.sendKeys(infname);
	}
	
//	public void enterinhouse1(String yes){
//		inhous1radiobtn.sendKeys(yes);
//	}
//	
	public void enterinhouse2(){
		inhouse2radiobtn.click();;
	}
	
	
	public void entersaletype1(){
		inhousSaletype1eradiobtn.click();
	}
	
//	public void entersaletype2(String mainline){
//		inhousSaletype2eradiobtn.sendKeys(mainline);
//	}
//	
//	public void entersaletype3(String exitline){
//		inhousSaletype3eradiobtn.sendKeys(exitline);
//	}
	
//	public void enterpodiumsale1(){
//		podiumsale1radiobtn.click();
//	}
	
	public void enterpodiumsale2(){
		podiumsale2radiobtn.click();
	}
	
	
//	public void entersolicited1(){
//		solicited1radiobtn.sendKeys();
//	}
	
	public void entersolicited2(){
		solicited2radiobtn.click();
	}
	
	public void enterreservationcode(String code){
		reservationtxt.sendKeys(code);
	}
	
	public void entersolicatedstate(String code){
		
		Select sstate= new Select(solicitedStatedropdown);
		sstate.selectByVisibleText(code);
		//solicitedStatedropdown.sendKeys(code);
	}
	
	
	
	public WVRPrimeOwnerPage savecutomeradd(){
		nextbtn.click();
		return new WVRPrimeOwnerPage();
		
		
	}
	
	
	

}
