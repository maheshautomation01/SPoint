package com.sp.qa.testcases;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sp.qa.util.ExcelReader;

public class ArrayTest {
	//ExcelReader ExRead = new ExcelReader();
	
	@Test(dataProvider="ExceldataRead")
	public void ShowExceldata(String a, String b,String c,String d,String e,String f,String g,String h,String i,String j,String k,String l,String m,String n,String o,String p,String q,String r){
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
	}
	
	
	
	@DataProvider
	public Object[][] ExceldataRead() throws Exception{
		Object data[][]=ExcelReader.dataread("C:\\Users\\C20222\\Desktop\\TestData\\Sample_200_Address_List.xlsx", "USA_Address");
		return data;
		
		
	}

}
