package com.annotations;

import org.testng.annotations.DataProvider;

import xls.ShineXlsReader;

public class DataPool {

	@DataProvider
	public Object[][] getdata1(){
		Object obj[][]=new Object[3][2];
		
		obj[0][0]="Name1";
		obj[0][1]="Pwd1";
		
		obj[1][0]="Name2";
		obj[1][1]="Pwd2";
		
		obj[2][0]="Name3";
		obj[2][1]="Pwd3";
		
		return obj;
	}
	
	@DataProvider
	public Object[][] getdata2(){
		ShineXlsReader xls=new ShineXlsReader("TestData.xlsx");
		int rcount = xls.getRowCount("Sheet1");
		int ccount = xls.getColumnCount("Sheet1");
		Object obj[][]=new Object[rcount-1][ccount];
		for( int i=2;i<=rcount;i++){
			for( int j=0;j<ccount;j++){
				obj[i-2][j]=xls.getCellData("Sheet1", j, i); 
			}
		}
		return obj;
			}
}
