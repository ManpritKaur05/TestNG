package com.annotations;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import xls.ShineXlsReader;

public class ParamWithExcel {
	@Test(dataProvider="getdata")
	public void testCase1(String cname,String cdesc,String cradio){
		//selenium code for a page where we need to pass data
		System.out.println(cname +" description is "+cdesc+" its radio button is "+cradio);
	}
	@DataProvider
	public Object[][] getdata(){
		ShineXlsReader xls=new ShineXlsReader("DataPool.xlsx");
		int rcount = xls.getRowCount("Test1");
		int ccount = xls.getColumnCount("Test1");
		Object obj[][]=new Object[rcount-1][ccount];
		for( int i=2;i<=rcount;i++){
			for( int j=0;j<ccount;j++){
				obj[i-2][j]=xls.getCellData("Test1", j, i); 
			}
		}
		return obj;
		//xls.setCellData(sheetName, colName, rowNum, data)
		//xls.addSheet(sheetname);
		//xls.addColumn(sheetName, colName)
	}
}
