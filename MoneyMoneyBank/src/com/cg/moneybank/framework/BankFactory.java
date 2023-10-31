package com.cg.moneybank.framework;

public abstract class BankFactory {
	
	public abstract SavingAcc getNewSavingAccount(Integer AccNo, String accNm, float accBal, boolean isSalaried);
	public abstract CurrentAcc getNewCurrentAccount(Integer AccNo, String accNm, float accBal, float creditLimit); 

}
