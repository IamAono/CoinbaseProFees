package com.example.spingbootformsubmission;

public class Transaction {
	
	private String makerTaker;
	private String buySell;
	private double amount;
	
	public String getMakerTaker() {
		return makerTaker;
	}
	
	public String getBuySell() {
		return buySell;
	}
	
	public double getAmount() {
		return amount;
	}
	
	public void setMakerTaker(String mt) {
		makerTaker = mt;
	}
	
	public void setBuySell(String bs) {
		buySell = bs;
	}
	
	public void setAmount(double a) {
		amount = a;
	}
	
}
