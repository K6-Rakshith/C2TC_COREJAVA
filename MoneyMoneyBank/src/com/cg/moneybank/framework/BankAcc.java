package com.cg.moneybank.framework;

public abstract class BankAcc {
	
	private Integer accNo;
	private String accNm;
	private float accBal;
	
	
	
	public BankAcc(Integer accNo, String accNm, float accBal) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	public void withdraw(float accBal) {
		System.out.println("Amount after withdraw:" + accBal);
		
	}
	public void deposite(float accBal) {
		System.out.println("Amount is deposited:" + accBal);
		
	}
	
	
	public Integer getAccNo() {
		return accNo;
	}
	public void setAccNo(Integer accNo) {
		this.accNo = accNo;
	}
	public String getAccNm() {
		return accNm;
	}
	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}
	public float getAccBal() {
		return accBal;
	}
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}
	
	

}
