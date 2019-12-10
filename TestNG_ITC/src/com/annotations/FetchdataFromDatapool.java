package com.annotations;

import org.testng.annotations.Test;

public class FetchdataFromDatapool {

	@Test(dataProviderClass=DataPool.class,dataProvider="getdata2")
	public void testCase1(String cname,String cpwd){
		//selenium code to login 
		System.out.println(cname+"   password is "+cpwd);
		}
}
