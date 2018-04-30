package com.sp.qa.testcases;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.sp.qa.testbase.TestBase;
import com.sp.qa.util.ExcelReader;


public class tEST extends TestBase {
	
	
	
	public tEST(){
		super();
	}
	//public static WebDriver driver;

	
	
//	public static void main(String[] args) {
//
//	
//		System.out.println(System.getProperty("User.dir"));
//		
//		System.setProperty("webdriver.chrome.driver", "C:\\Mahesh- WVO\\Automation\\Selenium\\Jar Files\\chromedriver_win32\\chromedriver.exe");
//				driver = new ChromeDriver();
//			
//		
//			driver.manage().window().maximize();
//			driver.manage().deleteAllCookies();
//			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//			driver.get("http://d-vmc155.wst.corproot.com:9080/webapp/ccis/logout.action");
//			driver.findElement(By.name("j_username")).sendKeys("SPTEST13");
//			driver.findElement(By.name("j_password")).sendKeys("Welcome@123");
//			driver.findElement(By.name("logon")).click();
//			driver.findElement(By.name("ok")).click();
//			
//			
//			
//		
//		}	
//		
	@Test
	public void showcontractno() throws Exception{
		String contractno = ExcelReader.getContractNo();
		String Ownerno = ExcelReader.getOwnerNo();
		
		System.out.println("The ContractNo is :"+ contractno + "  <----- & ----> The OwnerNo is :"+Ownerno);
	}
	
	
	
}



