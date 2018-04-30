package com.sp.qa.testcases;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Array_TTTTT {

	
	static XSSFWorkbook book;
	static XSSFSheet sheet;
	static XSSFRow row;
	static XSSFCell cell;
	static Object[][] data;
	
	public static void main(String[] args) throws Exception {
		


		Object[][] arrayvalue = Array_TTTTT.dataread("C:\\Users\\C20222\\Desktop\\TestData\\Sample_200_Address_List.xlsx", "USA_Address");

		System.out.println("Arrayvalue is: "+arrayvalue.length);
		
		
	}
	
	
	public static Object[][] dataread(String filename, String sheetname) throws Exception{
		
		
		FileInputStream fip = new FileInputStream(filename);
		book = new XSSFWorkbook(fip);
		sheet = book.getSheet(sheetname);
		int rowcount = sheet.getLastRowNum();
		System.out.println(rowcount);
		int columncount = sheet.getRow(0).getLastCellNum();
		//System.out.println(columncount);
		data = new Object[rowcount][columncount];
		//System.out.println(data.length);
		for(int i=1;i<rowcount;i++){
			for(int j=0;j<columncount;j++){
				if(j==0){
					System.out.println("PO_ADDR1--->"+ sheet.getRow(i).getCell(j).toString());	
				}
				if(j==1){
					System.out.println("PO_ADDR2--->"+ sheet.getRow(i).getCell(j).toString());	
				}
				if(j==2){
					System.out.println("PO_ADDR3--->"+ sheet.getRow(i).getCell(j).toString());	
				}
				if(j==3){
					System.out.println("PO_CITY--->"+ sheet.getRow(i).getCell(j).toString());	
				}
				if(j==4){
					System.out.println("PO_STATE_PROVINCE--->"+ sheet.getRow(i).getCell(j).toString());	
				}
				if(j==5){
					System.out.println("PO_COUNTY--->"+ sheet.getRow(i).getCell(j).toString());	
				}
				if(j==6){
					System.out.println("PO_COUNTRY_CD--->"+ sheet.getRow(i).getCell(j).toString());	
				}
				if(j==7){
					System.out.println("PO_POSTAL_CODE--->"+ sheet.getRow(i).getCell(j).toString()+ "\n" + "----------------------------");	
				}
				data[i][j]= sheet.getRow(i).getCell(j).toString();
				
			}
			
			
		}
	
		
		return data;
		
	}
	
	
	
	

}
