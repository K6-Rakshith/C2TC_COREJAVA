package com.cg.moneybank.application;

import com.cg.moneybank.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	
	private static final float MINBAL=1000.0f;
	
	public MMSavingAcc(Integer accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
	}

	public void withdraw (float accBal){
		System.out.println("Current Balance:" + accBal);
		
	}

	@Override
	public String toString() {
		return "MMSavingAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	

}
