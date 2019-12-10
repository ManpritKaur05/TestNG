package com.annotations;

import org.testng.annotations.Test;

public class Order {
	@Test(priority=1)
	public void login(){
		//selenium code to Login
		System.out.println("Login");
	}
	@Test(priority=2)
	public void composemail(){
		//selenium code to composemail
		System.out.println("composemail");
	}
	
	@Test(priority=3)
	public void Savemail(){
		//selenium code to Savemail
		System.out.println("Savemail");
	}
}
