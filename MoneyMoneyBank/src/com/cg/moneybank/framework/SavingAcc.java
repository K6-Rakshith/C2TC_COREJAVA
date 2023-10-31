package com.cg.moneybank.framework;

public abstract class SavingAcc extends BankAcc {
	
	private boolean isSalary;
	private static final float MINBAL=1000.0f; 
	
	
	
	public SavingAcc(Integer accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal);
		this.isSalary = isSalary;
	}

	public void withdraw(float accBal) {
		System.out.println("Amount:" + accBal);
		
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + "]";
	}
	

}

