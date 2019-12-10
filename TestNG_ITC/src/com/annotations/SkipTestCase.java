package com.annotations;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class SkipTestCase {
	@Test(priority=1)
	public void login(){
		//selenium code to Login
		System.out.println("Login");
	}
	@Test(priority=2)//,enabled=false)
	public void composemail(){
		//selenium code to composemail
		//System.out.println("composemail");
		throw new SkipException("Reason for skipping testCase");
	}
	
	@Test(priority=3)
	public void Savemail(){
		//selenium code to Savemail
		System.out.println("Savemail");
	}
}
