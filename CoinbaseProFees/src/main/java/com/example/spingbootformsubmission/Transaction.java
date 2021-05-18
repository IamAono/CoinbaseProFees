package com.example.spingbootformsubmission;

public class Transaction {
	
	private String makerTaker;
	private String buySell;
	private double amount;
	
	public String getMT() {
		return makerTaker;
	}
	
	public String getBS() {
		return buySell;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setMT(String mt) {
		makerTaker = mt;
	}
	
	public void setBS(String bs) {
		buySell = bs;
	}
	
	public void setAmount(double a) {
		amount = a;
	}
}
