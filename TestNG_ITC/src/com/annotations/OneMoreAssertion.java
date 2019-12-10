package com.annotations;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class OneMoreAssertion {
	@Test
	public void testCase1(){
		SoftAssert st=new SoftAssert();
		String expstr="Bangalore";
		String actstr="Bengaluru";
		System.out.println("A");
		if(!expstr.equals(actstr)){
			st.fail("strings are mis-matching");
		}
		System.out.println("B");
		
		st.assertAll();
}
}