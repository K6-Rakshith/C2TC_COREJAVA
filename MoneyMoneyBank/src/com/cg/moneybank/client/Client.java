package com.cg.moneybank.client;

import com.cg.moneybank.application.MMBankFactory;
import com.cg.moneybank.application.MMSavingAcc;
import com.cg.moneybank.framework.BankFactory;
import com.cg.moneybank.framework.SavingAcc;
import com.cg.moneybank.framework.CurrentAcc;
import com.cg.moneybank.application.MMCurrentAcc;


public class Client {

	public static void main(String[] args) {
		BankFactory bf= new MMBankFactory();
		
		
		SavingAcc sa = new MMSavingAcc(1, "Atom", 5000, true); 
		sa.withdraw(sa.getAccBal());
		sa.toString();
		
		
		CurrentAcc ca = new MMCurrentAcc(2, "Zeus", 1000, 0);
		ca.withdraw(ca.getAccBal());
		ca.toString();
		

	}

}
