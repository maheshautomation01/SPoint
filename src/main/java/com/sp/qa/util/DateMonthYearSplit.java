package com.sp.qa.util;


import com.sp.qa.testbase.TestBase;

public class DateMonthYearSplit extends TestBase{
	
	
	
	
	
	public static String[] getMMDDYYYvalue(String dateVALUE){
		 String[] out = dateVALUE.split("/");
//		 System.out.println("Year = " + out[2]);
//		 System.out.println("Month = " + out[0]);
//		 System.out.println("Day = " + out[1]);
		 return out;
		
	}
	

}
