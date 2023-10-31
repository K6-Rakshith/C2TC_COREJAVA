package com.cg.moneybank.application;

import com.cg.moneybank.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc {
	
	
	
	public MMCurrentAcc(Integer accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
		// TODO Auto-generated constructor stub
	}



	public void withdraw(float creditLimit){
		System.out.println("You have exchausted your limit:" + creditLimit);
		
	}



	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	
}
