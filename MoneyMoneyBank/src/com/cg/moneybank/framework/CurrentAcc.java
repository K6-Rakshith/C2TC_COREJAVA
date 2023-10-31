package com.cg.moneybank.framework;

public abstract class CurrentAcc extends BankAcc {
	
	private final float creditLimit;
	
	
	
	public CurrentAcc(Integer accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	
	

	public float getCreditLimit() {
		return creditLimit;
	}



	public void withdraw(float creditLimit) {
		System.out.println("Amount:" + creditLimit);
		
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + "]";
	}
	
	

}
